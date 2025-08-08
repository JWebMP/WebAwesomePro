package com.jwebmp.webawesomepro.components.page.faicon;

import com.jwebmp.plugins.fontawesome5.IFontAwesomeIcon;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeStyles;
import com.jwebmp.plugins.fontawesome5pro.FontAwesome5ProIcons;
import com.jwebmp.webawesome.components.icon.IconVariant;
import com.jwebmp.webawesome.components.icon.WaIcon;

public class WaIconFA<J extends WaIconFA<J>> extends WaIcon<J>
{
    public WaIconFA()
    {
    }

    public WaIconFA(IFontAwesomeIcon iconName)
    {
        super(iconName.toAngularIcon());
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
