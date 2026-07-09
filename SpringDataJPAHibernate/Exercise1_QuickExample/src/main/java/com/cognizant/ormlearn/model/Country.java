package com.cognizant.ormlearn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Marks this class as a database table
@Entity
public class Country {

    // Marks this field as the primary key
    @Id
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
}

/*
 * Learned:
 * - Used @Entity to map the class to a database table.
 * - Used @Id to define the primary key.
 * - Created constructors, getters, and setters.
 */
