package com.example.design.patten.practise.flyWeigtPattern;

public class Style {
    private final String fontName;
    private final int fontSize;
    private final boolean isbold;

    public Style(String fontName, int fontSize, boolean isbold) {
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.isbold = isbold;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean isIsbold() {
        return isbold;
    }
}
