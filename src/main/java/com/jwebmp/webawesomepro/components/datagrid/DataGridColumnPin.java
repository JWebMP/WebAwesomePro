package com.jwebmp.webawesomepro.components.datagrid;

/**
 * Defines which edge a {@code <wa-data-grid>} column is pinned to.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
public enum DataGridColumnPin
{
    /**
     * Pin the column to the leading edge
     */
    Left,

    /**
     * Pin the column to the trailing edge
     */
    Right;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

