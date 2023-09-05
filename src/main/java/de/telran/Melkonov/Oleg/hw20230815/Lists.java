package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(1_000_000);
        LinkedList<Integer> linkedList = new LinkedList<>();
        fill(arrayList);
        fill(linkedList);
        getRandom(arrayList);
    }

    public static void fill(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i, i);
        }
    }

    public static void getRandom(List<Integer> list){
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            System.out.println(list.get(random.nextInt(1_000_000)));
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }
}
