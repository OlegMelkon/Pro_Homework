package de.telran.Melkonov.Oleg.hw20231019;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void main(String[] args) {
        String password;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        password = in.next();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$");
        System.out.println(pattern.matcher(password).matches());

    }
}
