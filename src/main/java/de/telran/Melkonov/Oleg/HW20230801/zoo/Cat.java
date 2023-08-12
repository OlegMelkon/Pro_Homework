package de.telran.Melkonov.Oleg.HW20230801.zoo;

public class Cat extends Predator{
    public void voice(){
        System.out.println("Мяу!");
    }
    public void eat(String food){
        if (food != "meat") System.out.println("Мяу! Не вкусно!");
        else System.out.println("Мяу! Вкусно!");
    }
    public void jump(int jumpHeight, int jumpLength) {
        System.out.printf("Кот прыгает на высоту %d и расстоние %d%n", jumpHeight, jumpLength);
    }

}
