package de.telran.Melkonov.Oleg.hw20230817;



import java.util.*;

public class TwoDimArrayIterator {
    public static void main(String[] args) {
       int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                Random random = new Random();
                array[i][j] = random.nextInt(100 - 50) + 50;
            }
        }


        iteratorArray(array);

    }


    public static void iteratorArray(int[][] array){

        int i = 0;
        while(i < array.length){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < array[i].length; j++){
                list.add(array[i][j]);
            }
            Iterator itr = list.iterator();
            while (itr.hasNext()) {
                System.out.print(" " + itr.next());
            }
            System.out.println();
            i++;
        }



    }


}
