package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class BookPublisherComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getPublisher().compareTo(b2.getPublisher());
    }
}
