package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

/**
 * Represents a navigation toggle component for the WaPage.
 * This component provides a toggle for showing/hiding the navigation in mobile view.
 */
public class WaPageNavigationToggle<J extends WaPageNavigationToggle<J>> extends DivSimple<J>
{
    /**
     * Default constructor for the WaPageNavigationToggle class.
     * Sets the slot attribute to "navigation-toggle".
     */
    public WaPageNavigationToggle()
    {
        addAttribute("slot", "navigation-toggle");
    }

    /**
     * Sets the page size when this component should be shown.
     *
     * @param pageSize The page size when this component should be shown.
     * @return This component for method chaining.
     */
    public J setShowWhenPageSize(PageSize pageSize)
    {
        addClass("wa-body-" + pageSize.getSize());
        return (J) this;
    }
}