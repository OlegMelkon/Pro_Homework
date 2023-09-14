package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class YearAdComparator implements Comparator<Ad> {
    public int compare(Ad ad1, Ad ad2) {
        return Integer.compare(ad1.getYear(), ad2.getYear());
    }
}
