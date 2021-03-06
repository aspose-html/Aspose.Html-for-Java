package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_CombineMultipleHTMLToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code
        String code1 = "<br><span style='color: green'>Hello World!!</span>";
        String code2 = "<br><span style='color: blue'>Hello World!!</span>";
        String code3 = "<br><span style='color: red'>Hello World!!</span>";

        // Create three HTML documents to merge later
        com.aspose.html.HTMLDocument document1 = new com.aspose.html.HTMLDocument(code1, ".");
        com.aspose.html.HTMLDocument document2 = new com.aspose.html.HTMLDocument(code2, ".");
        com.aspose.html.HTMLDocument document3 = new com.aspose.html.HTMLDocument(code3, ".");
        try {
            // Create an instance of HTML Renderer
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create an instance of PDF device
                com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(Resources.output("output.pdf"));
                try {
                    // Merge all HTML documents into PDF
                    renderer.render(device, new com.aspose.html.HTMLDocument[]{document1, document2, document3});
                } finally {
                    if (device != null) {
                        device.dispose();
                    }
                }
            } finally {
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        } finally {
            if (document1 != null) {
                document1.dispose();
            }
            if (document2 != null) {
                document2.dispose();
            }
            if (document3 != null) {
                document3.dispose();
            }
        }
    }
}
