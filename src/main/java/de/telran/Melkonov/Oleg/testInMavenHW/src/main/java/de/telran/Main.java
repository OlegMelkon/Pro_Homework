package de.telran;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> equalElementsSearch(int[] firstArray, int[] secondArray){
        ArrayList<Integer> equalArrayElements = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++){
         for (int j = 0; j < secondArray.length; j++){
             if (firstArray[i] == secondArray[j] && !equalArrayElements.contains(firstArray[i])) {
                 equalArrayElements.add(firstArray[i]);
             }
         }
     }
        return equalArrayElements;
    }

    public static ArrayList<Integer> equalElementsDelete(int[] arr){
        ArrayList<Integer> uniqueElements = new ArrayList<>();
        uniqueElements.add(arr[0]);
        for (int i = 0; i < arr.length; i++){
            if (!uniqueElements.contains(arr[i])) uniqueElements.add(arr[i]);
        }
        return uniqueElements;
    }
}