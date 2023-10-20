package de.telran.Melkonov.Oleg.hw20231005;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class ListsMethodsInStream {
    public static void main(String[] args) {

        //Task 1.1
        Collection<String> list1 = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        list1.stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .forEach(System.out::println);

        //Task 1.2.1
        Collection<String> list2 = Arrays.asList("Highload", "High", "Load", "Highload");
        long num = list2.stream()
                .filter(s -> s.indexOf("High") != -1)
                .count();
        System.out.println(num);

        //Task 1.2.2
        if (list2.size() == 0) System.out.println(0);
        else{
            String firstElement = list2.stream()
                    .findFirst()
                    .get();
            System.out.println(firstElement);
        }

        //Task 1.3.1
        List<Integer> resultList = IntStream.range(-40,40)
                .boxed()
                .map(i -> i * i)
                .filter(j -> j > 100)
                .collect(Collectors.toList());
        System.out.println(resultList);

        //Task 1.3.2
        Set<Integer> resultSet = IntStream.range(-40,40)
                .boxed()
                .map(i -> i * i)
                .filter(j -> j > 100)
                .collect(Collectors.toSet());
        System.out.println(resultSet);

        //Task 1.3.3
        LinkedList<Integer> resultLinkedList = IntStream.range(-40,40)
                .boxed()
                .map(i -> i * i)
                .filter(j -> j > 100)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(resultLinkedList);

    }
}
