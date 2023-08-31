package de.telran.Melkonov.Oleg.hw20230808;

import java.util.Scanner;

public class ATM {
    private int cash;
   public ATM(int cash){
    this.cash = cash;
   }

    public int getCash() {
        return cash;
    }

    public static Scanner sc;
   public boolean checkPin(int pinCard){
       System.out.print("Введите пин-код: ");
       int pinUser = sc.nextInt();
       if (pinUser == pinCard) return true; else return false;
   }
    public int choice(boolean pinResult){
       if (pinResult) {
           System.out.println("Проверить баланс - 1");
           System.out.println("Внести наличные - 2");
           System.out.println("Получить наличные - 3");
           int choice = sc.nextInt();
           if (choice == 1 || choice == 2 || choice == 3) return choice; else return 0;
       } else {
           System.out.println("Неверный пин-код!"); return 0;
       }

   }
    public void checkBalance(int balance){
        System.out.println("Баланс карты: " + balance);
   }

    public int[] withdrawCash(int balance, int creditLimit, int creditDebt){
        System.out.print("Введите сумму снятия: ");
        int sumW = sc.nextInt();
        if (sumW > cash) System.out.println("В банкомате недостаточно денег!");
        else{
            if (sumW <= balance){
                balance = balance - sumW;
                System.out.println("Получите сумму " + sumW + ". Баланс: " + balance + ". Кредитный лимит: " + creditLimit + ". Зажолженность: " + creditDebt);
                cash -= sumW;
            } else if(sumW > balance && sumW <= (balance + creditLimit)) {
                creditDebt = sumW - balance;
                creditLimit -= creditDebt;
                balance = 0;
                System.out.println("Получите сумму " + sumW + ". Баланс: " + balance + ". Задолженность: " + creditDebt + ". Кредитный лимит: " + creditLimit);
                cash -= sumW;
            } else {
                System.out.println("Превышен кредитный лимит. Операция отклонена.");
            }
        }
        int[] sumsW = {balance, creditLimit, creditDebt};
        return sumsW;
    }
    public int[] depositCash(int balance, int creditLimit, int creditDebt){
        System.out.print("Введите сумму внесения: ");
        int sumD = sc.nextInt();
        if (creditDebt > 0 && sumD > creditDebt){
            balance += (sumD - creditDebt);
            creditDebt = 0;
        } else if (creditDebt > 0 && sumD < creditDebt) {
            creditDebt -= sumD;
        } else if (creditDebt == 0) {
            balance += sumD;
        }
        int[] sumsD = {balance, creditLimit, creditDebt};
        System.out.println("Сумма зачислена. Баланс: " + balance + ". Кредитный лимит: " + creditLimit + ". Задолженность: " + creditDebt);
        cash += sumD;
        return sumsD;
    }

}
