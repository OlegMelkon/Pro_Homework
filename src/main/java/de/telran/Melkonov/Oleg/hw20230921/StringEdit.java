package de.telran.Melkonov.Oleg.hw20230921;

import java.util.function.Function;

public class StringEdit {
    public static void main(String[] args) {
        String testString = "Computer";
        Function<String, String> stringAdd = str -> "Test".concat(str);
        Function<String, String> stringCut = str -> str.substring(4);
        Function<String, String> stringDot = str -> str.concat(".");
        Function<String, String> comboFunc = stringAdd.andThen(stringCut).andThen(stringDot);
        System.out.println(comboFunc.apply(testString));
    }
}
