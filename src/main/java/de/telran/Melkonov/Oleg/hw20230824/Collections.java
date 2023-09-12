package de.telran.Melkonov.Oleg.hw20230824;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Collection<Integer> arrayListCollection = new ArrayList<Integer>();
        Collection<Integer> linkedListCollection = new LinkedList<Integer>();
        Collection<Integer> treeSetCollection = new TreeSet<Integer>();
        Collection<Integer> hashSetCollection = new HashSet<Integer>();

        System.out.println("ArrayList: " + setCollectionRandom(arrayListCollection));
        System.out.println("LinkedList: " + setCollectionRandom(linkedListCollection));
        System.out.println("TreeSet: " + setCollectionRandom(treeSetCollection));
        System.out.println("HashSet: " + setCollectionRandom(hashSetCollection));

    }

    public static long setCollectionRandom(Collection<Integer> c){
        Random random = new Random();
        long before = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            c.add(random.nextInt(1_000_000));
        }
        long after = System.currentTimeMillis();
        return (after-before);

    }
}
