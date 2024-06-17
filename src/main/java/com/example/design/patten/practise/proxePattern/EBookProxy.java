package com.example.design.patten.practise.proxePattern;

public class EBookProxy implements EBook{
    private String fileName;

    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }

    private RealEBook realEBook;
    @Override
    public void show() {
        if(realEBook == null){
            realEBook = new RealEBook(fileName);
        }
        realEBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
