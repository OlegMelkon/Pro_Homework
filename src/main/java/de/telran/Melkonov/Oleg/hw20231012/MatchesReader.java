package de.telran.Melkonov.Oleg.hw20231012;

import Classes.lecture231012.MatchResult;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class MatchesReader {
    public static void main(String[] args) throws IOException {

        //Matches of FC Augsburg:
        File matchesAugsburgFile = new File("C:/Java Kurs/Java/Professional/FC Augsburg.txt");
        if (matchesAugsburgFile.createNewFile()) System.out.println("File has been created!");
        else System.out.println("File already exists!");

        ArrayList<Match> matchesAugsburg = (ArrayList<Match>) Files.lines(Paths.get("C:/Java Kurs/Java/Professional/matches.txt"))
                .map(Match::new)
                .filter(team -> team.firstTeam.equals("FC Augsburg") || team.secondTeam.equals("FC Augsburg"))
                .collect(Collectors.toList());
        for (Match match : matchesAugsburg)
            System.out.println(match);


        FileWriter writer = new FileWriter(matchesAugsburgFile);
        for(Match match : matchesAugsburg) {
            writer.write(match + System.lineSeparator());
        }
        writer.close();

        //Matches on Mercedes-Benz Arena:
        File matchesOnMercedesFile = new File("C:/Java Kurs/Java/Professional/Mercedes-Benz Arena.txt");
        if (matchesAugsburgFile.createNewFile()) System.out.println("File has been created!");
        else System.out.println("File already exists!");

        ArrayList<Match> matchesOnMercedes = (ArrayList<Match>) Files.lines(Paths.get("C:/Java Kurs/Java/Professional/matches.txt"))
                .map(Match::new)
                .filter(match -> match.stadium.contains("Mercedes-Benz"))
                .collect(Collectors.toList());
        for (Match matchMercedes : matchesOnMercedes)
            System.out.println(matchMercedes);

        FileWriter writerM = new FileWriter(matchesOnMercedesFile);
        for(Match matchM : matchesOnMercedes) {
            writerM.write(matchM + System.lineSeparator());
        }
        writerM.close();

        //Winners:
        File winnersFile = new File("C:/Java Kurs/Java/Professional/winners.txt");
        if (winnersFile.createNewFile()) System.out.println("File has been created!");
        else System.out.println("File already exists!");

        List<String> winners = Files.lines(Paths.get("C:/Java Kurs/Java/Professional/matches.txt"))
                .map(Match::new)
                .map(match -> {
                   if (match.firstTeamCount > match.secondTeamCount) return match.firstTeam;
                   else if (match.firstTeamCount < match.secondTeamCount) return match.secondTeam;
                   else return "Ничья!";
                })
                .collect(Collectors.toList());
        for (String matchWinner : winners)
            System.out.println(matchWinner);

        FileWriter writerW = new FileWriter(winnersFile);
        for(String w : winners) {
            writerW.write(w + System.lineSeparator());
        }
        writerW.close();

        //Each team result:
        File eachTeamResults = new File("C:/Java Kurs/Java/Professional/table.txt");
        if (eachTeamResults.createNewFile()) System.out.println("File has been created!");
        else System.out.println("File already exists!");

        List<String> listOfTeams = Files.lines(Paths.get("C:/Java Kurs/Java/Professional/matches.txt"))
                .map(Match::new)
                .map(result -> "First team: " + result.firstTeam + "; First team count: " + result.firstTeamCount
                        + "; Second team: " + result.secondTeam + "; Second team count: " + result.secondTeamCount)
                .collect(Collectors.toList());
        for (String team : listOfTeams)
            System.out.println(team);

        FileWriter writerRes = new FileWriter(eachTeamResults);
        for(String r : listOfTeams) {
            writerRes.write(r + System.lineSeparator());
        }
        writerW.close();

    }
}
