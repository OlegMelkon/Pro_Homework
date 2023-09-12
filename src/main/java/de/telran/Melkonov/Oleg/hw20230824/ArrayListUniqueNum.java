package de.telran.Melkonov.Oleg.hw20230824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class ArrayListUniqueNum {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(1000);
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            array.add(random.nextInt(100 - 1) + 1);
        }
        HashSet<Integer> tempSet = new HashSet<Integer>();
        tempSet.addAll(array);
        System.out.println(array);
        System.out.println(tempSet);
        System.out.println("В массиве уникальных элементов: " + tempSet.size());

        int i = 0;
        for (Integer num : tempSet) {
            if (Collections.frequency(array, num) > 1){
               i += Collections.frequency(array, num) - 1;
            }
        }
        System.out.println(i);

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(1);
        array1.add(2);
        array1.add(2);
        array1.add(2);
        array1.add(6);
        array1.add(4);
        array1.add(4);
        HashSet<Integer> tempSet1 = new HashSet<Integer>();
        tempSet1.addAll(array1);
        System.out.println(array1);
        System.out.println(tempSet1);
        int j = 0;
        for (Integer num : tempSet1) {
            if (Collections.frequency(array1, num) > 1){
                j += Collections.frequency(array1, num) - 1;
            }
        }
        System.out.println(j);

    }
}
