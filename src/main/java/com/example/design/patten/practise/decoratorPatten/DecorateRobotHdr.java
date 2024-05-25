package com.example.design.patten.practise.decoratorPatten;

public abstract class DecorateRobotHdr implements RobotHdrInterface{
    protected RobotHdrInterface robotHdrInterface;

    public DecorateRobotHdr(RobotHdrInterface robotHdrInterface) {
        this.robotHdrInterface = robotHdrInterface;
    }

    @Override
    public void crud() {
        robotHdrInterface.crud();
    }
}
