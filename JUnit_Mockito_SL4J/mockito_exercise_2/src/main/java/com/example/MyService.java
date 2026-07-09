package com.example;

// Service class
public class MyService {

    private ExternalApi api;

    // Constructor
    public MyService(ExternalApi api) {
        this.api = api;
    }

    // Calls the external API
    public String fetchData() {
        return api.getData();
    }

}
