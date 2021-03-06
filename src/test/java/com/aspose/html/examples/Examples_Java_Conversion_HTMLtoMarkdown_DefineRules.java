package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_DefineRules {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", Resources.outputDirectory());
        try {
            // Create MarkdownSaveOptions object
            com.aspose.html.saving.MarkdownSaveOptions options = new com.aspose.html.saving.MarkdownSaveOptions();

            // Set the rules: only <a>, <img> and <p> elements will be converted to markdown.
            options.setFeatures(com.aspose.html.saving.MarkdownFeatures.Link | com.aspose.html.saving.MarkdownFeatures.Image | com.aspose.html.saving.MarkdownFeatures.AutomaticParagraph);
            document.save(Resources.output("output.rules.html.to.md"), options);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}