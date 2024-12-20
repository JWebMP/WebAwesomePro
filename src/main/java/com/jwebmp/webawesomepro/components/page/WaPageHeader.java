package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.SplitCapable;

public class WaPageHeader extends DivSimple<WaPageHeader> implements SplitCapable<WaPageHeader>
{

    public WaPageHeader()
    {
        setTag("header");
        addAttribute("slot", "header");
    }
    
}
