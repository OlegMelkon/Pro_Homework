package de.telran.Melkonov.Oleg.hw20230808;

import Classes.Lecture230803.Color;

import java.util.Scanner;

public enum Alphabet {
    A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public static int searchIndex (Alphabet letter){
        Alphabet[] values = Alphabet.values();
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(letter)) index = values[i].ordinal();
            }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a letter: ");
        Alphabet l = Alphabet.valueOf(sc.next().toUpperCase());
        System.out.println(searchIndex(l));
        System.out.println(searchIndex(Alphabet.K));
        System.out.println(searchIndex(Alphabet.O));
        System.out.println(searchIndex(Alphabet.Z));

        sc.close();

    }
}
