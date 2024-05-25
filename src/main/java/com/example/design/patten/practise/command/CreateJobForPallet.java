package com.example.design.patten.practise.command;

public class CreateJobForPallet implements JobCommond {

    private CreateJob createJob;

    public CreateJobForPallet(CreateJob createJob) {
        this.createJob = createJob;
    }

    @Override
    public void createJob() {
        createJob.createJobForPallet();
    }
}
