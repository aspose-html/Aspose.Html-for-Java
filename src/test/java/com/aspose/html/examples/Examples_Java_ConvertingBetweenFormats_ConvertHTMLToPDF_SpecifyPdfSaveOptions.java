package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToPDF_SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code and save it to the file
        String code = "<span>Hello</span> <span>World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();
        com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
        com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page();
        anyPage.setSize(
                new com.aspose.html.drawing.Size(
                        com.aspose.html.drawing.Length.fromInches(8.3f),
                        com.aspose.html.drawing.Length.fromInches(5.8f)
                )
        );
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);

        options.setBackgroundColor(com.aspose.html.drawing.Color.getGreen());

        // Convert HTML document to PDF
        com.aspose.html.converters.Converter.convertHTML(
                Resources.output("document.html"),
                options,
                Resources.output("output.pdf")
        );
    }
}
