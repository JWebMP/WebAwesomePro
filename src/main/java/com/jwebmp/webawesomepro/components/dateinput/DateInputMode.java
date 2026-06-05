package com.jwebmp.webawesomepro.components.dateinput;

/**
 * Selection mode for {@code <wa-date-input>}.
 */
public enum DateInputMode
{
    Single,
    Range;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

