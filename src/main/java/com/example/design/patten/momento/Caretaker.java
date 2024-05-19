package com.example.design.patten.momento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<CharacterMemento> states = new ArrayList<>();

    public void push(CharacterMemento characterMemento){
        states.add(characterMemento);
    }

    public CharacterMemento pop(){
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}