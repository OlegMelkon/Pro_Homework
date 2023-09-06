package de.telran.Melkonov.Oleg.hw20230817;

import java.util.*;

public class TimeTestIterator implements Iterator<Integer> {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        setListRandom(list);

        System.out.println("Iterator: " + countTimeIterator(list));
        System.out.println("ListIterator: " + countTimeListIterator(list));
        System.out.println("ForEach: " + countTimeForEach(list));
        System.out.println("For: " + countTimeFor(list));
        System.out.println("ForBack: " + countTimeForBack(list));

    }
    public static void setListRandom(List<Integer> list){
        Random random = new Random();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(random.nextInt(1_000_000));
        }

    }

    public static long countTimeIterator(List<Integer> list){
        int tempVal = 0;
        Iterator itr = list.iterator();
        long before = System.currentTimeMillis();
        while (itr.hasNext()) {
            tempVal = (int) itr.next();
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long countTimeListIterator(List<Integer> list){
        int tempVal = 0;
        ListIterator lItr = list.listIterator();
        long before = System.currentTimeMillis();
        while (lItr.hasNext()) {
            tempVal = (int) lItr.next();
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long countTimeForEach(List<Integer> list){
        int tempVal = 0;
        long before = System.currentTimeMillis();
        for (Integer current : list) {
            tempVal = current;
        }
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long countTimeFor(List<Integer> list){
        int tempVal = 0;
        long before = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) tempVal = list.get(i);
        long after = System.currentTimeMillis();
        return (after-before);
    }

    public static long countTimeForBack(List<Integer> list){
        int tempVal = 0;
        long before = System.currentTimeMillis();
        for (int i = list.size()-1; i >= 0; i--) tempVal = list.get(i);
        long after = System.currentTimeMillis();
        return (after-before);
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
