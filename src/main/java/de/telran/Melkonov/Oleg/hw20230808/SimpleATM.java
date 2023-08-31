package de.telran.Melkonov.Oleg.hw20230808;

import java.util.Scanner;

public class SimpleATM{
    public static void main(String[] args) {
        ATM atm = new ATM(1000000);
        CreditCardNew creditCard = new CreditCardNew();
        System.out.println(creditCard);
        atm.sc = new Scanner(System.in);

        int choiceRes = atm.choice(atm.checkPin(creditCard.getPinCode()));

        switch (choiceRes){
            case 1:
                atm.checkBalance(creditCard.getBalance());
                break;
            case 2:
                int[] sumsD = atm.depositCash(creditCard.getBalance(), creditCard.getCreditLimit(), creditCard.getCreditDebt());
                creditCard.setBalance(sumsD[0]);
                creditCard.setCreditLimit(sumsD[1]);
                creditCard.setCreditDebt(sumsD[2]);
                System.out.println(creditCard);
                break;
            case 3:
                int[] sumsW = atm.withdrawCash(creditCard.getBalance(), creditCard.getCreditLimit(), creditCard.getCreditDebt());
                creditCard.setBalance(sumsW[0]);
                creditCard.setCreditLimit(sumsW[1]);
                creditCard.setCreditDebt(sumsW[2]);
                System.out.println(creditCard);
                break;
            default:
                System.out.println("Неверный номер!");
                break;
        }
        System.out.println(atm.getCash());
        atm.sc.close();
    }


}
