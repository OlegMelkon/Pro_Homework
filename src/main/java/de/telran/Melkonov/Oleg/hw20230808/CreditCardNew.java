package de.telran.Melkonov.Oleg.hw20230808;

public class CreditCardNew {
    protected final String cardNumber = "1234567890";
    protected final int pinCode = 1234;
    private int balance = 100000;
    private int creditLimit = 50000;
    private int creditDebt = 0;

    public int getPinCode() {
        return pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    public String toString() {
        return "CreditCard{" +
                "number='" + cardNumber + '\'' +
                ", pin= ****"  +
                ", balance= " + balance +
                ", creditLimit= " + creditLimit +
                ", creditDebt= " + creditDebt +
                '}';
    }
}
