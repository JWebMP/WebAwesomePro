package com.jwebmp.webawesomepro.components.combobox;

/**
 * Input mode options for WaCombobox.
 * Controls virtual keyboard behavior on mobile devices.
 */
public enum InputMode
{
    None,
    Text,
    Decimal,
    Numeric,
    Tel,
    Search,
    Email,
    Url;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

