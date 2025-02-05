package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.SplitCapable;

public class WaPageHeader<J extends WaPageHeader<J>> extends DivSimple<J> implements SplitCapable<J>
{

    public WaPageHeader()
    {
        setTag("header");
        addAttribute("slot", "header");
    }

}
