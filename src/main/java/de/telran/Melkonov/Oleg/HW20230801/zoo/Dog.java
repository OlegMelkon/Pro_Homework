package de.telran.Melkonov.Oleg.HW20230801.zoo;

public class Dog extends Predator{
    public void voice(){
        System.out.println("Гав!");
    }
    public void eat(String food){
        if (food != "meat") System.out.println("Гав! Не вкусно!");
        else System.out.println("Гав! Вкусно!");
    }
    public void jump(int jumpHeight, int jumpLength) {
        System.out.printf("Собака прыгает на высоту %d и расстоние %d%n", jumpHeight, jumpLength);
    }
}
