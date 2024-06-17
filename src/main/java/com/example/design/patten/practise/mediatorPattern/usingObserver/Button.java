package com.example.design.patten.practise.mediatorPattern.usingObserver;

public class Button extends UIControl {

    boolean isEnable;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
        notification();
    }
}
