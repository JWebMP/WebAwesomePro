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

        System.out.println(waPage.toString(true));
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

        System.out.println(waPage.toString(true));
    }


}