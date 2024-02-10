package de.telran.Melkonov.Oleg.hw20231108;

import Classes.lecture231108.Envelope;

import java.util.List;

public class Consumer implements Runnable {
    private List<Cargo> listOfCargo;
    private Car car;

    public Consumer(List<Cargo> listOfCargo, Car car) {
        this.listOfCargo = listOfCargo;
        this.car = car;
    }

    @Override
    public void run() {
        for (Cargo c : listOfCargo){
            try {
                car.load(c);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
