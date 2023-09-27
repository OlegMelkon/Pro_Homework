package de.telran.Melkonov.Oleg.hw20230921;

import java.util.*;
import java.util.function.Function;

public class DelayedSort implements Comparator<Integer>{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
        Function<List<Integer>, List<Integer>> sortList = l -> {
            Comparator<Integer> howToSort = new DelayedSort();
            Collections.sort(l, howToSort);
            return l;
        };
        System.out.println(sortList.apply(numbers));
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}
