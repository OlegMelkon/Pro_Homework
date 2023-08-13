package de.telran.Melkonov.Oleg.HW20230801;

public class Cube extends Shape3D{
    private int sideLength;

    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.printf("Рисуем куб со стороной %d%n", sideLength);
    }

    public static int calculateArea(int sideLength){
        return 6 * sideLength * sideLength;
    }

    public static int calculatePerimeter(int sideLength){
        return 12 * sideLength;
    }

    public static double volume(int sideLength){
        return sideLength * sideLength * sideLength;
    }

}
