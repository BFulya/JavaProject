package com.n11.payment.services;

import com.n11.payment.abstracts.PaymentMethod;

public class PaymentProcessor {

    private static PaymentProcessor instance;
    
    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}