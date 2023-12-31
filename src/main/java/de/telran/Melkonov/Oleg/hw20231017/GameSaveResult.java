package de.telran.Melkonov.Oleg.hw20231017;

public class GameSaveResult {
    String name;
    int winCounter;
    int loseCounter;

    @Override
    public String toString() {
        return "GameSaveResult{" +
                "name='" + name + '\'' +
                ", winCounter=" + winCounter +
                ", loseCounter=" + loseCounter +
                '}';
    }
}
