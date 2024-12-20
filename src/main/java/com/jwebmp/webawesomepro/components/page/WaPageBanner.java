package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.PageSize;

public class WaPageBanner extends DivSimple<WaPageBanner>
{
    public WaPageBanner()
    {
        addAttribute("slot", "banner");
    }

    public WaPageBanner setShowWhenPageSize(PageSize pageSize)
    {
        addClass("wa-body-" + pageSize.getSize());
        return this;
    }
    
}
