package de.telran.Melkonov.Oleg.HW20230801;

public class Triangle extends Shape{
    private int first;
    private int second;
    private int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

        @Override
    public void draw() {
        System.out.printf("Рисуем треугольник со сторонами %d, %d, %d%n", first, second, third);
    }

    public double calculateArea(int a, int b, int c){
        int p = a * b * c;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
    public double calculatePerimeter(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4, 6);
        triangle.draw();
        System.out.println(triangle.calculateArea(triangle.first, triangle.second, triangle.third));
        System.out.println(triangle.calculatePerimeter(triangle.first, triangle.second, triangle.third));
    }
}
