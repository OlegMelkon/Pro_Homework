package de.telran.Melkonov.Oleg.hw20230815;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFactory {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);
        list.add("Radiator");
        list.add("Thermostat");
        list.add("Pump");
        list.add("Battery");
        list.add("Connector");
        list.add("Starter");
        list.add("Tank");
        list.add("Filter");
        list.add("Radiator");
        list.add("Pump");
        list.add("Battery");
        list.add("Connector");
        list.add("Radiator");
        list.add("Battery");
        list.add("Connector");
        list.add("Starter");
        list.add("Tank");
        list.add("Piston");
        list.add("Cylinder");
        list.add("Radiator");
        System.out.println(list);
        searchDeleteItem(list, list.get(0));
        System.out.println(list);
        
    }
    
    public static void searchDeleteItem(ArrayList list, String item){
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) == item) list.remove(i);
        }
    }

}
