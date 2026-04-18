package com.n11.payment.implementation;

import com.n11.payment.abstracts.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
	
	private String Email;
	
	public PayPalPayment(String Email) {
		this.Email = Email;
	}

	@Override
	public void pay (double amount) {
		System.out.println(amount + " TL paid with PayPal. Email Address: " + Email);
	}
}
