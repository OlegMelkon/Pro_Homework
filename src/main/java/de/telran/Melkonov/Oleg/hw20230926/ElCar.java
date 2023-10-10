package de.telran.Melkonov.Oleg.hw20230926;

import Classes.lecture230926.ElectricCar;

public class ElCar implements Comparable<ElCar>{
    int year;

    public ElCar(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(ElCar c) {
        int diff = this.year - c.year;
        return diff;
    }
}
