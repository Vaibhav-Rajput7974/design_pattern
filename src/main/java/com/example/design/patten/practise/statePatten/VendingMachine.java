package com.example.design.patten.practise.statePatten;

public class VendingMachine {
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
