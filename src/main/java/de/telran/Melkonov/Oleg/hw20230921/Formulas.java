package de.telran.Melkonov.Oleg.hw20230921;

import de.telran.Melkonov.Oleg.hw20230919.FunctionSquare;

import java.util.Optional;

public class Formulas {
    public static void main(String[] args) {
        FunctionSquare func1 = x -> x * x;
        System.out.println(calc(func1, 7));
        System.out.println(calc1(func1, 3));
        System.out.println(calc2(func1, 7));
    }

        public static int calc (FunctionSquare func, Integer num){
            Optional<Integer> container = Optional.ofNullable(func.square(num));
            if (container.isEmpty()) return 0;
            return func.square(num);
        }

        public static int calc1 (FunctionSquare func, Integer num){


            if (num > 4){
                Optional<Integer> container = Optional.ofNullable(func.square(num));
                if (container.isEmpty()) return 0;
                return func.square(num);
            }
            return 0;
        }
        public static int calc2 (FunctionSquare func, Integer num){
            if (num > 6){
                Optional<Integer> container = Optional.ofNullable(func.square(num));
                if (container.isEmpty()) return 0;
                return func.square(num-6);
            }
            return num * num;
        }

}
