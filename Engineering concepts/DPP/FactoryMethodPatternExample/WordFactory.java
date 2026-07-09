package FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {

    // Creates Word document
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

/*
Things I Learned:
-----------------
1. Creates WordDocument objects.
2. Extends the abstract factory.
3. Encapsulates object creation.
*/