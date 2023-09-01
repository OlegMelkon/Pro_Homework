package de.telran.Melkonov.Oleg.hw20230810;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = sc.nextDouble();
        System.out.println("Данное число + 5 = " + sumPrim(num));

        sc.close();
    }
    private static long sumPrim(double number){
        return (long)number + 5;
    }
}
