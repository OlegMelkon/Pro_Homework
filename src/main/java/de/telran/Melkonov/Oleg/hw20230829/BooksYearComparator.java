package de.telran.Melkonov.Oleg.hw20230829;


import java.util.Comparator;

public class BooksYearComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return Integer.compare(b1.getYearOfPublication(), b2.getYearOfPublication());
    }
}
