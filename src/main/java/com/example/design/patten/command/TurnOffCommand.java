package com.example.design.patten.command;

import com.example.design.patten.command.fx.Command;
import com.example.design.patten.command.fx.Light;

public class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}