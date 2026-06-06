package com.jwebmp.webawesomepro.components.toast;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WaToastContainerTest
{
    @Test
    public void rendersBasicContainer()
    {
        var html = new WaToastContainer<>()
                .toString(true);
        System.out.println(html);

        assertEquals("<wa-toast></wa-toast>", html);
    }

    @Test
    public void rendersWithPropsAndBindings()
    {
        var html = new WaToastContainer<>()
                .setPlacement("bottom-center")
                .setMax(3)
                .setDuration(4000)
                .setNewestOnTop(true)

                .bindPlacement("pos")
                .bindMax("max")
                .bindDuration("dur")
                .bindNewestOnTop("newTop")
                .toString(true);
        System.out.println(html);
        assertTrue(html.startsWith("<wa-toast "));
        assertTrue(html.contains("placement=\"bottom-center\""));
        assertTrue(html.contains("max=\"3\""));
        assertTrue(html.contains("duration=\"4000\""));
        assertTrue(html.contains("newest-on-top"));
        assertTrue(html.contains("[placement]=\"pos\""));
        assertTrue(html.contains("[max]=\"max\""));
        assertTrue(html.contains("[duration]=\"dur\""));
        assertTrue(html.contains("[newestOnTop]=\"newTop\""));
    }
}
