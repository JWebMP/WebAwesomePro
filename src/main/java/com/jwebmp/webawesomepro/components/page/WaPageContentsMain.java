package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.PageSize;

import java.util.Iterator;

public class WaPageContentsMain<J extends WaPageContentsMain<J>> extends DivSimple<J>
{
    private PageSize pageSize = PageSize.Large;

    public WaPageContentsMain()
    {
        setTag("main");
        //addAttribute("slot", "main");
    }

    /**
     * Sets the page size class to apply to the main content area. Can be called any time before render (e.g. in init()).
     */
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPageSize(PageSize pageSize)
    {
        this.pageSize = pageSize == null ? PageSize.Large : pageSize;
        return (J) this;
    }

    @Override
    protected void preConfigure()
    {
        // Ensure only one wa-body-* class is present and reflects the current pageSize
        Iterator<String> it = getClasses().iterator();
        while (it.hasNext())
        {
            String cls = it.next();
            if (cls != null && cls.startsWith("wa-body-"))
            {
                it.remove();
            }
        }
        addClass("wa-body-" + pageSize.getSize());
        super.preConfigure();
    }

    public J addContent(String id, IComponentHierarchyBase<?, ?> component)
    {
        WaPageContent content = new WaPageContent(id, component);
        add(content);
        return (J) this;
    }
}
