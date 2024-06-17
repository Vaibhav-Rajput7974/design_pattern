package com.example.design.patten.practise.flyWeigtPattern;

public class Sheet {
    private String content;

    private Style style;

    public Sheet(String content, Style style) {
        this.content = content;
        this.style = style;
    }

    public void draw(){
        System.out.printf("%s with the fontsize %d  ",content, style.getFontSize());
    }
}
