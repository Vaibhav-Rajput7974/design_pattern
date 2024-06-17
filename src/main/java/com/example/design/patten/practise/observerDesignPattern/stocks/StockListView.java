package com.example.design.patten.practise.observerDesignPattern.stocks;

public class StockListView implements Display{

    private Stocks stocks;

    public StockListView(Stocks stocks) {
        this.stocks = stocks;
    }

    @Override
    public void show() {
        System.out.println("Showing changes in the stock list view, new price : "+stocks.getPrice());
    }
}
