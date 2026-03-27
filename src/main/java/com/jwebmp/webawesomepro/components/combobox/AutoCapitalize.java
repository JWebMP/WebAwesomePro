package com.jwebmp.webawesomepro.components.combobox;

/**
 * Auto-capitalize options for WaCombobox.
 * Controls automatic text capitalization behavior.
 */
public enum AutoCapitalize
{
    Off,
    None,
    On,
    Sentences,
    Words,
    Characters;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

