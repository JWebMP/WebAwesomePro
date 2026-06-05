package com.jwebmp.webawesomepro.components.dateinput;

/**
 * Pagination behaviour for the {@code <wa-date-input>} calendar.
 */
public enum PageBy
{
    Months,
    Single;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

