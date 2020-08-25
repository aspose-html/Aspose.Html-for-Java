package com.aspose.html.examples;

public class Examples_Java_Conversion_SVGtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Source SVG document
        var svgDocument = new com.aspose.html.dom.svg.SVGDocument(dataDir + "input.svg");
        // Initialize XpsSaveOptions
        var options = new com.aspose.html.saving.XpsSaveOptions();

        options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
        // Output file path
        var outputFile = dataDir + "SVGtoXPS_Output.xps";
        // Convert SVG to XPS
        com.aspose.html.converters.Converter.convertSVG(svgDocument, options, outputFile);
    }
}