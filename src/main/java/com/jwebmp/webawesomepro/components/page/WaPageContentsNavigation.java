package com.jwebmp.webawesomepro.components.page;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgComponentReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public class WaPageContentsNavigation<J extends WaPageContentsNavigation<J>> extends DivSimple<J>
{

    public WaPageContentsNavigation()
    {
        setTag("nav");
        addAttribute("slot", "navigation");
    }

    public J addNavAnchor(String id, String text)
    {
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", (Strings.nullToEmpty(id).startsWith("#") ? "" : "#") + id);
        aLink.setText(text);
        add(aLink);
        return (J) this;
    }

    public J addNavAnchor(String id, IComponentHierarchyBase<?, ?> componentHierarchyBase)
    {
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", (Strings.nullToEmpty(id).startsWith("#") ? "" : "#") + id);
        aLink.add(componentHierarchyBase);
        add(aLink);
        return (J) this;
    }

    public J addNavLink(String path, String text)
    {
        if (!path.startsWith("#") && !path.startsWith("/"))
        {
            path = "/" + path;
        }
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("href", path);
        aLink.setText(text);
        add(aLink);
        return (J) this;
    }

    public J addRouterLink(String path, String text)
    {
        if (!path.startsWith("#") && !path.startsWith("/"))
        {
            path = "/" + path;
        }
        Link<?> aLink = new Link<>();
        aLink.setTag("a");
        aLink.addAttribute("routerLink", path);
        aLink.setText(text);
        add(aLink);
        return (J) this;
    }


}
