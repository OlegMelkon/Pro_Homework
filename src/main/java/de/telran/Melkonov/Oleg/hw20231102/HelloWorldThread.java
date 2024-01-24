package de.telran.Melkonov.Oleg.hw20231102;

public class HelloWorldThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Привет, мир!");
            }
        };
        thread.run();
    }
}
