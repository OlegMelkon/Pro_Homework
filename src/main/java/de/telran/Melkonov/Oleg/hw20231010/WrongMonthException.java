package de.telran.Melkonov.Oleg.hw20231010;

public class WrongMonthException extends Exception{
    private int month;

    public WrongMonthException(int month) {
        super("Такого месяца не существует!");
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
}
