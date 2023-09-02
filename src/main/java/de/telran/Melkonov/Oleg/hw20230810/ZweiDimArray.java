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
             int max = twoDimArr[0][twoDimArr.length-1];
        for (int i = 0; i < twoDimArr.length; i++){
            for (int j = 0; j < twoDimArr[i].length; j++){
                if ((i  + j) <= twoDimArr.length-1){
                    if (twoDimArr[i][j] > max) max = twoDimArr[i][j];
                }
            }
        }
        System.out.println(max);

        int[][] twoDimArr1 = new int[5][5];
        for (int i = 0; i < twoDimArr1.length; i++){
            for (int j = 0; j < twoDimArr1[i].length; j++){
                twoDimArr1[i][j] = 7*i-3*j;
                System.out.print(twoDimArr1[i][j] + " ");
            }
            System.out.println();
        }

        char[][] chessboard = new char[8][8];
        for (int i = 0; i < chessboard.length; i++){
            for (int j = 0; j < chessboard[i].length; j++){
                if (i % 2 == 0 && j % 2 != 0 || i % 2 != 0 && j % 2 == 0) chessboard[i][j] = 'X';
                else chessboard[i][j] = ' ';
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
        int countNeg = 0;
        int[][] twoDimArr2 = new int[20][20];
        for (int i = 0; i < twoDimArr2.length; i++){
            for (int j = 0; j < twoDimArr2[i].length; j++){
                twoDimArr2[i][j] = -1 * (7*i-3*j);
                if (i > j && twoDimArr2[i][j] < 0) countNeg += 1;
                System.out.print(twoDimArr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("В мартице %d отрицательных эелментов под главной диагональю", countNeg);
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        int[][] twoDimArr3 = new int[3][3];
        int maxEven = twoDimArr3[0][0];
        System.out.print("Введите девять целых чисел: ");
        for (int i = 0; i < twoDimArr3.length; i++){
            for (int j = 0; j < twoDimArr3[i].length; j++){
                twoDimArr3[i][j] = sc.nextInt();
                if (twoDimArr3[i][j] % 2 == 0 && twoDimArr3[i][j] > maxEven){
                    maxEven = twoDimArr3[i][j];
                }
                System.out.print(twoDimArr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("Среди чётных элементов матрицы %d является максимальным", maxEven);
        sc.close();
    }
}
