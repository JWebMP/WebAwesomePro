package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro radar chart component ({@code <wa-radar-chart>}).
 * Renders data on a radial grid, useful for comparing multiple dimensions.
 * <p>
 * Key Inputs: label, description, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaRadarChartDirective", reference = "angular-awesome")
@NgImportModule("WaRadarChartDirective")
public class WaRadarChart<J extends WaRadarChart<J>> extends WaChartBase<J>
{
    public WaRadarChart()
    {
        super("wa-radar-chart");
    }

    public WaRadarChart(String label)
    {
        this();
        setLabel(label);
    }
}

