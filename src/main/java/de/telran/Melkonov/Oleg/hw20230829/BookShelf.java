package de.telran.Melkonov.Oleg.hw20230829;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book(new Author("Griboedov", "Aleksandr", 1795), "Gore ot uma",
                new Publisher("Nauka", 1923),1982));
        books.add(new Book(new Author("Pushkin", "Aleksandr", 1799), "Evgeniy Onegin",
                new Publisher("Prosvescheniye", 1930),1972));
        books.add(new Book(new Author("Dostoevskiy", "Fedor", 1821), "Bratiya Karamazovi",
                new Publisher("Mir", 1946),1980));
        books.add(new Book(new Author("Tolstoy", "Lev", 1828), "Voyna i mir",
                new Publisher("Nauka", 1923),1965));
        books.add(new Book(new Author("Dostoevskiy", "Fedor", 1821), "Bratiya Karamazovi",
                new Publisher("Mir", 1946),1980));
        for (Book b : books) {
            System.out.println(b);
        }
        List<Author> authors = new ArrayList<>();
        for (Book b : books) {
            authors.add(b.getAuthor());
        }

        Collections.sort(authors, new AuthorComparator());
        for (Author a : authors) {
            System.out.println(a);
        }

    }
}
