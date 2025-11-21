package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

/**
 * Represents a menu component for the WaPage.
 * This component provides a menu area for navigation or other controls.
 */
public class WaPageMenu<J extends WaPageMenu<J>> extends DivSimple<J>
{
    /**
     * Default constructor for the WaPageMenu class.
     * Sets the slot attribute to "menu".
     */
    public WaPageMenu()
    {
        addAttribute("slot", "menu");
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