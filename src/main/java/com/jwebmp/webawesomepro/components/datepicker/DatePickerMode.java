package com.jwebmp.webawesomepro.components.datepicker;

/**
 * Selection mode for {@code <wa-date-picker>}.
 */
public enum DatePickerMode
{
    Single,
    Range;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

