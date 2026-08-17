package com.jwebmp.webawesomepro.components.datagrid;

/**
 * Defines the row selection mode of a {@code <wa-data-grid>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum DataGridSelectable
{
    /**
     * Selection is disabled
     */
    None,

    /**
     * A single row may be selected
     */
    Single,

    /**
     * Multiple rows may be selected via checkboxes
     */
    Multiple;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

