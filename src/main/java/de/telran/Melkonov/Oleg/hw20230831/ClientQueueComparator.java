package de.telran.Melkonov.Oleg.hw20230831;

import java.util.Comparator;

public class ClientQueueComparator implements Comparator<Client> {
    @Override
    public int compare(Client c1, Client c2) {
        if (c1.compareTo(c2) == 1){
            return 1;
        }else return -1;
    }
}
