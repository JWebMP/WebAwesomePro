package com.jwebmp.webawesomepro.components.datepicker;

/**
 * The visible calendar view of {@code <wa-date-picker>}.
 */
public enum DatePickerView
{
    Days,
    Months,
    Years;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

