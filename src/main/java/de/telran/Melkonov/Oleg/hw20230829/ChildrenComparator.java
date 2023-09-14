package de.telran.Melkonov.Oleg.hw20230829;

import java.util.Comparator;

public class ChildrenComparator implements Comparator<Child> {
    @Override
    public int compare(Child pupil1, Child pupil2) {
        return Integer.compare(pupil1.getHeight(), pupil2.getHeight());
    }
}
