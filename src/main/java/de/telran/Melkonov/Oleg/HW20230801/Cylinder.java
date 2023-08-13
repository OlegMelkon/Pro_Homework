package de.telran.Melkonov.Oleg.HW20230801;

public class Cylinder extends Shape3D{
    private int height;

    private int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем цилиндр высотой %d%n и радиусом %d%n", height, radius);
    }

    public static double calculateArea(int height, int radius){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public static double calculatePerimeter(int height, int radius){
        return 0;
    }

    public static double volume(int height, int radius){
        return Math.PI * height * radius * radius;
    }

}
