package de.telran.Melkonov.Oleg.hw20231005;

import java.util.List;

public class Shop {
    private String name;
    private String address;
    private int workTo;
    private List<Product> products;

    public Shop(String name, String address, int workTo, List<Product> products) {
        this.name = name;
        this.address = address;
        this.workTo = workTo;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkTo() {
        return workTo;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workTo=" + workTo +
                ", products=" + products +
                '}';
    }
}
