package de.telran.Melkonov.Oleg.HW20230801.zoo;

public class Lamb extends Herbivore{
    public void voice(){
        System.out.println("Бее!");
    }
    public void eat(String food){
        if (food == "meat") System.out.println("Бее! Я такое не ем!");
        else System.out.println("Бее! Вкусно!");
    }
    public void jump(int jumpHeight, int jumpLength) {
        System.out.printf("Корова прыгает на высоту %d и расстоние %d%n", jumpHeight, jumpLength);
    }

}
