package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;
import java.util.Random;

public class ListSortInsert {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        fill(list);
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void fill(ArrayList<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(i, random.nextInt(20));
        }
    }

    public static void sort(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) >= max){
                max = list.get(i);
            } else if (list.get(i) < max) {
                int j = 0;
                while (j < i){
                    if (list.get(i) < list.get(j)){
                        list.add(j, list.get(i));
                        list.remove(i+1);
                    }
                    j++;
                }
             max = list.get(i);
            }
        }
    }
}
