package com.seb;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    static ArrayList<Account> accounts = new ArrayList<>();


    private static double balance = 0;
    private static String userName;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose\n A for Existing Account \n B for new Account");
        String option = input.nextLine();
        switch (option) {
            case "A": {
                System.out.println("Enter Account Number:");
                String account = input.nextLine();
               if(operations(account)){

               }
               break;
            }
            case "B": {

                Account newAccount = new Account();
                System.out.println("Enter Name");
                String name = input.nextLine();
                newAccount.setUserName(name);
                System.out.println("Enter Account Number");
                String accNo = input.nextLine();
                newAccount.setAccountNumber(accNo);
                System.out.println("Enter PIN number");
                String pin = input.nextLine();
                newAccount.setPin(pin);
                System.out.println("Enter initial Balance");
                double initBalance = input.nextDouble();
                input.nextLine();
                newAccount.setBalance(initBalance);

                accounts.add(newAccount);

                if(operations(newAccount.getAccountNumber())){

                }
                break;

            }
        }


    }

    public static boolean operations(String accNo) {
        boolean aboolean=true;
        if (validation(accNo)) {

            boolean toContinue = true;
            do {
                System.out.println("Chose the operation you want to perform\n");
                System.out.println("1.Check Balance\n 2. Deposite\n 3. Withdraw\n 4.To Exit");
                String choice = input.nextLine();
                switch (choice) {
                    case "1": {
                        System.out.println("Your Balance is " + balanceCheck(balance));

                        break;
                    }
                    case "2": {
                        System.out.println("Enter money to be deposited");
                        double deposite = input.nextDouble();
                        input.nextLine();
                        System.out.println("You have succefully added " + deposite + "to your blance");
                        System.out.println("your current balance is " + deposit(deposite, accNo));


                        break;
                    }
                    case "3": {
                        System.out.println("Enter money to be withdrawn");
                        double withdraw = input.nextDouble();
                        input.nextLine();
                        System.out.println(withdraw(withdraw, accNo));


                        break;
                    }
                    case "4": {

                        System.out.println("Thank you! Have a good Day");
                        toContinue = false;
                        break;

                    }
                    default: {
                        System.out.println("Invalid Entry");
                        break;
                    }

                }


            } while (toContinue == true);

        } else System.out.println("YOU ARE LOCKED OUT!");

        return aboolean;
    }




public static ArrayList<Account> showAcc(){

        Account acc1 = new Account();
        acc1.setUserName("Seble");
        acc1.setAccountNumber("001");
        acc1.setBalance(100.00);
        acc1.setPin("0000");
        accounts.add(acc1);
        Account acc2 = new Account();
        acc2.setUserName("Ebor");
        acc2.setAccountNumber("002");
        acc2.setBalance(200.00);
        acc2.setPin("1111");
        accounts.add(acc2);
        Account acc3 = new Account();
        acc3.setUserName("Edna");
        acc3.setAccountNumber("003");
        acc3.setBalance(300.00);
        acc3.setPin("2222");
        accounts.add(acc3);

        return accounts;

    }
    public static boolean validation(String accountNumber) {
          boolean validate=false;
            for (Account eachAccount : showAcc()) {

                  if (accountNumber.equals(eachAccount.getAccountNumber())) {
                      System.out.println("Enter PIN");
                      String pin = input.nextLine();
                      if (!pin.equals(eachAccount.getPin())) {
                          int invalid = 0;
                          boolean check = false;
                          do {
                              System.out.println("Enter your PIN again");
                              pin = input.nextLine();
                              if (pin.equals(eachAccount.getPin())) {
                                  check = true;
                                  balance = eachAccount.getBalance();
                                  userName=eachAccount.getUserName();
                                  validate=true;

                              } else
                                  invalid++;

                          } while ((invalid <= 3) && check == false);

                      } else
                          balance=eachAccount.getBalance();
                          validate = true;


                  }


            }

        return validate;
    }



    public static double deposit(double deposit, String accNo) {


        double newBalance = balance+ deposit;
        balance=newBalance;
        return newBalance;

    }


    public static double balanceCheck(double balance) {
        return balance;

    }


    public static String withdraw(double withdraw, String accNo) {

        double newBalance ;

        if (withdraw <= (balance)) {
            newBalance = (balance - withdraw);
            balance=newBalance;
            return  "Take your Money.";

        }
        else
            return "Insufficient Balance";




    }
}
