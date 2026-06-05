package com.jwebmp.webawesomepro.components.dateinput;

/**
 * Weekday label format for the {@code <wa-date-input>} calendar.
 */
public enum WeekdayFormat
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

