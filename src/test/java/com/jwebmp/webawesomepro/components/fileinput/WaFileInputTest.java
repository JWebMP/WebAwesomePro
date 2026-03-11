package com.jwebmp.webawesomepro.components.fileinput;

import com.jwebmp.webawesome.components.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaFileInputTest
{
    @Test
    void rendersBasicFileInputTag()
    {
        var s = new WaFileInput<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-file-input"), "Should render wa-file-input tag");
        assertTrue(s.contains("</wa-file-input>"), "Should have closing tag");
    }

    @Test
    void rendersLabelAttribute()
    {
        var s = new WaFileInput<>("Upload document")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Upload document\""), "Label attribute expected");
    }

    @Test
    void rendersAcceptAttribute()
    {
        var s = new WaFileInput<>()
                .setAccept("image/*,.pdf")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("accept=\"image/*,.pdf\""), "Accept attribute expected");
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaFileInput<>()
                .setMultiple(true)
                .setDisabled(true)
                .setRequired(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("multiple"), "Multiple boolean attribute should be present");
        assertTrue(s.contains("disabled"), "Disabled boolean attribute should be present");
        assertTrue(s.contains("required"), "Required boolean attribute should be present");
    }

    @Test
    void omitsFalseBooleans()
    {
        var s = new WaFileInput<>()
                .setMultiple(false)
                .setDisabled(false)
                .setRequired(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("multiple=\"\""), "Multiple should not render when false");
        assertFalse(s.contains("disabled=\"\""), "Disabled should not render when false");
        assertFalse(s.contains("required=\"\""), "Required should not render when false");
    }

    @Test
    void rendersSizeAttribute()
    {
        var s = new WaFileInput<>()
                .setSize(Size.Small)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("size=\"small\""), "Size small expected");
    }

    @Test
    void rendersHintAttribute()
    {
        var s = new WaFileInput<>()
                .setHint("Max 5MB per file")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("hint=\"Max 5MB per file\""), "Hint attribute expected");
    }

    @Test
    void rendersFormAttribute()
    {
        var s = new WaFileInput<>()
                .setForm("uploadForm")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("form=\"uploadForm\""), "Form attribute expected");
    }

    @Test
    void rendersAllAttributesTogether()
    {
        var s = new WaFileInput<>()
                .setLabel("Attachments")
                .setAccept(".pdf,.doc,.docx")
                .setMultiple(true)
                .setRequired(true)
                .setSize(Size.Medium)
                .setHint("PDF or Word documents only")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-file-input"), "Should render wa-file-input tag");
        assertTrue(s.contains("label=\"Attachments\""), "Label expected");
        assertTrue(s.contains("accept=\".pdf,.doc,.docx\""), "Accept expected");
        assertTrue(s.contains("multiple"), "Multiple expected");
        assertTrue(s.contains("required"), "Required expected");
        assertTrue(s.contains("size=\"medium\""), "Size expected");
        assertTrue(s.contains("hint=\"PDF or Word documents only\""), "Hint expected");
        assertTrue(s.contains("</wa-file-input>"), "Closing tag expected");
    }
}

