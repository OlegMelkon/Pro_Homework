package de.telran.Melkonov.Oleg.HW20230801;

public class ShapeGenerator {
    public static void generate(){
        double shapeType = (int)(Math.random()*((5-0)+1))+0;
        if (shapeType == 0) {
            Circle circle = new Circle(5);
            circle.draw();
        } else {
            if (shapeType == 1) {
                Square square = new Square(4);
                square.draw();
            } else {
                if (shapeType == 2) {
                    Triangle triangle = new Triangle(2, 4, 6);
                    triangle.draw();
                } else {
                    if (shapeType == 3) {
                        Rectangle rectangle = new Rectangle(5,6);
                        rectangle.draw();
                    } else {
                        if (shapeType == 4){
                            Cube cube = new Cube(9);
                            cube.draw();
                        } else {
                            Cylinder cylinder = new Cylinder(10, 3);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        generate();
    }
}
