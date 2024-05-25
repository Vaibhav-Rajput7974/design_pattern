package com.example.design.patten.practise.decoratorPatten;

public class ValidateData extends DecorateRobotHdr{
    public ValidateData(RobotHdrInterface robotHdrInterface) {
        super(robotHdrInterface);
    }

    @Override
    public void crud() {
        robotHdrInterface.crud();
        validate();
    }
    public void validate(){
        System.out.println("validating data in the robot_hdr");
    }
}
