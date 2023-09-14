package de.telran.Melkonov.Oleg.hw20230829;

public class Publisher implements Comparable<Publisher>{
    private String name;
    private int yearOfFoundation;

    public Publisher(String name, int yearOfFoundation) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }


    @Override
    public int compareTo(Publisher o) {
        return this.getName().compareTo(o.getName());
    }
}
