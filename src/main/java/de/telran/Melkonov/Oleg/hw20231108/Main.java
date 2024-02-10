package de.telran.Melkonov.Oleg.hw20231108;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        List<Cargo> cargoList = new ArrayList<>();
        cargoList.add(new Cargo("Sport Car"));
        cargoList.add(new Cargo("Chopper"));
        cargoList.add(new Cargo("Sport Bike"));
        cargoList.add(new Cargo("Jeep"));
        cargoList.add(new Cargo("NULL"));
        Thread load = new Thread(new Consumer(cargoList, car));
        Thread unload = new Thread(new Producer(car));
        load.start();
        unload.start();
    }
}
