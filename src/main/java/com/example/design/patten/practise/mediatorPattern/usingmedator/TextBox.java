package com.example.design.patten.practise.mediatorPattern.usingmedator;

public class TextBox extends UIControl{
    public TextBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        dialogBox.changes(this);
    }
}
