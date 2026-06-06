package com.jwebmp.webawesomepro.components.datepicker;

import com.jwebmp.core.Page;
import com.jwebmp.webawesome.components.icon.WaIcon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaDatePickerTest
{
    @Test
    void rendersDatePickerWithAttributes()
    {
        Page<?> p = new Page<>();
        WaDatePicker<?> dp = new WaDatePicker<>()
                .setMode(DatePickerMode.Range)
                .setValue("2026-06-05")
                .setView(DatePickerView.Months)
                .setMonths(2)
                .setSize(DatePickerSize.Small)
                .setWeekdayFormat(DatePickerWeekdayFormat.Long)
                .setLocale("en-US")
                .setFocusedDate("2026-06-10");
        p.getBody().add(dp);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(html.contains("<wa-date-picker"));
        assertTrue(html.contains("mode=\"range\""));
        assertTrue(html.contains("value=\"2026-06-05\""));
        assertTrue(html.contains("view=\"months\""));
        assertTrue(html.contains("months=\"2\""));
        assertTrue(html.contains("size=\"small\""));
        assertTrue(html.contains("weekday-format=\"long\""));
        assertTrue(html.contains("locale=\"en-US\""));
        assertTrue(html.contains("focused-date=\"2026-06-10\""));
    }

    @Test
    void rendersBooleanAttributes()
    {
        Page<?> p = new Page<>();
        WaDatePicker<?> dp = new WaDatePicker<>()
                .setDisabled(true)
                .setReadonly(false)
                .setWithOutsideDays(true)
                .setWithWeekNumbers(true)
                .setDisableFuture(true);
        p.getBody().add(dp);
        String html = p.toString(true);
        System.out.println(html);

        assertTrue(hasAttr(html, "disabled"));
        assertFalse(hasAttr(html, "readonly"));
        assertTrue(hasAttr(html, "with-outside-days"));
        assertTrue(hasAttr(html, "with-week-numbers"));
        assertTrue(hasAttr(html, "disable-future"));
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
    void rendersEventsAndSlots()
    {
        String html = new WaDatePicker<>()
                .setChangeEvent("onChange($event)")
                .setFocusDayEvent("onFocusDay($event)")
                .setViewChangeEvent("onViewChange($event)")
                .setHeader(new WaIcon<>().setName("calendar"))
                .addDaySlot("2026-06-05", new WaIcon<>().setName("star"))
                .toString(true);
        System.out.println(html);

        assertTrue(html.contains("change=\"onChange($event)\""));
        assertTrue(html.contains("wa-focus-day=\"onFocusDay($event)\""));
        assertTrue(html.contains("wa-view-change=\"onViewChange($event)\""));
        assertTrue(html.contains("slot=\"header\""));
        assertTrue(html.contains("slot=\"day-2026-06-05\""));
    }
}



