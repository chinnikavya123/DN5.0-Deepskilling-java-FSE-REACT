package FactoryMethodPatternExample;

public class PdfDocument implements Document {

    // Opens PDF document
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}

/*
Things I Learned:
-----------------
1. Implements the Document interface.
2. Represents a PDF document.
3. Provides its own implementation of open().
*/