package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsNavigationHeader<J extends WaPageContentsNavigationHeader<J>> extends DivSimple<J>
{

    public WaPageContentsNavigationHeader()
    {
        setTag("nav");
        addAttribute("slot", "navigation-header");
    }


}
