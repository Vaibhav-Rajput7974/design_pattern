package com.example.design.patten.eCommercePlateform;

public class RemoveItem implements CheckoutCommand{
    private Order order;

    public RemoveItem(Order order) {

        this.order = order;
    }
    @Override
    public void execute() {
        order.removeItem();
    }
}
