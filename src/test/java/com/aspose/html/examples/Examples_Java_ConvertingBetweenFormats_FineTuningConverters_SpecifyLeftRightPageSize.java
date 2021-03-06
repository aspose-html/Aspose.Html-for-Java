package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyLeftRightPageSize {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare an HTML code
        String code = "<style>\n" +
                      "    div { page-break-after: always; }\n" +
                      "</style>\n" +
                      "< div > First Page</div >\n" +
                      "<div > Second Page</div >\n" +
                      "<div > Third Page</div >\n" +
                      "<div > Fourth Page</div >\n";

        // Initialize the HTML document from the HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of Rendering Options and set a custom page-size
            com.aspose.html.rendering.pdf.PdfRenderingOptions options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.getPageSetup().setLeftRightPage(
                    new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(400, 200)),
                    new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(400, 100))
            );

            // Create the PDF Device and specify options and output file
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(options, Resources.output("output.pdf"));
            try {
                // Render HTML to PDF
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