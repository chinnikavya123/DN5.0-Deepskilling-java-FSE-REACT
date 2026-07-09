package FactoryMethodPatternExample;

public interface Document {

    // Common method for all document types
    void open();
}

/*
Things I Learned:
-----------------
1. Interface defines common behavior.
2. All document classes implement this interface.
3. Supports polymorphism.
*/