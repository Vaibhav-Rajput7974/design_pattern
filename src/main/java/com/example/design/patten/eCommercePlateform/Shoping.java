package com.example.design.patten.eCommercePlateform;

public class Shoping {

    private CheckoutCommand checkoutCommand;

    public void setCheckoutCommand(CheckoutCommand checkoutCommand) {

        this.checkoutCommand = checkoutCommand;
    }

    public void execute(){
        checkoutCommand.execute();
    }

    public void product(Product product){

        System.out.println(product.feature());
    }

    public void ship(Shipping shipping){
        shipping.cost();
        shipping.deliveryTime();
    }

    public void pay(Payment payment){
        payment.pay();
    }

}
