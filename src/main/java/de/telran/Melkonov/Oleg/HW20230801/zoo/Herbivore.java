package de.telran.Melkonov.Oleg.HW20230801.zoo;

public abstract class Herbivore extends Animal{
    public abstract void voice();

    public abstract void eat(String food);

    @Override
    public void jump() {
        super.jump();
    }
}
