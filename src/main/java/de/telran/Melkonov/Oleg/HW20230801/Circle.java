package de.telran.Melkonov.Oleg.HW20230801;

import java.util.Scanner;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        super("Круг");
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(int radius, String type) {
        super(type);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Я рисую круг радиусом %d%n", radius);
    }

    public void drawFast() {
        System.out.println("Начал быстро рисовать");
        draw();
    }

    @Override
    public String toString() {
        return "это Круг радиусом " + radius;
    }

    public static int draw(Object color){
        return 1;
    }

    public static double calculateArea(int rad){
        return Math.PI * rad * rad;
    }

    public static double calculatePerimeter(int rad){
        return 2 * Math.PI * rad;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        System.out.println(circle.calculateArea(circle.radius));
        System.out.println(circle.calculatePerimeter(circle.radius));
    }
}
