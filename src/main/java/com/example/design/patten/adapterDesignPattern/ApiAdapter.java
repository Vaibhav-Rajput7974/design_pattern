package com.example.design.patten.adapterDesignPattern;

public class ApiAdapter implements ApiCall{

    ApiCallProvider apiCallProvider;

    public ApiAdapter(ApiCallProvider apiCallProvider) {
        this.apiCallProvider = apiCallProvider;
    }
    @Override
    public void exicute() {
        apiCallProvider.exicute();
    }
}
