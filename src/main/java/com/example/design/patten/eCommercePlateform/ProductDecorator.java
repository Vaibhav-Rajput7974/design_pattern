package com.example.design.patten.eCommercePlateform;

public abstract class ProductDecorator implements Product{

    protected Product product;
    public ProductDecorator(Product product) {

        this.product = product;
    }

    @Override
    public String feature() {
        return product.feature();
    }
}
