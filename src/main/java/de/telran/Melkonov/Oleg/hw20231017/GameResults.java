package de.telran.Melkonov.Oleg.hw20231017;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class GameResults {
    public static void main(String[] args) throws IOException {
        File fileMatch = new File("C:/Java Kurs/Java/Professional/result.txt");
        if (fileMatch.createNewFile()) {
            System.out.println("File has been created!");
            GameSaveResult newResult = new GameSaveResult();
            newResult.loseCounter = 0;
            newResult.winCounter = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name: ");
            newResult.name = sc.next();
            sc.close();
            Random random = new Random();
            boolean isWin = random.nextBoolean();
            System.out.println("Next random boolean value is : " + isWin);
            if (isWin == true) newResult.winCounter++;
            else newResult.loseCounter++;
            try {
                Writer writer = new FileWriter(fileMatch);
                writer.write(String.valueOf(newResult));
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("File already exists!");
            BufferedReader reader = new BufferedReader(new FileReader(fileMatch));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();

            }
        }



    }
}
