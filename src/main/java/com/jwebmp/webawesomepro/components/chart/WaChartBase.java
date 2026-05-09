package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * Base class for Web Awesome Pro chart components that share common properties
 * such as label, description, axis labels, and legend position.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 */
@Getter
public abstract class WaChartBase<J extends WaChartBase<J>> extends DivSimple<J>
{
    private String label;
    private String description;
    private String xAxisLabel;
    private String yAxisLabel;
    private LegendPosition legendPosition;
    private Boolean stacked;

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDescription(String description)
    {
        this.description = description;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setXAxisLabel(String xAxisLabel)
    {
        this.xAxisLabel = xAxisLabel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setYAxisLabel(String yAxisLabel)
    {
        this.yAxisLabel = yAxisLabel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLegendPosition(LegendPosition legendPosition)
    {
        this.legendPosition = legendPosition;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setStacked(Boolean stacked)
    {
        this.stacked = stacked;
        return (J) this;
    }

    protected WaChartBase(String tag)
    {
        setTag(tag);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (description != null)
            {
                addAttribute("description", description);
            }
            if (xAxisLabel != null)
            {
                addAttribute("x-axis-label", xAxisLabel);
            }
            if (yAxisLabel != null)
            {
                addAttribute("y-axis-label", yAxisLabel);
            }
            if (legendPosition != null)
            {
                addAttribute("legend-position", legendPosition.toString());
            }
            if (stacked != null && stacked)
            {
                addAttribute("stacked", "");
            }
        }
        super.init();
    }
}

