package com.example.design.patten.decoratorPatten;

public class Encrypt extends CloudDecorator{
    public Encrypt(CloudStreamInterface cloudStreamInterface) {
        super(cloudStreamInterface);
    }

    @Override
    public void write(String data) {
        cloudStreamInterface.write(encrypt(data));
    }

    public String encrypt(String data){
        return "!@#$!$#%#@# "+data;
    }
}
