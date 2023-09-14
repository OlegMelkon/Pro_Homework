package de.telran.Melkonov.Oleg.hw20230829;

public class Author implements Comparable<Author>{
    private String surname;
    private String name;
    private int birthYear;

    public Author(String surname, String name, int birthYear) {
        this.surname = surname;
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }


    @Override
    public int compareTo(Author o) {
            return this.getSurname().compareTo(o.getSurname());
    }
}
