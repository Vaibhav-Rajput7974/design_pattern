package com.example.design.patten.practise.proxePattern;

public class RealEBook implements EBook{

    private String fileName;

    public RealEBook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        System.out.println("showing file with the name : "+fileName);
    }

    private void load(){
        System.out.println("Loading file with the name : "+fileName);
    }


    @Override
    public String getFileName() {
        return fileName;
    }
}
