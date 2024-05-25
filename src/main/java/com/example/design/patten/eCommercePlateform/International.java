package com.example.design.patten.eCommercePlateform;

public class International implements Shipping{
    @Override
    public void cost() {

        System.out.println("100000 ");
    }
    @Override
    public void deliveryTime() {

        System.out.println("within 1 day ");
    }

}
