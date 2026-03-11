package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaChart component provides a general-purpose chart wrapper using Web Awesome's chart system.
 * It accepts a configuration object and optional plugins.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 * <p>
 * Attributes:
 * - {@code config}: The chart configuration object (JSON string or binding expression)
 * - {@code plugins}: Additional chart plugins
 * <p>
 * Usage examples:
 * <pre>
 * WaChart chart = new WaChart();
 * chart.setConfig("{\"type\":\"bar\",\"data\":{}}");
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaChartDirective", reference = "angular-awesome")
@NgImportModule("WaChartDirective")
public class WaChart<J extends WaChart<J>> extends DivSimple<J>
{
    private String config;
    private String plugins;

    public WaChart()
    {
        setTag("wa-chart");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (config != null)
            {
                addAttribute("[config]", config);
            }
            if (plugins != null)
            {
                addAttribute("[plugins]", plugins);
            }
        }
        super.init();
    }
}

