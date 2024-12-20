package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsNavigationHeader extends DivSimple<WaPageContentsNavigationHeader>
{

    public WaPageContentsNavigationHeader()
    {
        setTag("nav");
        addAttribute("slot", "navigation-header");
    }


}
