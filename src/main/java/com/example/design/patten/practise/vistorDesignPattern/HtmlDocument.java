package com.example.design.patten.practise.vistorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    List<HtmlNode> htmlNodes = new ArrayList<>();

    public void add(HtmlNode node){
        htmlNodes.add(node);
    }

    public void accept(NodeVistor nodeVistor){
        for (HtmlNode node : htmlNodes){
            node.accept(nodeVistor);
        }
    }
}
