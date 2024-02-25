package de.telran.Melkonov.Oleg.hw20231116;

import java.util.*;

public class StrategyPatternExample {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Washington", "Beijing", "Moscow");
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Set dataSet = new TreeSet(comparator);
        dataSet.addAll(data);
        System.out.println("Dataset : " + dataSet);
    }
}
