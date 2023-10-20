package de.telran.Melkonov.Oleg.hw20231005;

public class Product {
    int price;
    String name;
    Category category;

    public Product(int price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
