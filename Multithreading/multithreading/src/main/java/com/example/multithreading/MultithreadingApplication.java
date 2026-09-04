package com.example.multithreading;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.multithreading.sevices.ATM;
import com.example.multithreading.sevices.GooglePay;
import com.example.multithreading.sevices.HDFCBank;
import com.example.multithreading.sevices.PhonePay;

@SpringBootApplication
public class MultithreadingApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MultithreadingApplication.class, args);
		HDFCBank bank1 = new HDFCBank(4000);

		ATM atm = new ATM(bank1);
		atm.setName("ATM Thread");

		GooglePay gpay = new GooglePay(bank1);
		gpay.setName("Gpay Thread");

		PhonePay ppay = new PhonePay(bank1);
		ppay.setName("pPay Thread");

		atm.start();
		gpay.start();
		ppay.start();

	}

}
