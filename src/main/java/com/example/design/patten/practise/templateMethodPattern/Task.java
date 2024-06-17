package com.example.design.patten.practise.templateMethodPattern;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public void exicute(){
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
