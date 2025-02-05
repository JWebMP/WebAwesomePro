package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;

public class WaPageContentsMainFooter<J extends WaPageContentsMainFooter<J>> extends DivSimple<J>
{

    public WaPageContentsMainFooter()
    {
        addAttribute("slot", "main-footer");
    }


}
