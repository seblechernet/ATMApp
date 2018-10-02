package com.seb;

import java.util.ArrayList;

public class Account {

    private String userName;
    private int accountNumber;
    private double balance;
    private String pin;

    public Account(String userName, int accountNumber, double balance, String pin) {
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

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }







}

