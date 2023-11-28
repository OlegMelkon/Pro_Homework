package de.telran.Melkonov.Oleg.hw20231010;

public class Meat {
    private int maxPrice;
    private int price;

    public void setPrice(int price) throws TooHighPriceException {
        if (price > maxPrice) {
            TooHighPriceException ex = new TooHighPriceException(price);
            throw ex;
        }
        this.price = price;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getPrice() {
        return price;
    }
}
