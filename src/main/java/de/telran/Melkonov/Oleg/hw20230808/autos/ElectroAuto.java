package de.telran.Melkonov.Oleg.hw20230808.autos;

public class ElectroAuto extends Auto implements Charging{

    @Override
    public void charge() {
        System.out.println("Автомобиль заряжен " + FuelType.ELECTRICITY);
    }

    public ElectroAuto(String brand, String model, int year){
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
}
