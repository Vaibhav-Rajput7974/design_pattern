package com.example.design.patten.practise.observerDesignPattern.example1;

public class SpreadSheet implements Observer{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spread sheet updated, value: "+dataSource.getValue());
    }
}
