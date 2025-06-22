package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

/**
 * Represents a dialog wrapper component for the WaPage.
 * This component provides a container for dialogs and modals that need to appear above the layout structure.
 */
public class WaPageDialogWrapper<J extends WaPageDialogWrapper<J>> extends DivSimple<J>
{
    /**
     * Default constructor for the WaPageDialogWrapper class.
     * Sets the slot attribute to "dialog-wrapper".
     */
    public WaPageDialogWrapper()
    {
        addAttribute("slot", "dialog-wrapper");
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