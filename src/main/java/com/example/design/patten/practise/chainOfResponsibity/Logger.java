package com.example.design.patten.practise.chainOfResponsibity;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandel(HttpRequest request) {
        System.out.println("Logging ");
        return false;
    }
}
