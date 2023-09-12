package de.telran.Melkonov.Oleg.hw20230824;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++){
            array.add(i);
        }
        System.out.println(array);
        for (int i = 0; i < 100; i += 2){
            array1.add(i*i);
        }
        System.out.println(array1);
        array.addAll(array1);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
}
