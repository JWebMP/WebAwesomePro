package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.BreakpointCapable;


public class WaPage extends DivSimple<WaPage> implements BreakpointCapable<WaPage>
{
    private WaPageBanner banner;
    private WaPageHeader header;
    private WaPageSubHeader subHeader;
    private WaPageContentsNavigationHeader navigationHeader;
    private WaPageContentsNavigation navigation;
    private WaPageContentsNavigationFooter navigationFooter;
    private WaPageContentsMainHeader mainHeader;
    private WaPageContentsMain main;
    private WaPageContentsMainFooter mainFooter;
    private WaPageContentsAside aside;
    private WaPageFooter footer;

    public WaPage()
    {
        setTag("wa-page");
    }

    public WaPageBanner getBanner()
    {
        if (banner == null)
        {
            banner = new WaPageBanner();
            add(banner);
        }
        return banner;
    }

    public WaPageHeader getHeader()
    {
        if (header == null)
        {
            header = new WaPageHeader();
            add(header);
        }
        return header;
    }

    public WaPageSubHeader getSubHeader()
    {
        if (subHeader == null)
        {
            subHeader = new WaPageSubHeader();
            add(subHeader);
        }
        return subHeader;
    }

    public WaPageContentsNavigation getNavigation()
    {
        if (navigation == null)
        {
            navigation = new WaPageContentsNavigation();
            add(navigation);
        }
        return navigation;
    }

    public WaPageContentsNavigationFooter getNavigationFooter()
    {
        if (navigationFooter == null)
        {
            navigationFooter = new WaPageContentsNavigationFooter();
            add(navigationFooter);
        }
        return navigationFooter;
    }

    public WaPageContentsMain getMain()
    {
        if (main == null)
        {
            main = new WaPageContentsMain();
            add(main);
        }
        return main;
    }

    public WaPageContentsMainFooter getMainFooter()
    {
        if (mainFooter == null)
        {
            mainFooter = new WaPageContentsMainFooter();
            add(mainFooter);
        }
        return mainFooter;
    }

    public WaPageContentsAside getAside()
    {
        if (aside == null)
        {
            aside = new WaPageContentsAside();
            add(aside);
        }
        return aside;
    }

    public WaPageFooter getFooter()
    {
        if (footer == null)
        {
            footer = new WaPageFooter();
            add(footer);
        }
        return footer;
    }

    public WaPageContentsNavigationHeader getNavigationHeader()
    {
        if (navigationHeader == null)
        {
            navigationHeader = new WaPageContentsNavigationHeader();
            add(navigationHeader);
        }
        return navigationHeader;
    }

    public WaPageContentsMainHeader getMainHeader()
    {
        if (mainHeader == null)
        {
            mainHeader = new WaPageContentsMainHeader();
            add(mainHeader);
        }
        return mainHeader;
    }
}
