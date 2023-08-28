package de.telran.Melkonov.Oleg.hw20230808.autos;

public abstract class Auto {
    private String brand;
    private String model;
    private int year;
    private Tire tire1;
    private Tire tire2;
    private Tire tire3;
    private Tire tire4;
    public void setTires(Tire tire1, Tire tire2, Tire tire3, Tire tire4){
        this.tire1 = tire1;
        this.tire2 = tire2;
        this.tire3 = tire3;
        this.tire4 = tire4;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }


    public void start(){
        System.out.println("Автомобиль " + getBrand() + " завёлся");
    }
    public void ride(){
        System.out.println("Автомобиль" + getBrand() + " едет");
    }
    public int breakDown(){
        int num = 1 + (int) (Math.random() * 3);
        if (num == 1) System.out.println("Автомобиль " + getBrand() + " исправен"); else System.out.println("Автомобиль " + getBrand() + " сломался");
        return num;
    }

}
