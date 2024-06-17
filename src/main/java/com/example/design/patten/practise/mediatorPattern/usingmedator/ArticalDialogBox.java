package com.example.design.patten.practise.mediatorPattern.usingmedator;

public class ArticalDialogBox extends DialogBox{

    private ListBox listBox = new ListBox(this);
    private TextBox textBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUser(){
        listBox.setSelected("123");
//        textBox.setContent("");
        System.out.println("TextBox: "+textBox.getContent());
        System.out.println("Button: "+saveButton.isEnable);
    }
    @Override
    public void changes(UIControl control) {
        if(control == listBox){
            articalSelected();
        }
        if (control == textBox){
            titleChange();
        }
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
