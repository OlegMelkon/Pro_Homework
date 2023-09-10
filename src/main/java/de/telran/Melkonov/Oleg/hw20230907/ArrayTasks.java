package de.telran.Melkonov.Oleg.hw20230907;

import java.util.Arrays;
import java.util.Random;

public class ArrayTasks {
    public static void main(String[] args) {

        //Task1:

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            Random random = new Random();
            array[i] = random.nextInt(613 - 13) + 13;
        }

        if (firstRepEl(array) == -1) System.out.println("No repeating element found!");
        else System.out.println("The first repeating element is: " +  array[firstRepEl(array)]);

        //Task2:

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++){
            array1[i] = i;
            System.out.println(array1[i]);
        }
        System.out.println("---------------------------------------");
        int[] array2 = new int[10];
        for (int i = array2.length-1; i >= 0; i--){
            array2[i] = i;
            System.out.println(array2[i]);
        }

        System.out.println("---------------------------------------");
        if (equalityOfArrays(array1, array2)) System.out.println("Arrays are equal!");
        else System.out.println("Arrays are NOT equal!");

        //Task3:

        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        for (int i = 0; i < words.length; i++){
            for (int j = i + 1; j < words.length; j++){
                if (words[i].length() == words[j].length()){
                    char[] a = words[i].toCharArray();
                    char[] b = words[j].toCharArray();
                    Arrays.sort(a);
                    Arrays.sort(b);
                    if(Arrays.equals(a, b)) System.out.println(words[i] + ", " + words[j]);
                }

            }
        }

    }

    public static int firstRepEl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean equalityOfArrays(int[] array1, int[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
