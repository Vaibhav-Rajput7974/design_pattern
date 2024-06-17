package com.example.design.patten.practise.mediatorPattern.usingObserver;

public class ListBox extends UIControl {
    private String selected;

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
        notification();
    }
}
