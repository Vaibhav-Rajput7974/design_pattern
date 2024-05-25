package com.example.design.patten.smartHomeAutomation;

public class SmartFan implements SmartAppliances{
    @Override
    public void start() {
        System.out.println("Stating Fan");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Fan");
    }

    @Override
    public String add(Feature feature) {
        return feature.add();
    }

}
