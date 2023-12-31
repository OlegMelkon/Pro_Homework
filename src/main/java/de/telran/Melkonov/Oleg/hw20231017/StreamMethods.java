package de.telran.Melkonov.Oleg.hw20231017;

import java.io.*;

public class StreamMethods {
    public static void main(String[] args) throws IOException {
        File fileString = new File("C:/Java Kurs/Java/Professional/string.txt");
        if (fileString.createNewFile()) System.out.println("File has been created!");
        else System.out.println("File already exists!");

        try (Reader reader = new FileReader("C:/Java Kurs/Java/Professional/matches.txt");
             Writer writer = new FileWriter("C:/Java Kurs/Java/Professional/string.txt")
        ) {
            while (reader.ready()) {
                char current = (char) reader.read();
                System.out.print(current);
                writer.append(current);
                if (current == '\n') {
                    return;
                }

            }

        }

    }
}
