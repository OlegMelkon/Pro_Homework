package de.telran.Melkonov.Oleg.HW20230801.zoo;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(){

    }
    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String toString() {
        return "Животное - " + getName()
                + ", цвет - " + getColor();
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void voice();

    public abstract void eat(String food);

    public void jump(){

    }
}
