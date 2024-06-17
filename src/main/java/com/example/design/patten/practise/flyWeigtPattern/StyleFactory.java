package com.example.design.patten.practise.flyWeigtPattern;

import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
    Map<String,Style> styleMap = new HashMap<>();

    public Style getStyle(String fontName){
        if(!styleMap.containsKey(fontName)){
            Style style = new Style(fontName,12,true);
            styleMap.put(fontName,style);
        }
        return styleMap.get(fontName);
    }
}
