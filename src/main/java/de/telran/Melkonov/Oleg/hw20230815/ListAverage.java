package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in).useDelimiter("[\\s,;]+");
        int sum = 0;
        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            list.add(i, sc.nextInt());
            sum += list.get(i);
        }
        System.out.println(list);
        System.out.println("Среднее арифметическое равно " + (float)sum / 5);
        sc.close();
    }
}
