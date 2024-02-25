package de.telran.Melkonov.Oleg.hw20231116;

public class Mechanic {
    public void serviceBus(Bus bus) {
        System.out.println("Servicing bus now");
        List<Wheels> wheels = bus.getWheels();
        for(Wheel wheel: wheels) {
            if (wheel.isBroken()){
                wheel.repair();
            }
        }
        if (bus.isBroken()){
            Thread.sleep(2000);
            System.out.println("Repair");
            bus.setBroken(false);
        }
    }

    public void serviceCar(Car car) {
        System.out.println("Servicing car now");
        List<Wheels> wheels = bus.getWheels();

        for(Wheel wheel: wheels) {
            if (wheel.isBroken()){
                wheel.repair();
            }
        }
    }
}
