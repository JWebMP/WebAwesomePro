package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsNavigationFooter extends DivSimple<WaPageContentsNavigationFooter>
{
    public WaPageContentsNavigationFooter()
    {
        setTag("nav");
        addAttribute("slot", "navigation-footer");
    }

}
