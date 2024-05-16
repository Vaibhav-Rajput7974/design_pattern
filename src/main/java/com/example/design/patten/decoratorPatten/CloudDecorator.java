package com.example.design.patten.decoratorPatten;

public abstract class CloudDecorator implements CloudStreamInterface {

    CloudStreamInterface cloudStreamInterface;

//    public abstract void sunRofe();

    public CloudDecorator(CloudStreamInterface cloudStreamInterface) {
        this.cloudStreamInterface = cloudStreamInterface;
    }

    @Override
    public void write(String data) {
        cloudStreamInterface.write(data);
    }
}
