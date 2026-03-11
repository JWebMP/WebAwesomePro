package com.jwebmp.webawesomepro.components.chart;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
import lombok.Setter;

/**
 * Web Awesome Pro sparkline component ({@code <wa-sparkline>}).
 * Renders a compact inline chart without axes or labels, typically used for trend indicators.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 */
@Getter
@Setter
@NgImportReference(value = "WaSparklineDirective", reference = "angular-awesome")
@NgImportModule("WaSparklineDirective")
public class WaSparkline<J extends WaSparkline<J>> extends DivSimple<J>
{
    public WaSparkline()
    {
        setTag("wa-sparkline");
    }
}

