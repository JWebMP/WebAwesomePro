package com.jwebmp.webawesomepro.components.page.faicon;

import com.jwebmp.plugins.fontawesome5.IFontAwesomeIcon;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeStyles;
import com.jwebmp.plugins.fontawesome5.IFontAwesomeCatalogIcon;
import com.jwebmp.plugins.fontawesome5.options.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIcon;

public class WaIconFA<J extends WaIconFA<J>> extends WaIcon<J>
{
    public WaIconFA()
    {
    }

    public WaIconFA(IFontAwesomeIcon iconName)
    {
        super(iconName instanceof IFontAwesomeCatalogIcon ? iconName.toAngularIconAttributeName() : iconName.toAngularIcon());
        if (iconName instanceof IFontAwesomeCatalogIcon familyIcon)
        {
            setFamily(familyIcon.getFamily().toString());
            setVariant(familyIcon.getVariant());
        }
    }

    /** Select a supported weight from a versioned family catalog. */
    public WaIconFA(IFontAwesomeCatalogIcon iconName, IconVariant variant)
    {
        super(iconName.toAngularIconAttributeName(), iconName.getFamily().toString(), iconName.requireVariant(variant));
    }

    public WaIconFA(IFontAwesomeIcon iconName, FontAwesomeStyles family)
    {
        super(iconName.toAngularIcon(), family.toString());
    }

    public WaIconFA(String iconName, FontAwesomeStyles family, IconVariant variant)
    {
        super(iconName, family.toString(), variant);
    }
}
