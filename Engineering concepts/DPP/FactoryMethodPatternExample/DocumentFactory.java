package FactoryMethodPatternExample;

public abstract class DocumentFactory {

    // Factory method
    public abstract Document createDocument();
}

/*
Things I Learned:
-----------------
1. Abstract factory declares the object creation method.
2. Concrete factories implement this method.
3. Client depends on the factory, not concrete classes.
*/