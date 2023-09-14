package de.telran.Melkonov.Oleg.hw20230829;

public class Child implements Comparable<Child>{
    private int height;

    public Child(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Child{" +
                "height=" + height +
                '}';
    }

    @Override
    public int compareTo(Child o) {
        int diff = this.getHeight() - o.getHeight();
        return diff;
    }
}
