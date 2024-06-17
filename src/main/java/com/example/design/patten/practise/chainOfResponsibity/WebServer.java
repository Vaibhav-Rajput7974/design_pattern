package com.example.design.patten.practise.chainOfResponsibity;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handel(HttpRequest request){
        handler.handel(request);
    }


}
