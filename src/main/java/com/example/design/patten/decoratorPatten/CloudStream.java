package com.example.design.patten.decoratorPatten;

public class CloudStream implements CloudStreamInterface{
    @Override
    public void write(String data) {
        System.out.println("storing data "+data);
    }
}
