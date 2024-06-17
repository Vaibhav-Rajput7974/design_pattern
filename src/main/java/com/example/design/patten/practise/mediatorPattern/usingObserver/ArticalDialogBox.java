package com.example.design.patten.practise.mediatorPattern.usingObserver;

public class ArticalDialogBox {

    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button saveButton = new Button();

    public ArticalDialogBox() {
        listBox.attach(this::articalSelected);
        textBox.attach(this::titleChange);

    }

    public void simulateUser(){
        listBox.setSelected("123");
//        textBox.setContent("");
        System.out.println("TextBox: "+textBox.getContent());
        System.out.println("Button: "+saveButton.isEnable);
    }

    private void articalSelected() {
        textBox.setContent("22");
        saveButton.setEnable(true);
    }

    private void titleChange() {
        var containt = textBox.getContent();
        boolean enable = (containt == null || containt.isEmpty());
        saveButton.setEnable(!enable);
    }
}
