package com.example.design.patten.eCommercePlateform;

public class PhonePay implements PaymentProvider{
    @Override
    public void payWith() {

        System.out.println("Paying with the phonePay ");
    }
}
