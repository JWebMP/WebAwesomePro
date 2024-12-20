package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.PageSize;

public class WaPageContentsMain extends DivSimple<WaPageContentsMain>
{

    public WaPageContentsMain()
    {
        setTag("main");
        addAttribute("slot", "main");

        addClass("wa-body-main-" + PageSize.Large.getSize());
    }

    public WaPageContentsMain addContent(String id, IComponentHierarchyBase<?, ?> component)
    {
        WaPageContent content = new WaPageContent(id, component);
        add(content);
        return this;
    }
}
