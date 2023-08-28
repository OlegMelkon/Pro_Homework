package de.telran.Melkonov.Oleg.hw20230808.autos;

public class PetrolAuto extends Auto implements Fuelling {

    @Override
    public void fillIn() {
        System.out.println("Автомобиль заправлен " + FuelType.PETROL);
    }

    public PetrolAuto(String brand, String model, int year){
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
}
