package FactoryMethodPatternExample;

public class WordDocument implements Document {

    // Opens Word document
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }
}

/*
Things I Learned:
-----------------
1. Implements the Document interface.
2. Represents a Word document.
3. Provides its own implementation of open().
*/