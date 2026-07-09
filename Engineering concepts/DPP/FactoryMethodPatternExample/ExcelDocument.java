package FactoryMethodPatternExample;

public class ExcelDocument implements Document {

    // Opens Excel document
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

/*
Things I Learned:
-----------------
1. Implements the Document interface.
2. Represents an Excel document.
3. Provides its own implementation of open().
*/