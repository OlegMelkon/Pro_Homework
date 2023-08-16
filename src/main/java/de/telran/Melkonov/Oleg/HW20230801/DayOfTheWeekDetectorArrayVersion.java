package de.telran.Melkonov.Oleg.HW20230801;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetectable {
    public String detectDayName(int number) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ((number >= 1) && (number <= 7)){
            return daysOfTheWeek[number-1];
        } else return "Please input a valid number between 1 and 7";

    }
}
