package de.telran.Melkonov.Oleg.hw20230905;

import java.util.*;

public class CatInfo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 1, "black", true);
        Cat cat2 = new Cat("Tim", 2, "white", false);
        Cat cat3 = new Cat("Jerry", 1, "yellow", true);
        Cat cat4 = new Cat("Stepan", 3, "black", false);
        Cat cat5 = new Cat("Bob", 1, "black", false);
        Cat cat6 = new Cat("Jinny", 2, "grey", true);
        Cat cat7 = new Cat("Timmy", 4, "white", true);
        List<Cat> cats = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7);



        Map<String, Boolean> nameInfoTable = task1(cats);
        System.out.println(nameInfoTable);



        Map<String, Long> colorInfoTable = task2(cats);
        System.out.println(colorInfoTable);


        Map<String, Set<String>> colorNamesTable = task3(cats);
        System.out.println(colorNamesTable);

    }



    public static Map<String, Boolean> task1(List<Cat> cats) {
        Map<String, Boolean> map = new HashMap<>();
        for (Cat c : cats) {
            map.put(c.getName(), c.isHungry());
        }
        return map;
    }

    public static Map<String, Long> task2(List<Cat> cats) {
        Map<String, Long> map = new HashMap<>();
        for (Cat c : cats) {
                if(map.containsKey(c.getColor())) {
                    map.put(c.getColor(), map.get(c.getColor()) + 1);
                }
                else {
                    map.put(c.getColor(), 1L);
                }

        }
        return map;
    }

    public static Map<String, Set<String>> task3(List<Cat> cats) {
        Map<String, Set<String>> map = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        for (Cat c : cats) {
            hashSet.add(c.getName());
            map.put(c.getColor(), hashSet);
        }

        return map;
    }
}
