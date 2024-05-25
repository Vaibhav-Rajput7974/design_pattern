package com.example.design.patten.practise.command;

public class CreateJobForReplen implements JobCommond{

    private CreateJob createJob;

    public CreateJobForReplen(CreateJob createJob) {
        this.createJob = createJob;
    }
    @Override
    public void createJob() {
        createJob.createJobInReplen();
    }
}
