package de.telran.Melkonov.Oleg.HW20230801;

public class DanceFloor{
    public static void main(String[] args) {
        Danceable firstDancer = new Dancer();
        Danceable secondDancer = new PopDancer();
        Danceable[] listOfDancers = new Danceable[6];
        listOfDancers[0] = firstDancer;
        listOfDancers[1] = secondDancer;
        for (int i = 2; i < listOfDancers.length; i++){
            listOfDancers[i] = new Dancer();
        }
        for (int i = 0; i < listOfDancers.length; i++){
            listOfDancers[i].dance();
        }
    }
}
