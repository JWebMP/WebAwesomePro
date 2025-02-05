package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageSubHeader<J extends WaPageSubHeader<J>> extends DivSimple<J>
{

    public WaPageSubHeader()
    {
        setTag("nav");
        addAttribute("slot", "subheader");
    }
}
