package com.aspose.html.examples;

public class Examples_Java_Document_LoadHTMLdocAsyn_EventNavigate {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument();

        // you can subscribe to the event 'OnLoad'
        document.OnLoad.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
                // manipulate with document here
            }
        });

        document.navigate(dataDir + "input.html");
    }
}