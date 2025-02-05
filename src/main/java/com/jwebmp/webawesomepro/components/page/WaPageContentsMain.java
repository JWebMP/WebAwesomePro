package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.PageSize;

public class WaPageContentsMain<J extends WaPageContentsMain<J>> extends DivSimple<J>
{

    public WaPageContentsMain()
    {
        setTag("main");
        //addAttribute("slot", "main");

        addClass("wa-body-" + PageSize.Large.getSize());
    }

    public J addContent(String id, IComponentHierarchyBase<?, ?> component)
    {
        WaPageContent content = new WaPageContent(id, component);
        add(content);
        return (J) this;
    }
}
