package de.telran.Melkonov.Oleg.HW20230801;

public class PopSinger implements Danceable, Singable{
    @Override
    public void dance() {
        System.out.println("dancing");
    }

    @Override
    public void sing() {
        System.out.println("singing");
    }
}
