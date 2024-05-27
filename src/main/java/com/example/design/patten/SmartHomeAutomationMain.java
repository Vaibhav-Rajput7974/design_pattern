package com.example.design.patten;

import com.example.design.patten.smartHomeAutomation.*;

public class SmartHomeAutomationMain {
    public static void assigment(){
        // commond pattern
        SmartRefrigerator smartRefrigerator = new SmartRefrigerator();
        SmartFan smartFan = new SmartFan();
        DeviceCommand startRefrigerator = new StartDeviceCommand(smartRefrigerator);
        DeviceCommand stopFan = new StopDeviceCommand(smartFan);
        Remote remote = new Remote();
//        remote.setControl(startRefrigerator);
//        remote.exicute();
//        remote.setControl(stopFan);
//        remote.exicute();

        // decorator pattern
        Feature AllFeature = new PowerSaving(new VacationMode(new CommonFeature()));
        System.out.println(smartFan.add(AllFeature));


        // Strategy Pattern
        smartRefrigerator.adjustTemperature(new EcoFriendly());
        smartRefrigerator.adjustTemperature(new QuickCool());

        // Adapter pattern
        Device device = new DeviceAdapter(stopFan);
        remote.setControl(device);
        remote.exicute();

    }
}
