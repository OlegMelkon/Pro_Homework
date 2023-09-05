package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(31);
        fill(list);
        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 30: ");
        int number = sc.nextInt();
        sc.close();

        int result = search(list, number, 0, 30);
        if (result == -1) System.out.println("Not found!"); else System.out.println("Found on position " + result);
    }
    public static void fill(List<Integer> list) {
        for (int i = 0; i < 31; i++) {
            list.add(i, i);
        }
    }

    public static int search(List<Integer> list, int num, int left, int right){
        int mid = left + (right-left)/2;
        if (num < list.get(mid)){
            return search(list, num, left, mid-1);
        } else if (num > list.get(mid)){
            return search(list, num, mid+1, right);
        }
        return mid;
    }
}
