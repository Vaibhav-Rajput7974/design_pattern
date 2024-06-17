package com.example.design.patten.practise.facade;

public class Twitter {

    public RequestToken getRequestToke(String user){
        return new RequestToken();
    }
    public AccedToken getAccesToken(RequestToken requestToken){
        return new AccedToken();
    }

}
