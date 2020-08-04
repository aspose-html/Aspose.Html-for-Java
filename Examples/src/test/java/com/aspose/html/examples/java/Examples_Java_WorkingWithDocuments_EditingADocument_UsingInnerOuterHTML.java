package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_EditingADocument_UsingInnerOuterHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Create an instance of HTML Document
        var document = new com.aspose.html.HTMLDocument();
        try {
            // Write the content of the HTML document into the console output
            System.out.println(document.getDocumentElement().getOuterHTML()); // output: <html><head></head><body></body></html>

            // Set content of the body element
            document.getBody().setInnerHTML("<p>Hello World!!</p>");

            // Write the content of the HTML document into the console output
            System.out.println(document.getDocumentElement().getOuterHTML()); // output: <html><head></head><body><p>Hello World!!</p></body></html>
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}