package com.example.design.patten.practise.vistorDesignPattern;

public class HighLight implements NodeVistor{
    @Override
    public void visit(AncorNode ancorNode) {
        System.out.println("acror node highlight");
    }

    @Override
    public void visit(HeaderNode headerNode) {
        System.out.println("Header node highlight");
    }
}
