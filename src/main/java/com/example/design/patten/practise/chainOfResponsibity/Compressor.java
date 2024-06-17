package com.example.design.patten.practise.chainOfResponsibity;

public class Compressor extends Handler{

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandel(HttpRequest request) {
        System.out.println("Compressing ");
        return false;
    }
}
