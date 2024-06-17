package com.example.design.patten.practise.vistorDesignPattern;

public class AncorNode implements HtmlNode {
    @Override
    public void accept(NodeVistor nodeVistor) {
        nodeVistor.visit(this);
    }
}
