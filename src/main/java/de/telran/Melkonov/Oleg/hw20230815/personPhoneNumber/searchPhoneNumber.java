package de.telran.Melkonov.Oleg.hw20230815.personPhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchPhoneNumber {
    public static void main(String[] args) throws NoSuchFieldException {
        ArrayList<PersonNew> list = new ArrayList<PersonNew>();
        list.add(new PersonNew("Пупкин", "Вася","987654"));
        list.add(new PersonNew("Пупкин","Петя","987987"));
        list.add(new PersonNew("Пенков","Вася","123456"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Ввведите фамилию: ");
        String surname = sc.next();

        ArrayList<Object> listTmp = new ArrayList(3);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getSurname().equals(surname)){
                listTmp.add(list.get(i).getPhoneNumber());
            }
        }
        System.out.println(listTmp);
        sc.close();

    }


}

