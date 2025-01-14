package com.anil.adapter;

import com.anil.processor.PaymentProcessor;
import org.springframework.stereotype.Component;

@Component
public class PayPalAdapter implements PaymentProcessor {

    public void makePayment(double amount) {
        // PayPal-specific logic to process payment
        //actual api
        System.out.println("Payment processed via PayPal: " + amount);
    }
}
