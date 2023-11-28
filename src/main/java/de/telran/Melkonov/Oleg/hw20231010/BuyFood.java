package de.telran.Melkonov.Oleg.hw20231010;

public class BuyFood {
    public static void main(String[] args) {
        int maxPriceBread = 8;
        Bread bread = new Bread();
        System.out.println("Максимально возможная цена хлеба: " + maxPriceBread);
        try {
            bread.setPrice(9);

        } catch (TooHighPriceException e) {
            errorMessage();
        }
        finally{
            int maxPriceMeat = 20;
            Meat meat = new Meat();
            System.out.println("Максимально возможная цена мяса: " + maxPriceMeat);
            try {
                meat.setPrice(19);

            } catch (TooHighPriceException e) {
                errorMessage();
            }
        }

    }

    private static void errorMessage() {
        System.out.println("Слишком дорого!");
    }
}
