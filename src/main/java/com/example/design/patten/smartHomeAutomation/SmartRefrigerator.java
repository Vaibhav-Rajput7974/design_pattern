package com.example.design.patten.smartHomeAutomation;

public class SmartRefrigerator implements SmartAppliances{
    @Override
    public void start() {
        System.out.println("Started Cooling ");
    }

    @Override
    public void stop() {
        System.out.println("Stopping refrigerator");
    }

    @Override
    public String add(Feature feature) {
        return feature.add();
    }

    public void adjustTemperature(TemperatureControl temperatureControl){
        System.out.println(temperatureControl.cool());
    }
}
