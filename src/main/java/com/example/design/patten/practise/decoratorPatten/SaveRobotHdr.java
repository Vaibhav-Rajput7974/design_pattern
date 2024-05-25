package com.example.design.patten.practise.decoratorPatten;

public class SaveRobotHdr extends DecorateRobotHdr{
    public SaveRobotHdr(RobotHdrInterface robotHdrInterface) {
        super(robotHdrInterface);
    }

    @Override
    public void crud() {
        robotHdrInterface.crud();
        save();
    }
    void save(){
        System.out.println("Saving the robot_hdr");
    }
}
