package com.example.design.patten.practise.statePatten;

public class ProductSelectedState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}