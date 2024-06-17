package com.example.design.patten.practise.mediatorPattern.usingmedator;

public class ListBox extends UIControl{
    public ListBox(DialogBox dialogBox) {
        super(dialogBox);
    }
    private String selected;

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
        dialogBox.changes(this);
    }
}
