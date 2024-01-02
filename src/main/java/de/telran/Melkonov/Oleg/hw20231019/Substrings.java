package de.telran.Melkonov.Oleg.hw20231019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substrings {
    public static void main(String[] args) {
        String text = "Carrot Collapse /\\ Criteria, Avatar. Sort][Cabbage";
        Pattern pattern1 = Pattern.compile("C.+t");
        Pattern pattern2 = Pattern.compile("C.+e");
        Matcher matcher1 = pattern1.matcher(text);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher1.find()) {
            System.out.println(text.substring(matcher1.start(), matcher1.end()));
        }
        while (matcher2.find()) {
            System.out.println(text.substring(matcher2.start(), matcher2.end()));
        }
    }
}
