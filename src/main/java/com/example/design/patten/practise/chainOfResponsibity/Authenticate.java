package com.example.design.patten.practise.chainOfResponsibity;

public class Authenticate extends Handler{
    public Authenticate(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandel(HttpRequest request) {
        System.out.println("Authenticating ");
        return !(request.getUserName().equals("admin") && request.getPassword().equals("1234"));
    }
}
