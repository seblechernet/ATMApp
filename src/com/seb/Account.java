package com.seb;

import java.util.ArrayList;

public class Account {

    private String userName;
    private String accountNumber;
    private double balance;
    private String pin;

    public Account(String userName, String accountNumber, double balance, String pin) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public Account() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

