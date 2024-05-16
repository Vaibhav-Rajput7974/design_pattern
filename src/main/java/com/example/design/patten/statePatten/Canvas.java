package com.example.design.patten.statePatten;

public class Canvas {
    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public void mouseUp(){
        tool.mouseUp();
    }

    public void mouseDown()
    {
        tool.mouseDown();
    }
}
