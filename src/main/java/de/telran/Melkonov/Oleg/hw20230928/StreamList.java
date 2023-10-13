package de.telran.Melkonov.Oleg.hw20230928;

import java.util.*;
import java.util.stream.Collectors;

public class StreamList {
    public static void main(String[] args) {
        //Task 1.1
        List<String> listStr = List.of("Michael", "John", "Jack", "Peter", "Margaret", "Joe");
        String max = listStr.stream()
                .max(Comparator.comparing(String::length)).get();
        System.out.println(max);

        //Task 1.2
        Random random = new Random();
        List<Integer> listInt = new ArrayList<>(100);
        for (int i = 0; i < 100; i++){
            listInt.add(random.nextInt(50));
        }
        System.out.println(listInt);
        List<Integer> result = listInt.stream()
                .filter(i -> i < 25)
                .map(j -> j + 10)
                .map(k -> k * k)
                .filter(e -> e < 100)
                .collect(Collectors.toList());
        System.out.println(result);
        if (result.size() != 0) System.out.println(result.get(0)); else System.out.println("-1");

        //Task 1.3
        List<People> listOfPeople = new ArrayList<>(10);
        listOfPeople.add(new People(10,"Ivan","Ivanov",50,120));
        listOfPeople.add(new People(19,"Artur","Petrov",80,170));
        listOfPeople.add(new People(30,"Petr","Petrov",90,190));
        listOfPeople.add(new People(35,"Akimka","Akimov",85,179));
        listOfPeople.add(new People(20,"Artem","Sokolov",65,160));
        listOfPeople.add(new People(17,"Ivan","Ivanov",50,120));
        listOfPeople.add(new People(25,"Artur","Petrov",80,170));
        listOfPeople.add(new People(37,"Petr","Petrenko",86,185));
        listOfPeople.add(new People(22,"Alina","Sladkova",55,170));
        listOfPeople.add(new People(16,"Vasiliy","Zhdanov",65,160));

        List<People> filteredList1 = listOfPeople.stream()
                .filter(a -> a.getAge() > 18)
                .filter(h -> h.getHigh() < 180)
                .filter(n -> n.getFirstName().indexOf("A") == 0)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(filteredList1.toArray()));

        List<People> filteredList2 = listOfPeople.stream()
                .filter(a -> a.getAge() > 30)
                .filter(ln -> ln.getLastName().indexOf("A") == 0)
                .filter(fn -> fn.getFirstName().length() > 5)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(filteredList2.toArray()));

        //Task 1.4
        List<String> listOfSurmanes = List.of("Michael", "Johannson", "Jackson", "Peterson", "Ivanov", "Jones");
        listOfSurmanes.stream()
                .filter(n -> n.indexOf("J") == 0)
                .forEach(System.out::println);

        //Task 2.1
        List<Integer> listIntRan = new ArrayList<>(100);
        for (int i = 0; i < 100; i++){
            listIntRan.add(random.nextInt(100 + 100)-100);
        }
        System.out.println(listIntRan);
        Set<Integer> resultSet = listIntRan.stream()
                .filter(i -> Math.abs(i) < 50)
                .map(j -> j + 20)
                .skip(4)
                .limit(6)
                .collect(Collectors.toSet());
        resultSet.forEach(System.out::println);

        //Task 2.2
        List<House> listOfHouses = new ArrayList<>(10);
        listOfHouses.add(new House("Pushkinskaya",7,10_000_000,1905));
        listOfHouses.add(new House("Lenina",13,7_000_000,1900));
        listOfHouses.add(new House("Pobedy",10,5_000_000,1950));
        listOfHouses.add(new House("Sadovaya",25,25_000_000,1985));
        listOfHouses.add(new House("Orbitalnaya",125,1_000_000,1995));
        listOfHouses.add(new House("Voroshilovskaya",8,3_000_000,2001));
        listOfHouses.add(new House("Max Platz",81,13_000_000,1970));
        listOfHouses.add(new House("Erevanskaya",12,5_000_000,2020));
        listOfHouses.add(new House("13 Liniya",666,666_000_000,666));
        listOfHouses.add(new House("Max Platz",14,2_000_000,2021));


        House maxPriceHouse = listOfHouses.stream()
                .max(Comparator.comparing(House::getPrice))
                .get();
        System.out.println(maxPriceHouse);

        House minPriceUnevenHouse = listOfHouses.stream()
                .filter(n -> n.getNumber() % 2 != 0)
                .min(Comparator.comparing(House::getPrice))
                .get();
        System.out.println(minPriceUnevenHouse);

        List<House> priceHouseSort = listOfHouses.stream()
                .filter(p -> p.getPrice() < 25_000_000 && p.getPrice() > 100_000)
                .limit(2)
                .collect(Collectors.toList());
        priceHouseSort.forEach(System.out::println);

        List<House> pricesMaxPlatz = listOfHouses.stream()
                .filter(st -> st.getStreet().equals("Max Platz"))
                .peek(p -> System.out.println(p.getPrice()))
                .collect(Collectors.toList());

        long numberUneven = listOfHouses.stream()
                .filter(n -> n.getNumber() % 2 != 0)
                .count();
        System.out.println(numberUneven);

        long priceMaxPlatz = listOfHouses.stream()
                .filter(st -> st.getStreet().equals("Max Platz"))
                .map(h -> h.getPrice())
                .reduce(0, Integer::sum);
        System.out.println(priceMaxPlatz);
        
    }
}
