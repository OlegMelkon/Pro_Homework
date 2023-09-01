package de.telran.Melkonov.Oleg.hw20230810;

public class ZweiDimArray {
    public static void main(String[] args) {
        int[][] twoDimArr = new int[4][4];
        for (int i = 0; i < twoDimArr.length; i++){
            for (int j = 0; j < twoDimArr[i].length; j++){
                twoDimArr[i][j] = i + j;
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
