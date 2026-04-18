package com.n11.payment;
import com.n11.payment.services.PaymentProcessor;
import com.n11.payment.implementation.CreditCardPayment;
import com.n11.payment.implementation.PayPalPayment;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();


        CreditCardPayment creditCard = new CreditCardPayment("1234-5678-9999");
        
        processor.processPayment(creditCard, 250);
        
        PayPalPayment emailPayment = new PayPalPayment("bfulyabilgec@gmail.com");
        
        processor.processPayment(emailPayment, 98.9);
    }
}