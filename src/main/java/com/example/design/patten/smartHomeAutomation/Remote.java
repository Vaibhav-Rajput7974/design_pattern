package com.example.design.patten.smartHomeAutomation;

public class Remote {
    private Device device;

    public void setControl(Device device) {
        this.device = device;
    }

    public void exicute(){
        device.exicute();
    }
}
