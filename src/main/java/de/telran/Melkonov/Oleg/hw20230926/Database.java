package de.telran.Melkonov.Oleg.hw20230926;

import java.util.HashMap;
import java.util.Map;

public class Database {
    static Map<? extends Number, String> dataBase;

    public static void main(String[] args) {
            dataBase = fillMap();
            System.out.println(dataBase);
    }

    private static Map<? extends Number, String> fillMap() {
        Map<Integer, String> tmpMap = new HashMap<>();
        tmpMap.put(1, "Ball");
        tmpMap.put(2, "Table");
        return tmpMap;
    }
}
