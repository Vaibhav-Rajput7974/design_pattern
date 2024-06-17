package com.example.design.patten.practise.proxePattern;

import java.util.HashMap;
import java.util.Map;

public class Libray {
    Map<String,EBook> eBookMap= new HashMap();

    public void add(EBook eBook){
        eBookMap.put(eBook.getFileName(),eBook);
    }

    public void open(String fileName){
        eBookMap.get(fileName).show();
    }
}
