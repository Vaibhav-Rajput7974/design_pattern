package com.example.design.patten.momento;

public class Character {
    private int x;
    private int y;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CharacterMemento saveToMemento() {
        return new CharacterMemento(x, y);
    }

    public void restoreFromMemento(CharacterMemento memento) {
        x = memento.getX();
        y = memento.getY();
    }

}
