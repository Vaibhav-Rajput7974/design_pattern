package com.example.design.patten.eCommercePlateform;

public class Expedited implements Shipping{
    @Override
    public void cost() {

        System.out.println("1000 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("Within 3 day ");
    }
}
