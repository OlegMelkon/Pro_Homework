package de.telran.Melkonov.Oleg.hw20230829;

import Classes.lecture230829.*;

import java.util.Comparator;

public class AdComparator implements Comparator<Ad> {
    @Override
    public int compare(Ad ad1, Ad ad2) {
        Comparator<Ad> comp = new YearAdComparator()
                .thenComparing(new TitleAdComparator())
                .thenComparing(new AuthorAdComparator())
                .thenComparing(new PriceAdComparator())
                .thenComparing(new DescriptionAdComparator());
        return comp.compare(ad1, ad2);
    }
}
