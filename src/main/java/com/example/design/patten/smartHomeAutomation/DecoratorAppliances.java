package com.example.design.patten.smartHomeAutomation;

public class DecoratorAppliances implements Feature {
    protected Feature feature;

    public DecoratorAppliances(Feature feature) {
        this.feature = feature;
    }

    @Override
    public String add() {
        return feature.add();
    }
}
