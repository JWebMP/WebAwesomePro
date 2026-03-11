package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro bar chart component ({@code <wa-bar-chart>}).
 * Renders data as vertical or horizontal bars with optional stacking.
 * <p>
 * Key Inputs: label, description, xAxisLabel, yAxisLabel, legendPosition, stacked
 */
@Getter
@Setter
@NgImportReference(value = "WaBarChartDirective", reference = "angular-awesome")
@NgImportModule("WaBarChartDirective")
public class WaBarChart<J extends WaBarChart<J>> extends WaChartBase<J>
{
    public WaBarChart()
    {
        super("wa-bar-chart");
    }

    public WaBarChart(String label)
    {
        this();
        setLabel(label);
    }
}

