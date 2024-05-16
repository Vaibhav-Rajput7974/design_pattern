package com.example.design.patten.statePatten;

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
