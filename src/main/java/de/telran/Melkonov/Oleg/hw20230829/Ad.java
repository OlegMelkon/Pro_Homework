package de.telran.Melkonov.Oleg.hw20230829;

public class Ad implements Comparable<Ad>{
    private String title;
    private String author;
    private String description;
    private int year;
    private int price;

    public Ad(String title, String author, String description, int year, int price) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Ad o) {
        int diff = this.getYear() - o.getYear();
        return diff;
    }
}
