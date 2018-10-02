package com.seb;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
   private double deposit;
   private double withdraw;


    public ATM(double deposit, double withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public ATM() {
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }


    public static void dataBase(){

         ArrayList<Account> acounts=new ArrayList<Account>(3);
         Account account1=new Account();
         account1.setUserName("Seble");
         account1.setAccountNumber(001);
         account1.setBalance(100.00);
         account1.setPin("0000");
         acounts.add(account1);
         Account account2=new Account();
         account2.setUserName("Ebor");
         account2.setAccountNumber(002);
         account2.setBalance(200.00);
         account2.setPin("1111");
         acounts.add(account2);
         Account account3=new Account();
         account3.setUserName("Edna");
         account3.setAccountNumber(003);
         account3.setBalance(300.00);
         account3.setPin("2222");
         acounts.add(account3);

       Scanner input= new Scanner(System.in);
       System.out.println("Enter your Account number");
       int accountNumber=input.nextInt();
       if accountNumber=account1.getAccountNumber() ||
   }
}
