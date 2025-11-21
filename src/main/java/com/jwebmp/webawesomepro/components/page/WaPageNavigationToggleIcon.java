package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

/**
 * Represents a navigation toggle icon component for the WaPage.
 * This component provides an icon for the navigation toggle button.
 */
public class WaPageNavigationToggleIcon<J extends WaPageNavigationToggleIcon<J>> extends DivSimple<J>
{
    /**
     * Default constructor for the WaPageNavigationToggleIcon class.
     * Sets the slot attribute to "navigation-toggle-icon".
     */
    public WaPageNavigationToggleIcon()
    {
        addAttribute("slot", "navigation-toggle-icon");
    }

    /**
     * Sets the page size when this component should be shown.
     *
     * @param pageSize The page size when this component should be shown.
     * @return This component for method chaining.
     */
    public @org.jspecify.annotations.NonNull J setShowWhenPageSize(PageSize pageSize)
    {
        addClass("wa-body-" + pageSize.getSize());
        return (J) this;
    }
}