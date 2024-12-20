package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsMainHeader extends DivSimple<WaPageContentsMainHeader>
{

    public WaPageContentsMainHeader()
    {
        setTag("header");
        addAttribute("slot", "main-header");
    }
    
}
