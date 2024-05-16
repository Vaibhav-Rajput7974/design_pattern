package com.example.design.patten.command;

import com.example.design.patten.command.fx.Command;

public class AddCustomerCommand implements Command {

    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void exicute() {
        customerService.addCustomer();
    }
}
