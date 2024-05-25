package com.example.design.patten.practise.momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<NotesState> states = new ArrayList<>();

    public void push(NotesState notesState){
        states.add(notesState);
    }

    public NotesState pop(){
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
