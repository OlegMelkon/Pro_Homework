package de.telran.Melkonov.Oleg.hw20230921;

import java.util.Random;
import java.util.function.IntSupplier;

public class SupplierTest {
    public static void main(String[] args) {
        Random random = new Random();
        IntSupplier intSupplier = () -> random.nextInt(100);
        System.out.println(intSupplier.getAsInt());
    }
}
