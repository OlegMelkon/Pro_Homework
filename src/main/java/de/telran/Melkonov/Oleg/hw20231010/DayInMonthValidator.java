package de.telran.Melkonov.Oleg.hw20231010;

public class DayInMonthValidator {
    private int month;
    private int day;

    public DayInMonthValidator(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public static void validate(int month, int day) throws WrongMonthException, WrongDayException{
        if (month <= 0 || month > 12){
            throw new WrongMonthException(month);
        } else if(day <= 0){
            throw new WrongDayException(day);
        } else if(month == 2 && day > 28){
            throw new WrongDayException(day);
        } else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12
        && (day > 31)){
            throw new WrongDayException(day);
        } else if(day > 30){
            throw new WrongDayException(day);
        }
    }

}
