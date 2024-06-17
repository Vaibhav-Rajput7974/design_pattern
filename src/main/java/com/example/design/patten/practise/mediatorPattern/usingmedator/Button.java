package com.example.design.patten.practise.mediatorPattern.usingmedator;

public class Button extends UIControl{

    public Button(DialogBox dialogBox) {
        super(dialogBox);
    }

    boolean isEnable;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
        dialogBox.changes(this);
    }
}
