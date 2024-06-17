package com.example.design.patten.practise.chainOfResponsibity;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handel(HttpRequest request){
        if(doHandel(request)) return;

        if(next  != null){
            next.handel(request);
        }
    }

    public abstract boolean doHandel(HttpRequest request);
}
