package com.example.design.patten.momento;

public class CharacterMemento {
    private int x;
    private int y;

    public CharacterMemento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
