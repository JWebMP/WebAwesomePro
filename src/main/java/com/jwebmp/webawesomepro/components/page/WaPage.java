package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.webawesome.components.BreakpointCapable;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a Web Awesome Pro page component.
 * This class provides methods to configure the page's attributes and child components.
 */
@Setter
@Getter
public class WaPage<J extends WaPage<J>> extends DivSimple<J> implements BreakpointCapable<J>
{
    /**
     * The banner component of the page.
     * This can be null if not set.
     */
    private WaPageBanner<?> banner;

    /**
     * The header component of the page.
     * This can be null if not set.
     */
    private WaPageHeader<?> header;

    /**
     * The sub-header component of the page.
     * This can be null if not set.
     */
    private WaPageSubHeader<?> subHeader;

    /**
     * The navigation header component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigationHeader<?> navigationHeader;

    /**
     * The navigation component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigation<?> navigation;

    /**
     * The navigation footer component of the page.
     * This can be null if not set.
     */
    private WaPageContentsNavigationFooter<?> navigationFooter;

    /**
     * The main header component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMainHeader<?> mainHeader;

    /**
     * The main content component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMain<?> main;

    /**
     * The main footer component of the page.
     * This can be null if not set.
     */
    private WaPageContentsMainFooter<?> mainFooter;

    /**
     * The aside component of the page.
     * This can be null if not set.
     */
    private WaPageContentsAside<?> aside;

    /**
     * The footer component of the page.
     * This can be null if not set.
     */
    private WaPageFooter<?> footer;

    /**
     * Default constructor for the WaPage class.
     * Initializes the component with a default tag of `wa-page`.
     */
    public WaPage()
    {
        setTag("wa-page");
    }

    /**
     * Initializes the component.
     * Adds the child components to the page.
     */
    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (banner != null)
            {
                add(banner);
            }
            if (header != null)
            {
                add(header);
            }
            if (subHeader != null)
            {
                add(subHeader);
            }
            if (navigationHeader != null)
            {
                add(navigationHeader);
            }
            if (navigation != null)
            {
                add(navigation);
            }
            if (navigationFooter != null)
            {
                add(navigationFooter);
            }
            if (mainHeader != null)
            {
                add(mainHeader);
            }
            if (main != null)
            {
                add(main);
            }
            if (mainFooter != null)
            {
                add(mainFooter);
            }
            if (aside != null)
            {
                add(aside);
            }
            if (footer != null)
            {
                add(footer);
            }
        }
        super.init();
    }

    /**
     * Gets the banner component of the page.
     * Initializes it if not already set.
     *
     * @return The banner component.
     */
    public WaPageBanner<?> getBanner()
    {
        if (banner == null)
        {
            banner = new WaPageBanner();
        }
        return banner;
    }

    /**
     * Gets the header component of the page.
     * Initializes it if not already set.
     *
     * @return The header component.
     */
    public WaPageHeader<?> getHeader()
    {
        if (header == null)
        {
            header = new WaPageHeader();
        }
        return header;
    }

    /**
     * Gets the sub-header component of the page.
     * Initializes it if not already set.
     *
     * @return The sub-header component.
     */
    public WaPageSubHeader<?> getSubHeader()
    {
        if (subHeader == null)
        {
            subHeader = new WaPageSubHeader();
        }
        return subHeader;
    }

    /**
     * Gets the navigation component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation component.
     */
    public WaPageContentsNavigation<?> getNavigation()
    {
        if (navigation == null)
        {
            navigation = new WaPageContentsNavigation();
        }
        return navigation;
    }

    /**
     * Gets the navigation footer component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation footer component.
     */
    public WaPageContentsNavigationFooter<?> getNavigationFooter()
    {
        if (navigationFooter == null)
        {
            navigationFooter = new WaPageContentsNavigationFooter();
        }
        return navigationFooter;
    }

    /**
     * Gets the main content component of the page.
     * Initializes it if not already set.
     *
     * @return The main content component.
     */
    public WaPageContentsMain<?> getMain()
    {
        if (main == null)
        {
            main = new WaPageContentsMain();
        }
        return main;
    }

    /**
     * Gets the main footer component of the page.
     * Initializes it if not already set.
     *
     * @return The main footer component.
     */
    public WaPageContentsMainFooter getMainFooter()
    {
        if (mainFooter == null)
        {
            mainFooter = new WaPageContentsMainFooter();
        }
        return mainFooter;
    }

    /**
     * Gets the aside component of the page.
     * Initializes it if not already set.
     *
     * @return The aside component.
     */
    public WaPageContentsAside<?> getAside()
    {
        if (aside == null)
        {
            aside = new WaPageContentsAside();
        }
        return aside;
    }

    /**
     * Gets the footer component of the page.
     * Initializes it if not already set.
     *
     * @return The footer component.
     */
    public WaPageFooter<?> getFooter()
    {
        if (footer == null)
        {
            footer = new WaPageFooter();
            add(footer);
        }
        return footer;
    }

    /**
     * Gets the navigation header component of the page.
     * Initializes it if not already set.
     *
     * @return The navigation header component.
     */
    public WaPageContentsNavigationHeader<?> getNavigationHeader()
    {
        if (navigationHeader == null)
        {
            navigationHeader = new WaPageContentsNavigationHeader();
            add(navigationHeader);
        }
        return navigationHeader;
    }

    /**
     * Gets the main header component of the page.
     * Initializes it if not already set.
     *
     * @return The main header component.
     */
    public WaPageContentsMainHeader<?> getMainHeader()
    {
        if (mainHeader == null)
        {
            mainHeader = new WaPageContentsMainHeader();
            add(mainHeader);
        }
        return mainHeader;
    }
}