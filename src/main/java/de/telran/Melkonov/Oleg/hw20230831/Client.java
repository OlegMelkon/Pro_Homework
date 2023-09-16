package de.telran.Melkonov.Oleg.hw20230831;

public class Client implements Comparable<Client>{
    private boolean isVip;

    public Client(boolean isVip) {
        this.isVip = isVip;
    }

    public boolean getIsVip() {
        return isVip;
    }

    @Override
    public String toString() {
        return "Client{" +
                "isVip=" + isVip +
                '}';
    }

    @Override
    public int compareTo(Client c) {
        if (c.getIsVip() && !this.getIsVip() ){
            return 1;
        } else return 0;
    }
}
