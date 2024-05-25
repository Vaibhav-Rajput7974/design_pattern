package com.example.design.patten.practise.command;

public class GenerateJob {

    JobCommond jobCommond;

    public void generateIn(JobCommond jobCommond){
        this.jobCommond = jobCommond;
    }

    public void createJob(){
        jobCommond.createJob();
    }
}
