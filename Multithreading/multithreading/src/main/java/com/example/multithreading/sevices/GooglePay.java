package com.example.multithreading.sevices;

import org.springframework.beans.factory.annotation.Autowired;

public class GooglePay extends Thread{

    @Autowired
    private HDFCBank bank;

    public GooglePay(HDFCBank bank){

        this.bank = bank;
    }

    @Override
    public void run(){

        System.out.println("deposit Money");
        bank.deposit(4000);

    }
    
}
