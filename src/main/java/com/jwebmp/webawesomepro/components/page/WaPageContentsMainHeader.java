package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsMainHeader<J extends WaPageContentsMainHeader<J>> extends DivSimple<J>
{

    public WaPageContentsMainHeader()
    {
        setTag("header");
        addAttribute("slot", "main-header");
    }

}
