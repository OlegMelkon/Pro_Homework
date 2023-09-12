package de.telran.Melkonov.Oleg.hw20230824;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class WindowHashSetTest {
    public static void main(String[] args) {
        Window w1 = new Window(3,5, 4,"transparent");
        Window w2 = new Window(1,2, 3,"tinted");
        Window w3 = new Window(3,5, 4,"transparent");
        Window w4 = new Window(7,8, 9,"transparent");
        Window w5 = new Window(4,6, 8,"transparent");
        Window w6 = new Window(1,2, 3,"tinted");
        Window w7 = new Window(10,11, 12,"tinted");

        HashSet<Window> windows = new HashSet<Window>();
        windows.add(w1);
        windows.add(w2);
        windows.add(w3);
        windows.add(w4);
        windows.add(w5);
        windows.add(w6);
        windows.add(w7);
        windows.add(w7);
        windows.add(w7);

        Iterator<Window> iterWin = windows.iterator();
        while (iterWin.hasNext()){
            System.out.println(iterWin.next());
        }

    }
}
