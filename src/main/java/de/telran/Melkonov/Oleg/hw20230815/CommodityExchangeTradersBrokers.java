package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;

public class CommodityExchangeTradersBrokers {
    public static void main(String[] args) {
        ArrayList<String> listOfBrokers = new ArrayList<>(25);

        listOfBrokers.add("Gashek");
        listOfBrokers.add("Dostoyevsky");
        listOfBrokers.add("Tolstoy");
        listOfBrokers.add("Turgenev");
        listOfBrokers.add("Bulgakov");
        listOfBrokers.add("Kafka");
        listOfBrokers.add("Hemingway");
        listOfBrokers.add("Griboedov");
        listOfBrokers.add("Pushkin");
        listOfBrokers.add("Lermontov");
        listOfBrokers.add("Dreiser");
        listOfBrokers.add("Camus");
        listOfBrokers.add("Maugham");
        listOfBrokers.add("Nabokov");
        listOfBrokers.add("Leskov");
        listOfBrokers.add("Remarque");
        listOfBrokers.add("Dumas");
        listOfBrokers.add("Orwell");
        listOfBrokers.add("Dragunskiy");
        listOfBrokers.add("Goethe");
        listOfBrokers.add("Hesse");
        listOfBrokers.add("Russell");
        listOfBrokers.add("Fichtengolz");
        listOfBrokers.add("Lovelace");
        listOfBrokers.add("Turing");

        System.out.println(listOfBrokers);

        transposition(listOfBrokers);

        System.out.println(listOfBrokers);
    }

    public static void transposition(ArrayList list){
        int i = 0;
        int j = list.size() - 1;
        while(i < j){
            Object tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
            i++; j--;
        }
    }
}
