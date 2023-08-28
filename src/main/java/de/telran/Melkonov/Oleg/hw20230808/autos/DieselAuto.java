package de.telran.Melkonov.Oleg.hw20230808.autos;

public class DieselAuto extends Auto implements Fuelling{

    @Override
    public void fillIn() {
        System.out.println("Автомобиль заправлен " + FuelType.DIESEL);
    }

    public DieselAuto(String brand, String model, int year){
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
}
