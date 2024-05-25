package com.example.design.patten.smartHomeAutomation;

public class StopDeviceCommand implements DeviceCommand {
    private SmartAppliances smartAppliances;

    public StopDeviceCommand(SmartAppliances smartAppliances) {
        this.smartAppliances = smartAppliances;
    }

    @Override
    public void exicute() {
        smartAppliances.stop();
    }
}