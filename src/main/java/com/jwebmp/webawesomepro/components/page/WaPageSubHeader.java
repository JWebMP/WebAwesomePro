package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageSubHeader extends DivSimple<WaPageSubHeader>
{

    public WaPageSubHeader()
    {
        setTag("nav");
        addAttribute("slot", "subheader");
    }
}
