package de.telran.Melkonov.Oleg.hw20230829;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChildrenSort {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        children.add(new Child(150));
        children.add(new Child(160));
        children.add(new Child(165));
        children.add(new Child(170));
        children.add(new Child(150));
        children.add(new Child(145));
        children.add(new Child(175));
        children.add(new Child(177));
        children.add(new Child(180));
        //Поскольку у нас в классе Child лищь одно целочисленное поле, возможен естественный порядок сравнения,
        // а значит, проще использовать Comparable. Однако я также попробовал использовать Comparator.
        Collections.sort(children);
        //Collections.sort(children, new ChildrenComparator());
        System.out.println(children);
    }
}
