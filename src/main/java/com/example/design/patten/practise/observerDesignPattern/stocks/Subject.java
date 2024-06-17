package com.example.design.patten.practise.observerDesignPattern.stocks;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Display> displays = new ArrayList<>();

    public void addDisplay(Display display){
        displays.add(display);
    }

    public void removeDisplay(Display display){
        displays.remove(display);
    }

    public void changed(){
        for (Display display : displays){
            display.show();
        }
    }
}
