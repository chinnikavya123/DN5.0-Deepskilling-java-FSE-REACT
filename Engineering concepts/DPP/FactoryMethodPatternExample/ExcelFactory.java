package FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {

    // Creates Excel document
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

/*
Things I Learned:
-----------------
1. Creates ExcelDocument objects.
2. Extends the abstract factory.
3. Encapsulates object creation.
*/