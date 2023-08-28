package de.telran.Melkonov.Oleg.hw20230808.autos;
public class ModernAutoService extends AutoService {
    @Override
    public void repair() {
        System.out.println("Автомобиль отремонтирован");
    }
    @Override
    public void changeTires(String auto,Tire tireType) {
        System.out.println("На автомобиль " + auto + " установлены шины " + tireType);
    }
}
