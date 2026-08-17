package com.jwebmp.webawesomepro.components.datagrid;

/**
 * Defines the visual appearance of a {@code <wa-data-grid>} element.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum DataGridAppearance
{
    /**
     * Renders the grid with an outer border and cell borders
     */
    Outlined,

    /**
     * Renders the grid without chrome
     */
    Plain;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

