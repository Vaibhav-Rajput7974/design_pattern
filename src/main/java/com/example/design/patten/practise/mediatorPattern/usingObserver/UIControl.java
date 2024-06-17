package com.example.design.patten.practise.mediatorPattern.usingObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    protected void notification(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
