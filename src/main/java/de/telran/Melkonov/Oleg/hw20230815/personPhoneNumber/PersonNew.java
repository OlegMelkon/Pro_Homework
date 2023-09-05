package de.telran.Melkonov.Oleg.hw20230815.personPhoneNumber;

public class PersonNew {
    private String surname;
    private String name;
    private String phoneNumber;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public PersonNew(String surname, String name, String phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public PersonNew() {
    }
}
