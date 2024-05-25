package com.example.design.patten.eCommercePlateform;

public class Standard implements Shipping{
    @Override
    public void cost() {

        System.out.println(" 100 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("Within a week ");
    }
}
