package de.telran.Melkonov.Oleg.hw20230824;

import java.util.Collection;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
        setTreeRandom(myTreeSet);
        System.out.println(myTreeSet);
        System.out.println("Floor, 56: " + myTreeSet.floor(56));
        System.out.println("Ceiling, 70: " + myTreeSet.ceiling(70));
        System.out.println("Higher, 40: " + myTreeSet.higher(40));
        System.out.println("Lower, 10: " + myTreeSet.lower(10));
        System.out.println("SubSet, [10..30): " + myTreeSet.subSet(10, 30));
        System.out.println("SubSet, [30..40]: " + myTreeSet.subSet( 30, true, 40, true));
        System.out.println("SubSet, (40..50]: " + myTreeSet.subSet(40, false, 50, true));
        System.out.println("HeadSet, <40: " + myTreeSet.headSet(40));
    }

    public static void setTreeRandom(TreeSet<Integer> s){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            s.add(random.nextInt(100));
        }
    }
}
