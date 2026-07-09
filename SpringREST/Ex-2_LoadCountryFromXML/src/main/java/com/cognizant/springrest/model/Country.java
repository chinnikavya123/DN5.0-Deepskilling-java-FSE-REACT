package com.cognizant.springrest.model;

// Model class representing a Country
public class Country {

    private String code;
    private String name;

    // Default constructor
    public Country() {
    }

    // Parameterized constructor
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter for code
    public String getCode() {
        return code;
    }

    // Setter for code
    public void setCode(String code) {
        this.code = code;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Returns the object as a string
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}

/*
 * Learned:
 * - Created a model class.
 * - Used constructors, getters, and setters.
 * - Used toString() to display object details.
 */