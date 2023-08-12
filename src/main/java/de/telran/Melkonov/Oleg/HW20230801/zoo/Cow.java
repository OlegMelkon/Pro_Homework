package de.telran.Melkonov.Oleg.HW20230801.zoo;

public class Cow extends Herbivore{
    public void voice(){
        System.out.println("Муу!");
    }
    public void eat(String food){
        if (food == "meat") System.out.println("Муу! Я такое не ем!");
        else System.out.println("Муу! Вкусно!");
    }
    public void jump(int jumpHeight, int jumpLength) {
        System.out.printf("Корова прыгает на высоту %d и расстоние %d%n", jumpHeight, jumpLength);
    }
}
