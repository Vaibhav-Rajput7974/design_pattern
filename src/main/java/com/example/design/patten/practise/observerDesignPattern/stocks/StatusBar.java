package com.example.design.patten.practise.observerDesignPattern.stocks;

public class StatusBar implements Display{
    private Stocks stocks;

    public StatusBar(Stocks stocks) {
        this.stocks = stocks;
    }

    @Override
    public void show() {
        System.out.println("Showing change in the status bar, new price : "+stocks.getPrice());
    }
}
