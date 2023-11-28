package de.telran.Melkonov.Oleg.hw20231010;


public class BreadPriceCheck {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.setMaxPrice(8);
        System.out.println("Максимально возможная цена хлеба: " + bread.getMaxPrice()
                + ". Установленная цена хлеба: " + bread.getPrice());
        try {
            bread.setPrice(10);

        } catch (TooHighPriceException e) {
            errorMessage();
            System.exit(1);
            throw new RuntimeException(e);
        }
    }
    private static void errorMessage() {
        System.out.println("Хлеб слишком дорогой!");
    }
}
