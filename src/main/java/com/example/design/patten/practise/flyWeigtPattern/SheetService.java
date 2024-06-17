package com.example.design.patten.practise.flyWeigtPattern;

import com.example.design.patten.practise.flyWeigtPattern.Sheet;
import com.example.design.patten.practise.flyWeigtPattern.StyleFactory;

import java.util.ArrayList;
import java.util.List;

public class SheetService {
    private StyleFactory styleFactory;

    public SheetService(StyleFactory styleFactory) {
        this.styleFactory = styleFactory;
    }

    public List<Sheet> getSheet(){
        List<Sheet> sheets = new ArrayList<>();
        Sheet sheet = new Sheet("hellow world",styleFactory.getStyle("roman"));
        sheets.add(sheet);
        return sheets;
    }
}
