package de.telran.Melkonov.Oleg.hw20230829;


import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        Comparator<Book> comp = new BooksYearComparator()
                .thenComparing(new BookAuthorComparator())
                .thenComparing(new BookTitleComparator())
                .thenComparing(new BookPublisherComparator());
        return comp.compare(o1, o2);
    }

    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }
}
