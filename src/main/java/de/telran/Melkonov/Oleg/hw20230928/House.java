package de.telran.Melkonov.Oleg.hw20230928;

public class House {
    private String street;
    private int number;
    private int price;
    private int buildingYear;

    public House(String street, int number, int price, int buildingYear) {
        this.street = street;
        this.number = number;
        this.price = price;
        this.buildingYear = buildingYear;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", buildingYear=" + buildingYear +
                '}';
    }
}
