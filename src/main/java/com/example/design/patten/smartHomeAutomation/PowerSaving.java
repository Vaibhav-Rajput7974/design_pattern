package com.example.design.patten.smartHomeAutomation;

public class PowerSaving extends DecoratorAppliances{

    public PowerSaving(Feature feature) {
        super(feature);
    }

    @Override
    public String add() {
        return super.add() + "Power saving mode added" ;
    }
}
