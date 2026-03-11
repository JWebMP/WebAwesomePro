package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro doughnut chart component ({@code <wa-doughnut-chart>}).
 * Renders data as a ring/doughnut visualization.
 * <p>
 * Key Inputs: label, description, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaDoughnutChartDirective", reference = "angular-awesome")
@NgImportModule("WaDoughnutChartDirective")
public class WaDoughnutChart<J extends WaDoughnutChart<J>> extends WaChartBase<J>
{
    public WaDoughnutChart()
    {
        super("wa-doughnut-chart");
    }

    public WaDoughnutChart(String label)
    {
        this();
        setLabel(label);
    }
}

