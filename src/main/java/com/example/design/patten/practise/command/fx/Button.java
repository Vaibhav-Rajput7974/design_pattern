package com.example.design.patten.practise.command.fx;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }


    public void click(){
        command.execute();
    }
}
