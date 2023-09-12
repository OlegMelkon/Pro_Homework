package de.telran.Melkonov.Oleg.hw20230824;

public class Window {
    private int weight;
    private int width;
    private int height;
    private String type;

    public Window(int weight, int width, int height, String type) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Window{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", type='" + type + '\'' +
                '}';
    }
}
