package de.telran.Melkonov.Oleg.hw20231108;

public class Car {
    private Cargo cargo;
    private boolean isLoaded;


    public synchronized void load(Cargo cargo) throws InterruptedException{
        while (isLoaded){
            wait();
        }
        isLoaded = true;
        this.cargo = cargo;
        System.out.printf("Loaded %s%n", Thread.currentThread().getName());
        notifyAll();
        Thread.sleep(1000);
    }
    public synchronized boolean unload() throws InterruptedException{
        while(!isLoaded){
            wait();
        }
        System.out.printf("Unloaded %s %s%n", Thread.currentThread().getName(), cargo.getCargoName());
        isLoaded = false;
        notifyAll();
        if (cargo.getCargoName().equals("NULL")){
            return false;
        }
        cargo = null;
        Thread.sleep(1000);
        return true;
    }
}
