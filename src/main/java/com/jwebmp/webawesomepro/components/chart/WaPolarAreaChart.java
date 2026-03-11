package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro polar area chart component ({@code <wa-polar-area-chart>}).
 * Renders data as sectors with equal angles but varying radii.
 * <p>
 * Key Inputs: label, description, legendPosition
 */
@Getter
@Setter
@NgImportReference(value = "WaPolarAreaChartDirective", reference = "angular-awesome")
@NgImportModule("WaPolarAreaChartDirective")
public class WaPolarAreaChart<J extends WaPolarAreaChart<J>> extends WaChartBase<J>
{
    public WaPolarAreaChart()
    {
        super("wa-polar-area-chart");
    }

    public WaPolarAreaChart(String label)
    {
        this();
        setLabel(label);
    }
}

