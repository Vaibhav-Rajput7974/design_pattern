package com.example.design.patten.statePatten;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Brush is selected");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing a line");
    }
}
