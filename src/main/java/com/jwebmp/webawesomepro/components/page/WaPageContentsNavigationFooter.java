package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsNavigationFooter<J extends WaPageContentsNavigationFooter<J>> extends DivSimple<J>
{
    public WaPageContentsNavigationFooter()
    {
        setTag("nav");
        addAttribute("slot", "navigation-footer");
    }

}
