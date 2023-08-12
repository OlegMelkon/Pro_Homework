package de.telran.Melkonov.Oleg.HW20230801;

public abstract class Shape {
    protected String type;

    public Shape(String type) {
        this.type = type;
    }

    public Shape() {
    }

    public abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape: " + type;
    }

    public double calculateArea(){
        return 0;
    }

    public double calculatePerimeter(){
        return 0;
    };

}
