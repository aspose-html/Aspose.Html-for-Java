package com.aspose.html.examples;

public class Examples_Java_Document_SaveDocument_HTMLToMarkDown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<h1>heading text</h1>", "about:blank");
        try {
            // Create corresponding save options
            com.aspose.html.saving.MarkdownSaveOptions saveOptions = com.aspose.html.saving.MarkdownSaveOptions.getGit();

            // Save to .md file
            document.save(Resources.output("HTMLToMarkDown_out.md"), saveOptions);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}