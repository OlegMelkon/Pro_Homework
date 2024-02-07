package de.telran.Melkonov.Oleg.hw20231107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ThreadFunctions {
    public static void main(String[] args) {


        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        for (int i = 1; i <= 3; i++){
            Thread t = new Thread(r, "Thread" + i);
            System.out.println(t.getName());
            t.start();
        }

      
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            list.add(random.nextInt(10_001));
        }
        Thread thread = new Thread(getListMaxValue(list));
        thread.setPriority(10);
        thread.start();
        new Thread(getListMinValue(list)).start();

    }

    public static Runnable getListMaxValue(List<Integer> list) {
        return () -> {
            System.out.println(Collections.max(list));
        };
    }

    public static Runnable getListMinValue(List<Integer> list) {
        return () -> {
            System.out.println(Collections.min(list));
        };
    }
}
