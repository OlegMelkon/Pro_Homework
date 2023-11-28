package de.telran.Melkonov.Oleg.hw20231010;

public class DayMonthCheck {
    public static void main(String[] args) {
        try{
            DayInMonthValidator validator = new DayInMonthValidator(1, 15);
            System.out.println("Month: " + validator.getMonth() + ", Day: " + validator.getDay());
            validator.validate(12,3);
        } catch (WrongMonthException e1){
            throw new RuntimeException(e1);
        } catch (WrongDayException e2) {
            throw new RuntimeException(e2);
        }

    }
}
