package de.telran.Melkonov.Oleg.hw20230808.autos;

public class HybridAuto extends Auto implements Charging, Fuelling{

    @Override
    public void charge() {
        System.out.println("Автомобиль заправлен " + FuelType.PETROL);
    }
    @Override
    public void fillIn() {
        System.out.println("Автомобиль заряжен " + FuelType.ELECTRICITY);
    }

    public HybridAuto(String brand, String model, int year){
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
}
