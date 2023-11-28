package de.telran.Melkonov.Oleg.hw20231010;

public class WrongDayException extends Exception{
    private int day;

    public WrongDayException(int day) {
        super("Такого дня не существует!");
        this.day = day;
    }

    public int getDay() {
        return day;
    }
}
