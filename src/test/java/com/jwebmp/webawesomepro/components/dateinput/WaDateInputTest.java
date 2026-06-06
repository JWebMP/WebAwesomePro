package com.jwebmp.webawesomepro.components.dateinput;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaDateInputTest
{
    @Test
    void rendersDateInputWithAttributes()
    {
        Page<?> p = new Page<>();
        WaDateInput<?> di = new WaDateInput<>("Pick a date")
                .setValue("2026-06-05")
                .setSize(DateInputSize.L)
                .setAppearance(DateInputAppearance.FilledOutlined)
                .setMode(DateInputMode.Range)
                .setMin("2026-01-01")
                .setMax("2026-12-31")
                .setMonths(2)
                .setPageBy(PageBy.Single)
                .setWeekdayFormat(WeekdayFormat.Short)
                .setFirstDayOfWeek("1");
        p.getBody().add(di);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-date-input"));
        assertTrue(html.contains("label=\"Pick a date\""));
        assertTrue(html.contains("value=\"2026-06-05\""));
        assertTrue(html.contains("size=\"l\""));
        assertTrue(html.contains("appearance=\"filled-outlined\""));
        assertTrue(html.contains("mode=\"range\""));
        assertTrue(html.contains("min=\"2026-01-01\""));
        assertTrue(html.contains("max=\"2026-12-31\""));
        assertTrue(html.contains("months=\"2\""));
        assertTrue(html.contains("page-by=\"single\""));
        assertTrue(html.contains("weekday-format=\"short\""));
        assertTrue(html.contains("first-day-of-week=\"1\""));
    }

    @Test
    void longFormSizeStaysValid()
    {
        String html = new WaDateInput<>().setSize(DateInputSize.Medium).toString(true);
        assertTrue(html.contains("size=\"medium\""));
    }

    @Test
    void rendersBooleanAttributesAndCssProps()
    {
        Page<?> p = new Page<>();
        WaDateInput<?> di = new WaDateInput<>()
                .setDisabled(true)
                .setRequired(true)
                .setReadonly(false)
                .setPill(true)
                .setWithClear(true)
                .setDisablePast(true)
                .setWithWeekNumbers(true)
                .setOpen(true)
                .setShowDuration("200ms")
                .setHideDuration("100ms");
        p.getBody().add(di);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(hasAttr(html, "disabled"));
        assertTrue(hasAttr(html, "required"));
        assertFalse(hasAttr(html, "readonly"));
        assertTrue(hasAttr(html, "pill"));
        assertTrue(hasAttr(html, "with-clear"));
        assertTrue(hasAttr(html, "disable-past"));
        assertTrue(hasAttr(html, "with-week-numbers"));
        assertTrue(hasAttr(html, "open"));
        assertTrue(html.contains("--show-duration:200ms"));
        assertTrue(html.contains("--hide-duration:100ms"));
    }

    /**
     * Checks for the presence of a boolean attribute regardless of whether the engine renders it
     * bare ({@code disabled}) or with an empty value ({@code disabled=""}).
     */
    private static boolean hasAttr(String html, String name)
    {
        return html.matches("(?s).*\\s" + java.util.regex.Pattern.quote(name) + "(\\s|>|=).*");
    }

    @Test
    void rendersEventsSlotsAndDaySlot()
    {
        WaIcon<?> clearIcon = new WaIcon<>().setName("xmark");
        String html = new WaDateInput<>()
                .setInputEvent("onInput($event)")
                .setClearEvent("onClear()")
                .setAfterHideEvent("onAfterHide()")
                .setInvalidEvent("onInvalid($event)")
                .setClearIcon(clearIcon)
                .addDaySlot("2026-06-05", new WaIcon<>().setName("star"))
                .toString(true);
        System.out.println(html);

        assertTrue(html.contains("input=\"onInput($event)\""));
        assertTrue(html.contains("wa-clear=\"onClear()\""));
        assertTrue(html.contains("wa-after-hide=\"onAfterHide()\""));
        assertTrue(html.contains("wa-invalid=\"onInvalid($event)\""));
        assertTrue(html.contains("slot=\"clear-icon\""));
        assertTrue(html.contains("slot=\"day-2026-06-05\""));
    }

    @Test
    void supportsNgModelBinding()
    {
        String html = new WaDateInput<>().bind("selectedDate").toString(true);
        assertTrue(html.contains("[(ngModel)]=\"selectedDate\""));
    }
}



