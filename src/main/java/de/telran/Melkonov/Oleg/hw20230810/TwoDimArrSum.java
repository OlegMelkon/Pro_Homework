package de.telran.Melkonov.Oleg.hw20230810;



public class TwoDimArrSum {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int[][] arr2 = {{26, 27, 28, 29, 30}, {31, 32, 33, 34, 35}, {36, 37, 38, 39, 40}, {41, 42, 43, 44, 45}, {46, 47, 48, 49, 50}};
        int[][] arrSum = new int[5][5];

        for (int i = 0; i < arrSum.length; i++) {
            for (int j = 0; j < arrSum[i].length; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }

    }
}