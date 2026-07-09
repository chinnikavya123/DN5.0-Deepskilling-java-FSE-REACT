package FactoryMethodPatternExample;

public class PdfFactory extends DocumentFactory {

    // Creates PDF document
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

/*
Things I Learned:
-----------------
1. Creates PdfDocument objects.
2. Extends the abstract factory.
3. Encapsulates object creation.
*/