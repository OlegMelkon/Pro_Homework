package de.telran.Melkonov.Oleg.hw20230829;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Newspaper {
    public static void main(String[] args) {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad("QQQ", "John", "pen", 2023, 100));
        ads.add(new Ad("WWW", "Jane", "pencil", 2022, 150));
        ads.add(new Ad("EEE", "Jake", "cup", 2021, 150));
        ads.add(new Ad("RRR", "Matt", "plate", 2023, 200));
        ads.add(new Ad("TTT", "Greg", "ball", 2020, 100));
        ads.add(new Ad("YYY", "Mike", "ball", 2023, 100));
        ads.add(new Ad("ZZZ", "Paul", "basket", 2020, 100));
        ads.add(new Ad("UUU", "Boris", "blanket", 2020, 400));
        ads.add(new Ad("OOO", "Joe", "fork", 2020, 100));
        ads.add(new Ad("PPP", "Sam", "spoon", 2020, 100));
        Collections.sort(ads, new AdComparator());
        for (Ad a: ads) {
            System.out.println(a);
        }
        System.out.println("----------------------------------------------");
        System.out.println("MAX Element: " + findMaxAdElement(ads));
        System.out.println("MIN Element: " + findMinAdElement(ads));
    }

    public static Ad findMaxAdElement(List<Ad> ads){
        Collections.sort(ads, new AdComparator());
        return ads.get(ads.size()-1);
    }

    public static Ad findMinAdElement(List<Ad> ads){
        Collections.sort(ads, new AdComparator());
        return ads.get(0);
    }
}
