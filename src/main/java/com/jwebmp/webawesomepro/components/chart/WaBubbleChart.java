package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro bubble chart component ({@code <wa-bubble-chart>}).
 * Renders data as circles with x, y, and radius dimensions.
 * <p>
 * Key Inputs: label, description, xAxisLabel, yAxisLabel, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaBubbleChartDirective", reference = "angular-awesome")
@NgImportModule("WaBubbleChartDirective")
public class WaBubbleChart<J extends WaBubbleChart<J>> extends WaChartBase<J>
{
    public WaBubbleChart()
    {
        super("wa-bubble-chart");
    }

    public WaBubbleChart(String label)
    {
        this();
        setLabel(label);
    }
}

