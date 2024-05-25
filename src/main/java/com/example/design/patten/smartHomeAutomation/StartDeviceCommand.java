package com.example.design.patten.smartHomeAutomation;

public class StartDeviceCommand implements DeviceCommand {
    private SmartAppliances smartAppliances;

    public StartDeviceCommand(SmartAppliances smartAppliances) {
        this.smartAppliances = smartAppliances;
    }

    @Override
    public void exicute() {
        smartAppliances.start();
    }

}