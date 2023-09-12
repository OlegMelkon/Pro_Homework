package de.telran.Melkonov.Oleg.hw20230824;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRotation {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            array.add(i);
        }

        System.out.println(array);

        int temp = array.get(array.size()-1);

        for(int i = array.size()-1; i >= 0; i--)
        {
            array.set(i, array.get(i-1));

            array.set(0, temp);
        }

        System.out.println(array);

    }
}
