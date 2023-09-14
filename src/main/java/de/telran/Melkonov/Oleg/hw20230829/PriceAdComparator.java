package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class PriceAdComparator implements Comparator<Ad> {
    @Override
    public int compare(Ad ad1, Ad ad2) {
        return Integer.compare(ad1.getPrice(), ad2.getPrice());
    }
}
