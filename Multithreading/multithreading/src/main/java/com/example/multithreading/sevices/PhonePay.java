package com.example.multithreading.sevices;

public class PhonePay extends Thread {

    private HDFCBank bank;

    public PhonePay() {
    }

    public PhonePay(HDFCBank bank) {

        this.bank = bank;
    }

    public void run(){
        System.out.println("check balance");
        bank.balancecheck();
    }

    

    
}
