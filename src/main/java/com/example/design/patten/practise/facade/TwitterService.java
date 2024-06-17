package com.example.design.patten.practise.facade;

public class TwitterService {
    Twitter twitter = new Twitter();
    AccedToken createToken(String user){
        RequestToken requestToken = twitter.getRequestToke(user);
        return twitter.getAccesToken(requestToken);
    }
    public void recentTwittes(String user){
        createToken(user);
        System.out.println("Recent twittes ");
    }

    public void newTwit(String user){
        createToken(user);
        System.out.println("adding new twit");
    }
    public void likeTwit(String user){
        createToken(user);
        System.out.println("Liking new twit");
    }
}
