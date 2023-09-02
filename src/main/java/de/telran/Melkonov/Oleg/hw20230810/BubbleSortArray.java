package de.telran.Melkonov.Oleg.hw20230810;

import java.util.Arrays;

public class BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {98, 21, 65, 40, 37, 666, 13, 14};
        int temp;
        int j = 1;
        while (j < arr.length){
            for (int i = 0; i < arr.length-j; i++){
                if (arr[i] > arr[i+1]){
                    temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
            }
            j += 1;
        }

       System.out.println(Arrays.toString(arr));
    }

}
