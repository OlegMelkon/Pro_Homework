package de.telran.Melkonov.Oleg.hw20230808.autos;

public class AutoTest {
    public static void main(String[] args) {
        ElectroAuto electroAuto = new ElectroAuto("Tesla", "Model X", 2023);
        PetrolAuto petrolAuto = new PetrolAuto("BMW", "M5", 2021);
        DieselAuto dieselAuto = new DieselAuto("Mercedes-Benz", "E 300", 2020);
        HybridAuto hybridAuto = new HybridAuto("Lexus", "GS 400", 2022);
        ModernAutoService modernAutoService = new ModernAutoService();

        electroAuto.setTires(Tire.WINTER, Tire.WINTER, Tire.WINTER, Tire.WINTER);
        petrolAuto.setTires(Tire.SUMMER, Tire.SUMMER, Tire.SUMMER, Tire.SUMMER);
        dieselAuto.setTires(Tire.WINTER, Tire.WINTER, Tire.WINTER, Tire.WINTER);
        hybridAuto.setTires(Tire.SUMMER, Tire.SUMMER, Tire.SUMMER, Tire.SUMMER);

        electroAuto.start();
        electroAuto.ride();

        hybridAuto.start();
        hybridAuto.ride();

        petrolAuto.start();
        petrolAuto.ride();

        dieselAuto.start();
        dieselAuto.ride();

        if (electroAuto.breakDown() != 1) modernAutoService.repair();
        if (petrolAuto.breakDown() != 1) modernAutoService.repair();
        if (dieselAuto.breakDown() != 1) modernAutoService.repair();
        if (hybridAuto.breakDown() != 1) modernAutoService.repair();

        modernAutoService.changeTires(electroAuto.getBrand(), Tire.SUMMER);
        modernAutoService.changeTires(dieselAuto.getBrand(), Tire.SUMMER);

    }
}
