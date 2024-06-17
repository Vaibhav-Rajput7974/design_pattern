package com.example.design.patten.practise.observerDesignPattern.example1;

public class ChatBoat implements Observer{
    private DataSource dataSource;

    public ChatBoat(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chat boot updated, value: "+dataSource.getValue());
    }
}
