package de.telran.Melkonov.Oleg.hw20231108;

public class Producer implements Runnable{
    private Car car;

    public Producer(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try {
            while(true){
                boolean unload = car.unload();
                if (!unload){
                    return;
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
