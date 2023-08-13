package de.telran.Melkonov.Oleg.HW20230801;

import java.util.Scanner;

public class CreditCard {
    private int cardNumber;
    private int cardPinCode;
    double balance = 0;
    double creditLimit;
    private double creditDebt = 0;
    private void deposit(int cardPinCode, double sumDeposit){
        if (cardPinCode == this.cardPinCode){
            if (creditDebt > 0 && sumDeposit > creditDebt){
                balance = balance + (sumDeposit - creditDebt);
                creditDebt = 0;
            } else if (creditDebt > 0 && sumDeposit < creditDebt) {
                creditDebt = creditDebt - sumDeposit;
            } else if (creditDebt == 0) {
                balance = balance + sumDeposit;
            }
            System.out.println("Сумма зачислена. Баланс: " + balance + ". Задолженность: " + creditDebt + ". Кредитный лимит: " + creditLimit);
        } else {
            System.out.println("Неверный пин-код. Операция отклонена.");
        }
    }
    private void withdraw(int cardPinCode, double sumWithdraw){
        if (cardPinCode == this.cardPinCode){
            if (sumWithdraw <= balance){
                balance = balance - sumWithdraw;
                System.out.println("Получите сумму. Баланс: " + balance + ". Задолженность: " + creditDebt + ". Кредитный лимит: " + creditLimit);
            } else if(sumWithdraw > balance && sumWithdraw <= (balance + creditLimit)) {
                balance = 0;
                creditDebt = sumWithdraw - balance;
                creditLimit = creditLimit - creditDebt;
                System.out.println("Получите сумму. Баланс: " + balance + ". Задолженность: " + creditDebt + ". Кредитный лимит: " + creditLimit);
            } else System.out.println("Превышен кредитный лимит. Операция отклонена.");
        } else {
            System.out.println("Неверный пин-код. Операция отклонена.");
        }
    }

    private CreditCard(int cardNumber, int cardPinCode){
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234567, 0000);
        creditCard.creditLimit = 10000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пин-код карты: ");
        int pin = sc.nextInt();

        System.out.println("Внести наличные - введите 1. Снять наличные - введите 2.");
        int option = sc.nextInt();
        if (option == 1 || option == 2) {
            if (option ==  1){
                System.out.println("Введите сумму внесения: ");
                double sumDep = sc.nextDouble();
                creditCard.deposit(pin, sumDep);
            } else {
                System.out.println("Введите сумму снятия: ");
                double sumWith = sc.nextDouble();
                creditCard.withdraw(pin,sumWith);
            }
        } else System.out.println("Введено неверное число!");

        sc.close();

    }
}
