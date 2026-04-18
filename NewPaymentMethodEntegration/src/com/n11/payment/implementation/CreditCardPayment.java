package com.n11.payment.implementation;

import com.n11.payment.abstracts.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " TL Paid with credit card. Card No: " + cardNumber);
    }
}
