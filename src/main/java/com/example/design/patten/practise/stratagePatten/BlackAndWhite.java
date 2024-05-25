package com.example.design.patten.practise.stratagePatten;

public class BlackAndWhite implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying black and white filter on file +"+fileName);
    }
}
