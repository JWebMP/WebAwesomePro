package com.jwebmp.webawesomepro.components.combobox;

/**
 * Enter key hint options for WaCombobox.
 * Controls the label displayed on the virtual keyboard's enter key.
 */
public enum EnterKeyHint
{
    Enter,
    Done,
    Go,
    Next,
    Previous,
    Search,
    Send;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

