package de.telran.Melkonov.Oleg.hw20230831;

import java.util.*;

public class StackDequeTimeTest {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        Deque<Integer> intLinkedList = new LinkedList<>();
        Deque<Integer> intArrayDeque = new ArrayDeque<>();
        long time1 = fillStackTime(intStack);
        long time2 = fillDequeTime(intLinkedList);
        long time3 = fillDequeTime(intArrayDeque);
        System.out.println(intStack);
        System.out.println("-----------------------");
        System.out.println(intLinkedList);
        System.out.println("-----------------------");
        System.out.println(intArrayDeque);
        System.out.println("-----------------------");
        System.out.printf("Times = %d, %d, %d.", time1, time2, time3);

        long timeE1 = emptyStackTime(intStack);
        long timeE2 = emptyDequeTime(intLinkedList);
        long timeE3 = emptyDequeTime(intArrayDeque);
        System.out.printf("TimesE = %d, %d, %d.", timeE1, timeE2, timeE3);
        System.out.println();
        System.out.println(intStack);
        System.out.println("--------------------------------");
        System.out.println(intLinkedList);
        System.out.println("--------------------------------");
        System.out.println(intArrayDeque);

    }

    public static long fillStackTime(Stack<Integer> intStack){
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            intStack.push(i);
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long emptyStackTime(Stack<Integer> intStack){
        long before = System.currentTimeMillis();
        while (!intStack.empty()){
            intStack.pop();
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long fillDequeTime(Deque<Integer> intDeque){
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++){
            intDeque.push(i);
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long emptyDequeTime(Deque<Integer> intDeque){
        long before = System.currentTimeMillis();
        while(intDeque.poll() != null){
            intDeque.poll();
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }
}
