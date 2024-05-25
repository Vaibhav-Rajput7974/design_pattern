package com.example.design.patten.practise.command;

import com.example.design.patten.practise.command.fx.Command;
import com.example.design.patten.practise.command.fx.Light;

public class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}