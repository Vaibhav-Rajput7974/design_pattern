package com.example.design.patten.decoratorPatten;

public class Compressor extends CloudDecorator{
    public Compressor(CloudStreamInterface cloudStreamInterface) {
        super(cloudStreamInterface);
    }

    @Override
    public void write(String data) {
        cloudStreamInterface.write(compressor(data));
    }

    public String compressor(String data){
        return data.substring(2);
    }
}
