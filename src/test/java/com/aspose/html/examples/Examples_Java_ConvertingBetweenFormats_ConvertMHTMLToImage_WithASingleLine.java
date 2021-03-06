package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToImage_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Call the ConvertMHTML method to convert the MHTML file to image.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    new com.aspose.html.saving.ImageSaveOptions(
                            com.aspose.html.rendering.image.ImageFormat.Jpeg),
                    Resources.output("output.jpg")
            );
        }
    }
}