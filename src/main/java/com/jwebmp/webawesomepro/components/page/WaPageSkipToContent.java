package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

/**
 * Represents a skip to content component for the WaPage.
 * This component provides accessibility by allowing users to skip to the main content.
 */
public class WaPageSkipToContent<J extends WaPageSkipToContent<J>> extends DivSimple<J>
{
    /**
     * Default constructor for the WaPageSkipToContent class.
     * Sets the slot attribute to "skip-to-content".
     */
    public WaPageSkipToContent()
    {
        addAttribute("slot", "skip-to-content");
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