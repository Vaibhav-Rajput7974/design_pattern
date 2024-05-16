package com.example.design.patten.momento;
public class Notes {
    private String context;

    public NotesState createState(){
        return new NotesState(context);
    }

    public void restore(NotesState state){
        context = state.getContext();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
