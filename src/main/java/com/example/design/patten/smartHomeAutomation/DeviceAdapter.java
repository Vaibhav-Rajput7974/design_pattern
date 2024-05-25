package com.example.design.patten.smartHomeAutomation;

public class DeviceAdapter implements Device{
    private DeviceCommand deviceCommand;

    public DeviceAdapter(DeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    @Override
    public void exicute() {
        deviceCommand.exicute();
    }
}
