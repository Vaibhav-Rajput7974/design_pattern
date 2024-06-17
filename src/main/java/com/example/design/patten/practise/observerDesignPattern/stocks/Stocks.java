package com.example.design.patten.practise.observerDesignPattern.stocks;

public class Stocks extends Subject {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        changed();
    }
}
