package de.telran.Melkonov.Oleg.hw20230817;

import java.util.*;

public class IteratorsArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            Random random = new Random();
            array[i] = random.nextInt(100 - 50) + 50;
        }
        iteratorArray(array);
        System.out.println("------------------------------------------------------------------");
        iteratorArrayBackwards(array);

    }
    public static void iteratorArray(int[] array){
        List<Integer> list = new ArrayList<>();
        for (Integer current : array) {
            list.add(current);
        }
        ListIterator itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    public static void iteratorArrayBackwards(int[] array){
        List<Integer> list = new ArrayList<>();
        for (Integer current : array) {
            list.add(current);
        }
        ListIterator litr = list.listIterator();

        while(litr.hasNext()) litr.next();
        while(litr.hasPrevious()) System.out.println(litr.previous());

    }

}
