package com.example.design.patten.adapterDesignPattern;

public class FiegnClient implements ApiCallProvider{
    @Override
    public void exicute() {
        System.out.println("Calling api throw fiegn client to create workspace");
    }
}
