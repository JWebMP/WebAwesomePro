package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro pie chart component ({@code <wa-pie-chart>}).
 * Renders data as proportional slices of a circle.
 * <p>
 * Key Inputs: label, description, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaPieChartDirective", reference = "angular-awesome")
@NgImportModule("WaPieChartDirective")
public class WaPieChart<J extends WaPieChart<J>> extends WaChartBase<J>
{
    public WaPieChart()
    {
        super("wa-pie-chart");
    }

    public WaPieChart(String label)
    {
        this();
        setLabel(label);
    }
}

