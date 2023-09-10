package de.telran.Melkonov.Oleg.hw20230822;

import java.util.*;

public class MyArrayListHWTest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        MyArrayListHW list = new MyArrayListHW();
        list.array = arr;
        System.out.println(list.size());
        System.out.println(list.array.length);

        for (int i = 0; i < list.array.length; i++){
            System.out.print(list.array[i] + "+");
        }
        System.out.println();
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + "Glück!");
        }
        //System.out.println(list.lastIndexOf(2));
        //list.add(3, 23);
        System.out.println();
        //list.add(55);




    }
}
