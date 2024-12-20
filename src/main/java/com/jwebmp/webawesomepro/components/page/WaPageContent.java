package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.H2;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WaPageContent extends DivSimple<WaPageContent>
{
    private IComponentHierarchyBase<?, ?> id;
    private IComponentHierarchyBase<?, ?> component;

    public WaPageContent(IComponentHierarchyBase<?, ?> id, IComponentHierarchyBase<?, ?> component)
    {
        this.id = id;
        this.component = component;
        add(this.id);
        add(component);
    }

    public WaPageContent(String id, IComponentHierarchyBase<?, ?> component)
    {
        this.id = new H2<>().setID(id);
        this.component = component;
        add(this.id);
        add(component);
    }

    @Override
    protected StringBuilder renderHTML(int tabCount)
    {
        setCurrentTabIndents(tabCount - 1);
        return super.renderChildren();
    }
}
