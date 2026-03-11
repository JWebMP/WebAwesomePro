package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro line chart component ({@code <wa-line-chart>}).
 * Renders data as connected line segments.
 * <p>
 * Key Inputs: label, description, xAxisLabel, yAxisLabel, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaLineChartDirective", reference = "angular-awesome")
@NgImportModule("WaLineChartDirective")
public class WaLineChart<J extends WaLineChart<J>> extends WaChartBase<J>
{
    public WaLineChart()
    {
        super("wa-line-chart");
    }

    public WaLineChart(String label)
    {
        this();
        setLabel(label);
    }
}

