package com.example.design.patten.practise.vistorDesignPattern;

public class PlaneText implements NodeVistor{
    @Override
    public void visit(AncorNode ancorNode) {
        System.out.println("Plane text aancore ");
    }

    @Override
    public void visit(HeaderNode headerNode) {

    }
}
