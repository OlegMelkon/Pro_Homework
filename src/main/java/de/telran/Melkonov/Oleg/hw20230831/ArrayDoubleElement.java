package de.telran.Melkonov.Oleg.hw20230831;

import java.util.HashSet;
import java.util.Set;

public class ArrayDoubleElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,7,9,10};
        Set<Integer> setInt = new HashSet<>();
        int position = -1;
        int element = 0;
        for (int i = 0; i < array.length; i++){
            if (!setInt.add(array[i])){
                position = i;
                element = array[i];
            }
            setInt.add(i);
        }
        System.out.println("Position = " + position + ", Element = " + element + ".");
        System.out.println(setInt);
    }
}
