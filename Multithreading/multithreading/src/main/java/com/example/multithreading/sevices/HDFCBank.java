package com.example.multithreading.sevices;

public class HDFCBank {

    int accountBalance;

    public HDFCBank(int accountBalance) {

        this.accountBalance = accountBalance;
    }

    public void withdrawal(int withdrawal) {

        accountBalance = accountBalance - withdrawal;

    }

    public void deposit(int deposit) {

        accountBalance = accountBalance + deposit;

    }

    public void balancecheck() {

        System.out.println("uyour account balance is " + accountBalance);

    }

}
