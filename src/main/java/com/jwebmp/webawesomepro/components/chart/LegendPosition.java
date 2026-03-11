package com.jwebmp.webawesomepro.components.chart;

/**
 * Position of chart legend.
 */
public enum LegendPosition
{
    Top,
    Bottom,
    Left,
    Right;

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }
}

