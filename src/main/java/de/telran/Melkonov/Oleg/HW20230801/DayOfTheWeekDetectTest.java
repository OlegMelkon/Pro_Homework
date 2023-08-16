package de.telran.Melkonov.Oleg.HW20230801;

import java.util.Scanner;

public class DayOfTheWeekDetectTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorSwitchVersion detectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorArrayVersion detectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of the day of the week: ");
        int number = sc.nextInt();
        System.out.println(detectorIfVersion.detectDayName(number));
        System.out.println(detectorSwitchVersion.detectDayName(number));
        System.out.println(detectorArrayVersion.detectDayName(number));

        sc.close();
    }
}
