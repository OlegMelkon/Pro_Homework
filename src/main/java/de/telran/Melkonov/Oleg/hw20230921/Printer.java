package de.telran.Melkonov.Oleg.hw20230921;

import java.util.function.Consumer;

public class Printer{
    public static void main(String[] args) {
        Consumer<Object> printData = data -> System.out.println(data);
        printData.accept("Oleg");
        printData.accept(13);
        printData.accept((double) 13);

    }


}
