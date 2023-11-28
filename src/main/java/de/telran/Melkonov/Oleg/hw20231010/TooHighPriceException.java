package de.telran.Melkonov.Oleg.hw20231010;

public class TooHighPriceException extends Exception{

    private int price;

    public TooHighPriceException(int price) {
        super("The price is too high!");
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
