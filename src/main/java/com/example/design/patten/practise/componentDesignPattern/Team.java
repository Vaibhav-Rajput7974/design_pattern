package com.example.design.patten.practise.componentDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component{

    List<Component> components = new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }
    @Override
    public void handel() {
        for (Component component:components){
            component.handel();
        }
    }
}
