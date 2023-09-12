package de.telran.Melkonov.Oleg.hw20230824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayListDeleteRep {
    public static void main(String[] args) {
        HashSet<Integer> tempSet = new HashSet<Integer>();

        Integer[] integers = {1, 2, 2, 3, 4, 4, 4};
        ArrayList<Integer> arrListInt = new ArrayList<Integer>();
        arrListInt.addAll(List.of(integers));
        tempSet.addAll(arrListInt);
        arrListInt.clear();
        arrListInt.addAll(tempSet);
        Collections.sort(arrListInt);
        System.out.println(arrListInt);

        Integer[] integers1 = {12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89};
        ArrayList<Integer> arrListInt1 = new ArrayList<Integer>();
        arrListInt1.addAll(List.of(integers1));
        tempSet.clear();
        tempSet.addAll(arrListInt1);
        arrListInt1.clear();
        arrListInt1.addAll(tempSet);
        Collections.sort(arrListInt1);
        System.out.println(arrListInt1);

    }
}
