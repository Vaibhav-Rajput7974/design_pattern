package com.example.design.patten.practise.adapterDesignPattern;

public class WebClient implements ApiCallProvider {
    @Override
    public void exicute() {
        System.out.println("calling api throw web client to create workspace");
    }
}
