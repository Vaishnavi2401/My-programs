package com.example.multithreading.sevices;

import org.springframework.beans.factory.annotation.Autowired;

public class ATM extends Thread{

    @Autowired
    private HDFCBank bank;

    public ATM(HDFCBank bank){
        this.bank = bank;
    } 

    @Override
    public void run(){

        System.out.println("withdrawal money");
        bank.withdrawal(4000);

    }
    
}
