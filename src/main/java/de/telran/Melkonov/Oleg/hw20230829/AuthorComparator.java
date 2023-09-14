package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author o2) {
        int diff = o1.getBirthYear() - o2.getBirthYear();
        if (diff == 0) {
            int nameOrder = o1.getSurname().compareTo(o2.getSurname());
            return nameOrder;
        } else {
            return diff;
        }
    }
}
