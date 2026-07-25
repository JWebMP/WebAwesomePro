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

        assertEquals("<wa-toast-container></wa-toast-container>", html);
    }

    @Test
    public void rendersWithPropsAndBindings()
    {
        var html = new WaToastContainer<>()
                .setPlacement("bottom-center")
                .bindPlacement("pos")
                .toString(true);
        System.out.println(html);
        assertTrue(html.startsWith("<wa-toast-container "));
        assertTrue(html.contains("placement=\"bottom-center\""));
        assertTrue(html.contains("[placement]=\"pos\""));
    }
}
