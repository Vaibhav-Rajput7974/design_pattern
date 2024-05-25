package com.example.design.patten.eCommercePlateform;

public class ApplyDiscount implements CheckoutCommand{

    private Order order;
    public ApplyDiscount(Order order) {

        this.order = order;
    }

    @Override
    public void execute() {
        order.applyDiscount();
    }
}
