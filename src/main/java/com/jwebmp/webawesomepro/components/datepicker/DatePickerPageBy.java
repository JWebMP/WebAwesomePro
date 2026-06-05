package com.jwebmp.webawesomepro.components.datepicker;

/**
 * Pagination behaviour for the {@code <wa-date-picker>} calendar.
 */
public enum DatePickerPageBy
{
    Months,
    Single;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

