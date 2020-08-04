package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Initialize an empty HTML Document.
        var document = new com.aspose.html.HTMLDocument();
        try {
            // Create a text element and add it to the document
            var text = document.createTextNode("Hello World!");
            document.getBody().appendChild(text);

            // Save the HTML to the file on disk.
            document.save(dataDir + "document.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}