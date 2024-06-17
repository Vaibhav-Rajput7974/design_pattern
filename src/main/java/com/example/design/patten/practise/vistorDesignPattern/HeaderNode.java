package com.example.design.patten.practise.vistorDesignPattern;

public class HeaderNode implements HtmlNode{
    @Override
    public void accept(NodeVistor nodeVistor) {
        nodeVistor.visit(this);
    }
}
