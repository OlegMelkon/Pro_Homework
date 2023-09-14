package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class DescriptionAdComparator implements Comparator<Ad> {
    @Override
    public int compare(Ad ad1, Ad ad2) {
        return ad1.getDescription().compareTo(ad2.getDescription());
    }
}
