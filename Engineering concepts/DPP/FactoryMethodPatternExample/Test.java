package FactoryMethodPatternExample;

public class Test {

    public static void main(String[] args) {

        // Create and open Word document
        DocumentFactory wordFactory = new WordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        // Create and open PDF document
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        // Create and open Excel document
        DocumentFactory excelFactory = new ExcelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}

/*
Output:
-------
Opening Word Document...
Opening PDF Document...
Opening Excel Document...

Things I Learned:
-----------------
1. Factory Method creates objects without using 'new' in the client.
2. Client works with the Document interface.
3. Different factories create different document types.
4. Factory Method reduces coupling between client and concrete classes.
5. New document types can be added without changing existing client code.
*/