package com.jwebmp.webawesomepro.components.combobox;

import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.select.WaSelectOption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaComboboxTest
{
    @Test
    void rendersBasicComboboxTag()
    {
        var s = new WaCombobox<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-combobox"), "Should render wa-combobox tag");
        assertTrue(s.contains("</wa-combobox>"), "Should have closing tag");
    }

    @Test
    void rendersLabelAndPlaceholder()
    {
        var s = new WaCombobox<>("Search items")
                .setPlaceholder("Type to search...")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("label=\"Search items\""), "Label attribute expected");
        assertTrue(s.contains("placeholder=\"Type to search...\""), "Placeholder attribute expected");
    }

    @Test
    void rendersSizeAttribute()
    {
        var s = new WaCombobox<>()
                .setSize(Size.Large)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("size=\"large\""), "Size large expected");
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaCombobox<>()
                .setDisabled(true)
                .setClearable(true)
                .setMultiple(true)
                .setRequired(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("disabled"), "Disabled boolean attribute should be present");
        assertTrue(s.contains("clearable"), "Clearable boolean attribute should be present");
        assertTrue(s.contains("multiple"), "Multiple boolean attribute should be present");
        assertTrue(s.contains("required"), "Required boolean attribute should be present");
    }

    @Test
    void omitsFalseBooleans()
    {
        var s = new WaCombobox<>()
                .setDisabled(false)
                .setClearable(false)
                .setMultiple(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("disabled=\"\""), "Disabled should not render when false");
        assertFalse(s.contains("clearable=\"\""), "Clearable should not render when false");
        assertFalse(s.contains("multiple=\"\""), "Multiple should not render when false");
    }

    @Test
    void rendersValueAndHint()
    {
        var s = new WaCombobox<>()
                .setValue("opt1")
                .setHint("Pick one or more")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("value=\"opt1\""), "Value attribute expected");
        assertTrue(s.contains("hint=\"Pick one or more\""), "Hint attribute expected");
    }

    @Test
    void rendersFormAttribute()
    {
        var s = new WaCombobox<>()
                .setForm("myForm")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("form=\"myForm\""), "Form attribute expected");
    }

    @Test
    void rendersWithOptions()
    {
        var combo = new WaCombobox<>("Fruit");
        combo.add(new WaSelectOption<>().setValue("apple").setText("Apple"));
        combo.add(new WaSelectOption<>().setValue("banana").setText("Banana"));

        var s = combo.toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-combobox"), "Should render wa-combobox tag");
        assertTrue(s.contains("<wa-option"), "Should contain wa-option children");
        assertTrue(s.contains("value=\"apple\""), "First option value expected");
        assertTrue(s.contains("value=\"banana\""), "Second option value expected");
    }

    @Test
    void rendersAllAttributesTogether()
    {
        var s = new WaCombobox<>()
                .setLabel("Tags")
                .setPlaceholder("Add tags...")
                .setValue("java")
                .setSize(Size.Small)
                .setMultiple(true)
                .setClearable(true)
                .setHint("Select one or more tags")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-combobox"), "Should render wa-combobox tag");
        assertTrue(s.contains("label=\"Tags\""), "Label expected");
        assertTrue(s.contains("placeholder=\"Add tags...\""), "Placeholder expected");
        assertTrue(s.contains("value=\"java\""), "Value expected");
        assertTrue(s.contains("size=\"small\""), "Size expected");
        assertTrue(s.contains("multiple"), "Multiple expected");
        assertTrue(s.contains("clearable"), "Clearable expected");
        assertTrue(s.contains("hint=\"Select one or more tags\""), "Hint expected");
        assertTrue(s.contains("</wa-combobox>"), "Closing tag expected");
    }
}

