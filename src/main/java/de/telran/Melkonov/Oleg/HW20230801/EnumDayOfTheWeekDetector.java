package de.telran.Melkonov.Oleg.HW20230801;

import java.util.Scanner;

public class EnumDayOfTheWeekDetector {
    public static void main(String[] args) {
        for (DayOfTheWeek value : DayOfTheWeek.values()) {
            System.out.println(value);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of the day of the week: ");
        int number = sc.nextInt();

        DayOfTheWeek day = DayOfTheWeek.getCountry(number - 1);
        System.out.println(day);

        sc.close();




    }
}
