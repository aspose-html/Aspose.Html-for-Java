package com.aspose.html.examples.java;

public class Examples_Java_Conversion_AdjustXPSPageSize_AdjustXPSPageSize {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        // Set input file name.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "FirstFile.html")) {
            try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "FirstFileOut.html")) {
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                fileOutputStream.write(bytes);
                String style = """
                        <style>
                        .st
                        {
                        color: green;
                        }
                        </style>
                        <div id=id1>Aspose.Html rendering Text in Black Color</div>
                        <div id=id2 class=''st''>Aspose.Html rendering Text in Green Color</div>
                        <div id=id3 class=''st'' style='color: blue;'>Aspose.Html rendering Text in Blue Color</div>
                        <div id=id3 class=''st'' style='color: red;'>Aspose.Html rendering Text in Red Color</div>
                        """;
                fileOutputStream.write(style.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }

            // Create HtmlRenderer object
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create HtmlDocument instnace while passing path of already created HTML file
                var html_document = new com.aspose.html.HTMLDocument(dataDir + "FirstFileOut.html");
                try {
                    // Set the page size less than document min-width. The content in the resulting file will be cropped becuase of element with width: 200px
                    var xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
                    var page = new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100));
                    var pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(page);
                    pageSetup.setAdjustToWidestPage(false);
                    xps_options.setPageSetup(pageSetup);

                    var output = dataDir + "not-adjusted-to-widest-page_out0.xps";
                    var device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, output);
                    try {
                        // Render the output
                        renderer.render(device, html_document);
                    } finally {
                        if (device != null) {
                            device.dispose();
                        }
                    }

                    // Set the page size less than document min-width and enable AdjustToWidestPage option
                    // The page size of the resulting file will be changed according to content width
                    xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
                    page = new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100));
                    pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(page);
                    pageSetup.setAdjustToWidestPage(true);
                    xps_options.setPageSetup(pageSetup);

                    output = dataDir + "not-adjusted-to-widest-page_out1.xps";
                    device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, output);
                    try {
                        // Render the output
                        renderer.render(device, html_document);
                    } finally {
                        if (device != null) {
                            device.dispose();
                        }
                    }
                } finally {
                    if (html_document != null) {
                        html_document.dispose();
                    }
                }
            } finally {
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        }
    }
}