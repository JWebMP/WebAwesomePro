package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro scatter chart component ({@code <wa-scatter-chart>}).
 * Renders data as individual dots on an x/y plane.
 * <p>
 * Key Inputs: label, description, xAxisLabel, yAxisLabel, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaScatterChartDirective", reference = "angular-awesome")
@NgImportModule("WaScatterChartDirective")
public class WaScatterChart<J extends WaScatterChart<J>> extends WaChartBase<J>
{
    public WaScatterChart()
    {
        super("wa-scatter-chart");
    }

    public WaScatterChart(String label)
    {
        this();
        setLabel(label);
    }
}

