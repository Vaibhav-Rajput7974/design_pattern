package com.example.design.patten.eCommercePlateform;

public class ExtendedWarranties extends ProductDecorator {
    public ExtendedWarranties(Product product) {

        super(product);
    }

    @Override
    public String feature() {

        return super.feature()+ " extend warranty ";
    }
}
