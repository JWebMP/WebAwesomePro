package com.jwebmp.webawesomepro.components.dateinput;

/**
 * Appearance options for {@code <wa-date-input>}.
 */
public enum DateInputAppearance
{
    Filled("filled"),
    Outlined("outlined"),
    FilledOutlined("filled-outlined");

    private final String value;

    DateInputAppearance(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

