package com.jwebmp.webawesomepro.components.page;

import com.google.common.base.Strings;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public class WaPageContentsNavigation extends DivSimple<WaPageContentsNavigation>
{

    public WaPageContentsNavigation()
    {
        setTag("nav");
        addAttribute("slot", "navigation");
    }

    public WaPageContentsNavigation addNavLink(String id, String text)
    {
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", (Strings.nullToEmpty(id).startsWith("#") ? "" : "#") + id);
        aLink.setText(text);
        add(aLink);
        return this;
    }

    public WaPageContentsNavigation addNavLink(String id, IComponentHierarchyBase<?, ?> componentHierarchyBase)
    {
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", (Strings.nullToEmpty(id).startsWith("#") ? "" : "#") + id);
        aLink.add(componentHierarchyBase);
        add(aLink);
        return this;
    }

}
