package de.telran.Melkonov.Oleg.hw20230817;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfiniteIterator {

    public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>();
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();

        setList(cards);
        endlessIterator(cards, player1, player2);

    }

    public static void setList(List<Integer> list){
        for (int i = 0; i < 50; i++) {
            list.add((int) (i * Math.pow(-1, i)));
        }

    }

    public static void endlessIterator(List<Integer> cards, List<Integer> player1, List<Integer> player2){
        Iterator itr = cards.iterator();
        while (itr.hasNext()) {
            player1.add((Integer) itr.next());
            player2.add((Integer) itr.next());

        }
        System.out.println(player1);
        System.out.println(player2);

        endlessIterator(cards, player1, player2);
    }
}
