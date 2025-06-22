package com.jwebmp.webawesomepro.components.page;

import com.jwebmp.core.base.html.H2;
import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.core.base.html.Section;
import com.jwebmp.webawesome.components.PageSize;
import com.jwebmp.webawesome.components.WaCluster;
import com.jwebmp.webawesome.components.WaFlank;
import com.jwebmp.webawesome.components.WaStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaPageTest
{

    @Test
    void testGetBanner()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getBanner(), "Banner should not be null after calling getBanner()");
        assertEquals(1, waPage.getChildren().size(), "Banner should be added as a child of WaPage");
    }

    @Test
    void testGetHeader()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getHeader(), "Header should not be null after calling getHeader()");
        assertEquals(1, waPage.getChildren().size(), "Header should be added as a child of WaPage");
    }

    @Test
    void testGetSubHeader()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getSubHeader(), "SubHeader should not be null after calling getSubHeader()");
        assertEquals(1, waPage.getChildren().size(), "SubHeader should be added as a child of WaPage");
    }

    @Test
    void testGetNavigation()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getNavigation(), "Navigation should not be null after calling getNavigation()");
        assertEquals(1, waPage.getChildren().size(), "Navigation should be added as a child of WaPage");
    }

    @Test
    void testGetNavigationFooter()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getNavigationFooter(), "NavigationFooter should not be null after calling getNavigationFooter()");
        assertEquals(1, waPage.getChildren().size(), "NavigationFooter should be added as a child of WaPage");
    }

    @Test
    void testGetMain()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getMain(), "Main should not be null after calling getMain()");
        assertEquals(1, waPage.getChildren().size(), "Main should be added as a child of WaPage");
    }

    @Test
    void testGetMainFooter()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getMainFooter(), "MainFooter should not be null after calling getMainFooter()");
        assertEquals(1, waPage.getChildren().size(), "MainFooter should be added as a child of WaPage");
    }

    @Test
    void testGetAside()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getAside(), "Aside should not be null after calling getAside()");
        assertEquals(1, waPage.getChildren().size(), "Aside should be added as a child of WaPage");
    }

    @Test
    void testGetFooter()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getFooter(), "Footer should not be null after calling getFooter()");
        assertEquals(1, waPage.getChildren().size(), "Footer should be added as a child of WaPage");
    }

    @Test
    void testMultipleGetters()
    {
        WaPage waPage = new WaPage();
        assertNotNull(waPage.getBanner());
        assertNotNull(waPage.getHeader());
        assertNotNull(waPage.getSubHeader());
        assertNotNull(waPage.getNavigation());
        assertNotNull(waPage.getNavigationFooter());
        assertNotNull(waPage.getMain());
        assertNotNull(waPage.getMainFooter());
        assertNotNull(waPage.getAside());
        assertNotNull(waPage.getFooter());

        assertEquals(9, waPage.getChildren().size(), "All components should be added to WaPage as children");

        String html = waPage.toString(true);
        // Debug output removed for production

        // Verify that all components are present in the HTML output
        assertTrue(html.contains("<wa-page>"), "HTML should contain the wa-page tag");

        // Check for slot attributes in a more flexible way
        assertTrue(html.contains("slot="), "HTML should contain slot attributes");
        assertTrue(html.contains("banner"), "HTML should contain banner component");
        assertTrue(html.contains("header"), "HTML should contain header component");
        assertTrue(html.contains("subheader"), "HTML should contain subheader component");
        assertTrue(html.contains("navigation"), "HTML should contain navigation component");
        assertTrue(html.contains("navigation-footer"), "HTML should contain navigation-footer component");
        assertTrue(html.contains("main"), "HTML should contain main component");
        assertTrue(html.contains("main-footer"), "HTML should contain main-footer component");
        assertTrue(html.contains("aside"), "HTML should contain aside component");
        assertTrue(html.contains("footer"), "HTML should contain footer component");
    }

    @Test
    void testDemoAll()
    {
        WaPage waPage = new WaPage();
        waPage.setMobileBreakpoint(920);
        waPage.getBanner().setShowWhenPageSize(PageSize.Small);

        waPage.getHeader().setSplit(true);
        waPage.getHeader().add(new WaCluster());
        waPage.getHeader().add(new WaCluster().setGap(PageSize.ExtraSmall));
        waPage.getSubHeader().add(new WaCluster().setNoWrap());
        waPage.getNavigationHeader().add(new WaFlank());
        waPage.getNavigation().addNavAnchor("identification", "Identification");
        waPage.getNavigation().addNavAnchor("range", "Range and Stuff");
        waPage.getNavigation().addNavAnchor("behavior", "Behaviour");
        waPage.getNavigation().addNavAnchor("conservation", "Conservation");

        waPage.getNavigationFooter().add(new WaFlank().setDisplayAsLink());
        waPage.getNavigationFooter().add(new WaFlank().setDisplayAsLink());

        waPage.getMainHeader().add(new WaFlank(false).setBorderRadius(PageSize.Medium));

        waPage.getMain().addContent("identification", new Paragraph<>("Identification Nav"));
        waPage.getMain().addContent("range", new Paragraph<>("Range Content"));
        waPage.getMain().addContent("behavior", new Paragraph<>("Behavior Content"));
        waPage.getMain().addContent("conservation", new Paragraph<>("Conservation Content"));

        waPage.getMainFooter().add(new Section<>());

        waPage.getAside().add(new H2<>("Aside Content"));

        waPage.getFooter().add(new WaCluster());
        waPage.getFooter().add(new WaStack());
        waPage.getFooter().add(new WaStack());
        waPage.getFooter().add(new WaStack());

        String html = waPage.toString(true);
        // Debug output removed for production

        // Verify mobile breakpoint attribute
        assertTrue(html.contains("mobile-breakpoint=\"920\""), "HTML should contain the mobile-breakpoint attribute");

        // Verify banner component is present
        assertTrue(html.contains("banner"), "HTML should contain the banner component");

        // Verify header with split class
        assertTrue(html.contains("class=\"wa-split\""), "HTML should contain the wa-split class for header");

        // Verify navigation anchors
        assertTrue(html.contains("identification"), "HTML should contain the identification anchor");
        assertTrue(html.contains("range"), "HTML should contain the range anchor");
        assertTrue(html.contains("behavior"), "HTML should contain the behavior anchor");
        assertTrue(html.contains("conservation"), "HTML should contain the conservation anchor");

        // Verify content text
        assertTrue(html.contains("Identification Nav"), "HTML should contain the identification content");
        assertTrue(html.contains("Range Content"), "HTML should contain the range content");
        assertTrue(html.contains("Behavior Content"), "HTML should contain the behavior content");
        assertTrue(html.contains("Conservation Content"), "HTML should contain the conservation content");

        // Verify aside content
        assertTrue(html.contains("Aside Content"), "HTML should contain the aside content");

        // Verify footer components
        int waClusterCount = countOccurrences(html, "wa-cluster");
        int waStackCount = countOccurrences(html, "wa-stack");
        assertTrue(waClusterCount >= 3, "HTML should contain at least 3 wa-cluster components"); // 1 in header, 1 in subheader, 1 in footer
        assertTrue(waStackCount >= 3, "HTML should contain at least 3 wa-stack components"); // 3 in footer
    }

    private int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }


    @Test
    void testBindingMethods()
    {
        WaPage waPage = new WaPage();

        // Test input bindings
        waPage.bindMobileBreakpoint("breakpointVar");
        waPage.bindNavOpen("navOpenVar");
        waPage.bindDisableSticky("disableStickyVar");
        waPage.bindNavigationPlacement("placementVar");

        // Test style bindings
        waPage.bindMenuWidth("menuWidthVar");
        waPage.bindMainWidth("mainWidthVar");
        waPage.bindAsideWidth("asideWidthVar");
        waPage.bindBannerHeight("bannerHeightVar");
        waPage.bindHeaderHeight("headerHeightVar");
        waPage.bindSubheaderHeight("subheaderHeightVar");

        // Verify attributes are set correctly
        assertEquals("breakpointVar", waPage.getAttributes().get("[mobile-breakpoint]"), "Mobile breakpoint binding failed");
        assertEquals("navOpenVar", waPage.getAttributes().get("[nav-open]"), "Nav open binding failed");
        assertEquals("disableStickyVar", waPage.getAttributes().get("[disable-sticky]"), "Disable sticky binding failed");
        assertEquals("placementVar", waPage.getAttributes().get("[navigation-placement]"), "Navigation placement binding failed");

        // Verify style bindings are set correctly
        assertEquals("menuWidthVar", waPage.getAttributes().get("[style.--menu-width]"), "Menu width binding failed");
        assertEquals("mainWidthVar", waPage.getAttributes().get("[style.--main-width]"), "Main width binding failed");
        assertEquals("asideWidthVar", waPage.getAttributes().get("[style.--aside-width]"), "Aside width binding failed");
        assertEquals("bannerHeightVar", waPage.getAttributes().get("[style.--banner-height]"), "Banner height binding failed");
        assertEquals("headerHeightVar", waPage.getAttributes().get("[style.--header-height]"), "Header height binding failed");
        assertEquals("subheaderHeightVar", waPage.getAttributes().get("[style.--subheader-height]"), "Subheader height binding failed");

        // Verify the HTML output contains all the binding attributes
        String html = waPage.toString(true);
        assertTrue(html.contains("[mobile-breakpoint]=\"breakpointVar\""), "HTML should contain the mobile-breakpoint binding");
        assertTrue(html.contains("[nav-open]=\"navOpenVar\""), "HTML should contain the nav-open binding");
        assertTrue(html.contains("[disable-sticky]=\"disableStickyVar\""), "HTML should contain the disable-sticky binding");
        assertTrue(html.contains("[navigation-placement]=\"placementVar\""), "HTML should contain the navigation-placement binding");

        // Verify style bindings in HTML
        assertTrue(html.contains("[style.--menu-width]=\"menuWidthVar\""), "HTML should contain the menu-width style binding");
        assertTrue(html.contains("[style.--main-width]=\"mainWidthVar\""), "HTML should contain the main-width style binding");
        assertTrue(html.contains("[style.--aside-width]=\"asideWidthVar\""), "HTML should contain the aside-width style binding");
        assertTrue(html.contains("[style.--banner-height]=\"bannerHeightVar\""), "HTML should contain the banner-height style binding");
        assertTrue(html.contains("[style.--header-height]=\"headerHeightVar\""), "HTML should contain the header-height style binding");
        assertTrue(html.contains("[style.--subheader-height]=\"subheaderHeightVar\""), "HTML should contain the subheader-height style binding");
    }

    @Test
    void testNavigationMethods()
    {
        WaPage waPage = new WaPage();

        // Test initial state
        assertFalse(waPage.isNavOpen(), "Nav should be closed initially");

        // Test showNavigation method
        waPage.showNavigation();
        assertTrue(waPage.isNavOpen(), "Nav should be open after showNavigation");
        assertEquals("true", waPage.getAttributes().get("nav-open"), "nav-open attribute should be true");

        // Test hideNavigation method
        waPage.hideNavigation();
        assertFalse(waPage.isNavOpen(), "Nav should be closed after hideNavigation");
        assertEquals("false", waPage.getAttributes().get("nav-open"), "nav-open attribute should be false");

        // Test toggleNavigation method
        waPage.toggleNavigation();
        assertTrue(waPage.isNavOpen(), "Nav should be open after first toggle");
        assertEquals("true", waPage.getAttributes().get("nav-open"), "nav-open attribute should be true");

        waPage.toggleNavigation();
        assertFalse(waPage.isNavOpen(), "Nav should be closed after second toggle");
        assertEquals("false", waPage.getAttributes().get("nav-open"), "nav-open attribute should be false");
    }

    @Test
    void testPropertySetters()
    {
        WaPage waPage = new WaPage();

        // Test setting properties
        waPage.setDisableSticky("header aside");
        waPage.setNavigationPlacement("start");
        waPage.setMenuWidth("15rem");
        waPage.setMainWidth("60%");
        waPage.setAsideWidth("25%");
        waPage.setBannerHeight("40px");
        waPage.setHeaderHeight("64px");
        waPage.setSubheaderHeight("32px");

        // Verify properties are set correctly
        assertEquals("header aside", waPage.getDisableSticky(), "disableSticky property should be set");
        assertEquals("start", waPage.getNavigationPlacement(), "navigationPlacement property should be set");
        assertEquals("15rem", waPage.getMenuWidth(), "menuWidth property should be set");
        assertEquals("60%", waPage.getMainWidth(), "mainWidth property should be set");
        assertEquals("25%", waPage.getAsideWidth(), "asideWidth property should be set");
        assertEquals("40px", waPage.getBannerHeight(), "bannerHeight property should be set");
        assertEquals("64px", waPage.getHeaderHeight(), "headerHeight property should be set");
        assertEquals("32px", waPage.getSubheaderHeight(), "subheaderHeight property should be set");

        // Verify attributes are set correctly
        assertEquals("header aside", waPage.getAttributes().get("disable-sticky"), "disable-sticky attribute should be set");
        assertEquals("start", waPage.getAttributes().get("navigation-placement"), "navigation-placement attribute should be set");

        // Verify styles are set correctly
        String html = waPage.toString(true);
        // Debug output removed for production

        // Check for style properties in a more flexible way
        assertTrue(html.contains("--menu-width"), "HTML should contain menu-width style property");
        assertTrue(html.contains("15rem"), "HTML should contain menu-width value");
        assertTrue(html.contains("--main-width"), "HTML should contain main-width style property");
        assertTrue(html.contains("60%"), "HTML should contain main-width value");
        assertTrue(html.contains("--aside-width"), "HTML should contain aside-width style property");
        assertTrue(html.contains("25%"), "HTML should contain aside-width value");
        assertTrue(html.contains("--banner-height"), "HTML should contain banner-height style property");
        assertTrue(html.contains("40px"), "HTML should contain banner-height value");
        assertTrue(html.contains("--header-height"), "HTML should contain header-height style property");
        assertTrue(html.contains("64px"), "HTML should contain header-height value");
        assertTrue(html.contains("--subheader-height"), "HTML should contain subheader-height style property");
        assertTrue(html.contains("32px"), "HTML should contain subheader-height value");
    }
}
