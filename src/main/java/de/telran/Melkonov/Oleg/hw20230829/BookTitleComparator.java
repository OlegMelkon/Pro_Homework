package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
