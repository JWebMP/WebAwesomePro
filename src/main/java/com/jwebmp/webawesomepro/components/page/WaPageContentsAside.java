package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsAside<J extends WaPageContentsAside<J>> extends DivSimple<J>
{

    public WaPageContentsAside()
    {
        addAttribute("slot", "aside");
    }


}
