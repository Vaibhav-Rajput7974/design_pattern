package com.example.design.patten.stratagePatten;

public class Vived implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Vived filter on file +"+fileName);
    }
}
