package de.telran.Melkonov.Oleg.hw20230926;

import Classes.lecture230829.CatCompare;
import Classes.lecture230926.ElectricCar;

import java.util.*;

public class MethodsInGenerics {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new GenericsComparator();
        List<String> list = List.of("Michael", "John", "Jack", "Peter", "Margaret", "Joe");
        System.out.println(list);
        System.out.println(maxValue(list, stringComparator));

        List<CatCompare> cats = new ArrayList<>();
        cats.add(new CatCompare("Барсик", 2020));
        cats.add(new CatCompare("Барсик", 2020));
        cats.add(new CatCompare("Матроскин", 2020));
        cats.add(new CatCompare("Барсик", 2021));
        cats.add(new CatCompare("Барсик", 2022));
        cats.add(new CatCompare("Барсик", 2023));
        cats.add(new CatCompare("Кузя", 2020, 3));
        cats.add(new CatCompare("Барсик", 2020, 5));
        System.out.println(cats);
        System.out.println(maxCatValue(cats));

        Map<String, Integer> people = new HashMap<>(16, 0.75f);
        people.put("Tom", 32);
        people.put("Mary", 25);
        people.put("John", 54);
        people.put("Elena", 32);
        people.put("Elena", 40);
        System.out.println(people);
        System.out.println(maxPeopleValue(people, stringComparator));

        Set<ElCar> cars = new HashSet<>(5);
        cars.add(new ElCar(2023));
        cars.add(new ElCar(2018));
        cars.add(new ElCar(2016));
        cars.add(new ElCar(2021));
        cars.add(new ElCar(2022));
        System.out.println(maxCarYear(cars));
    }

    public static String maxValue(List<String> list, Comparator<String> stringComparator){
        String max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (stringComparator.compare(max, list.get(i)) == -1){
                max = list.get(i);
            }
        }
        return max;
    }

    public static CatCompare maxCatValue(List<CatCompare> list){
        CatCompare max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (max.compareTo(list.get(i)) == -1){
                max = list.get(i);
            }
        }
        return max;
    }

    public static String maxPeopleValue(Map<String, Integer> people, Comparator<String> stringComparator){
        String maxPerson = people.keySet()
                .stream()
                .max(stringComparator)
                .get();

        return maxPerson;
    }

    public static Integer maxCarYear(Set<ElCar> cars){
        Integer max = cars.stream()
                .distinct()
                .max(ElCar::compareTo)
                .get().year;
        return max;
    }

}
