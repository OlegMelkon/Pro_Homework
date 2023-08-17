package de.telran.Melkonov.Oleg.HW20230801;


public enum DayOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String toString() {
        return "The day of the week is " + name();
    }

    public static DayOfTheWeek[] list = DayOfTheWeek.values();

    public static DayOfTheWeek getCountry(int i) {
        return list[i];
    }

}
