package de.telran.Melkonov.Oleg.hw20231019;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class TwoWordsTeams {
    public static void main(String[] args) throws IOException {


        Files.lines(Paths.get("C:/Java Kurs/Java/Professional/matches.txt"))
                .map(matches ->
                {
                    String[] matchesArray = matches.split(",");
                    System.out.println("!!!!!" + matchesArray[3] + "!!!!!" + matchesArray[5]);

                    String team1 = matchesArray[3];
                    String[] words1 = team1.split(" ");
                    int l1 = words1.length;
                    for (int i = 0; i < l1; i++) System.out.println(i + ": " + words1[i]);


                    String team2 = matchesArray[5];
                    String[] words2 = team2.split(" ");
                    int l2 = words2.length;
                    for (int i = 0; i < l2; i++) System.out.println(i + ": " + words2[i]);

                    if (l1 == 3 && l2 == 3) return team1 + "  " + team2;
                    else if (l1 == 3 && l2 != 3) return team1;
                    else if (l1 != 3 && l2 == 3) return team2;
                    else return null;
                })
                .forEach(System.out::println);
    }
}
