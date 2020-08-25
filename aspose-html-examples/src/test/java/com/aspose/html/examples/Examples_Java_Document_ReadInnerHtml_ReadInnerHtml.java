package com.aspose.html.examples;

public class Examples_Java_Document_ReadInnerHtml_ReadInnerHtml {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        String InputHtml = dataDir + "input.html";
        // Create HtmlDocument instance to load existing HTML file
        var document = new com.aspose.html.HTMLDocument(InputHtml);
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
    }
}