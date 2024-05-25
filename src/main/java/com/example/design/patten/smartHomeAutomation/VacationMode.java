package com.example.design.patten.smartHomeAutomation;

public class VacationMode extends DecoratorAppliances{
    public VacationMode(Feature feature) {
        super(feature);
    }

    @Override
    public String add() {
        return feature.add() + "Adding vacation mode";
    }
}
