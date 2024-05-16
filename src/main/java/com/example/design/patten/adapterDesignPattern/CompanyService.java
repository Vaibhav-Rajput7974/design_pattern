package com.example.design.patten.adapterDesignPattern;

public class CompanyService {

    ApiCall apiCall;

    public CompanyService(ApiCallProvider apiCallProvider) {
        this.apiCall = new ApiAdapter(apiCallProvider);
    }

    public void createCompany(){
        apiCall.exicute();
        System.out.println("company Created");
    }
}
