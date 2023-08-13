package de.telran.Melkonov.Oleg.HW20230801;

public class Rectangle extends Shape{
    private int first;
    private int second;

    public Rectangle(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем прямоугольник со сторонами %d, %d%n", first, second);
    }
}
