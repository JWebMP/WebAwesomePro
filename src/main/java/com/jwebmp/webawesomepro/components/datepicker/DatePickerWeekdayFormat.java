package com.jwebmp.webawesomepro.components.datepicker;

/**
 * Weekday label format for the {@code <wa-date-picker>} calendar.
 */
public enum DatePickerWeekdayFormat
{
    Narrow,
    Short,
    Long;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

