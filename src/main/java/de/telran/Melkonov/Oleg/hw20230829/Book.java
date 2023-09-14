package de.telran.Melkonov.Oleg.hw20230829;

public class Book implements Comparable<Book>{
    private Author author;
    private String title;
    private Publisher publisher;
    private int yearOfPublication;

    public Book(Author author, String title, Publisher publisher, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", publisher=" + publisher +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        int diff = this.getYearOfPublication() - o.getYearOfPublication();
        return diff;
    }
}
