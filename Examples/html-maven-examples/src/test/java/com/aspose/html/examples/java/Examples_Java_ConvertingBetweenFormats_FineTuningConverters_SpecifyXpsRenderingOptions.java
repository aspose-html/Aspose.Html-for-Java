package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyXpsRenderingOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code = "<span>Hello World!!</span>";

        // Initialize the HTML document from the HTML code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of XpsRenderingOptions and set a custom page-size
            var options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
            var anyPage = new com.aspose.html.drawing.Page();
            anyPage.setSize(
                    new com.aspose.html.drawing.Size(
                            com.aspose.html.drawing.Length.fromInches(5),
                            com.aspose.html.drawing.Length.fromInches(2)
                    )
            );
            options.getPageSetup().setAnyPage(anyPage);

            // Create the XPS Device and specify options and output file
            var device = new com.aspose.html.rendering.xps.XpsDevice(options, dataDir + "output.xps");
            try {
                // Render HTML to XPS
                document.renderTo(device);
            } finally {
                if (device != null) {
                    device.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}