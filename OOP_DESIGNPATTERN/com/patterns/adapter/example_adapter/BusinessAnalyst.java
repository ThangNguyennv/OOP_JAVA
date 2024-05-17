package com.patterns.adapter.example_adapter;

public class BusinessAnalyst implements Customer{
    private Developer dev;

    public BusinessAnalyst(Developer dev) {
        this.dev = dev;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("Reading request...");
        System.out.println(request);
        String information = this.translate(request);
        System.out.println("Sending information...");
        dev.receive(information);
    }

    private String translate(String request) {
        return "Create Google Meet";
    }
    
}
