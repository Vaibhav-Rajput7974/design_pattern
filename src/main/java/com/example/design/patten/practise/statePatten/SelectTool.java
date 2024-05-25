package com.example.design.patten.practise.statePatten;

public class SelectTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Selection tool is Selected ");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing a rectangle");
    }
}
