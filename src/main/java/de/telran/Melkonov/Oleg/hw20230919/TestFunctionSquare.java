package de.telran.Melkonov.Oleg.hw20230919;

public class TestFunctionSquare {
    public static void main(String[] args) {

        //Task1
        FunctionSquare functionSquare = x -> x * x;
        for (int i = 1; i <= 10; i++){
            System.out.println(functionSquare.square(i));
        }

        //Task2
        FunctionSquare functionSquare1 = x -> {
           return x * x - 8 * x + 12;
        };

        //Task3
        FunctionSquare functionSquare2 = x -> {
            return 5 * x * x + 3 * x + 7;
        };

        //Task4
        FunctionSquare functionSquare3 = x -> {
            return x * x - 6 * x + 9;
        };

        //Printout of Tasks2,3,4
        for (int i = 0; i <= 10; i++){
            System.out.println(functionSquare1.square(i));
            System.out.println(functionSquare2.square(i));
            System.out.println(functionSquare3.square(i));
        }

        //Task5
        FunctionSquare functionSquare4 = x -> {
            return (x*x)/2 - (2*x)/3 - (x-2)/6;
        };
        System.out.println(functionSquare4.square(5));

        //Task6
        FunctionSquare functionSquare5 = x -> {
            int a = (int) Math.pow((x-1/x), 1/2);
            return (int) a + a;
        };
        System.out.println(functionSquare5.square(5));

        //Task7
        FunctionSquare functionSquare6 = x -> {
            return (int) (Math.sqrt(3*x-1) + Math.pow((1+x),2));
        };
        System.out.println(functionSquare6.square(5));

        int[] nums = {3, 4, 5};
        //Task8
       FunctionCalc functionCalc = x -> {
           int p = (nums[0]+nums[1]+nums[2])/2;
           return Math.sqrt(p * (p-nums[0]) * (p-nums[1]) * (p-nums[2]));
       };
        System.out.println(functionCalc.apply(nums));
    }
}
