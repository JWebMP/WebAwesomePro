package com.jwebmp.webawesomepro.components.video;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaVideoPlaylistTest
{
    @Test
    void rendersBasicPlaylistTag()
    {
        var s = new WaVideoPlaylist<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-video-playlist"), "Should render wa-video-playlist tag");
        assertTrue(s.contains("</wa-video-playlist>"), "Should have closing tag");
    }

    @Test
    void rendersControlsAndIconLibrary()
    {
        var s = new WaVideoPlaylist<>()
                .setControls(VideoControls.Standard)
                .setIconLibrary("system")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("controls=\"standard\""));
        assertTrue(s.contains("icon-library=\"system\""));
    }

    @Test
    void rendersVideoChangeEvent()
    {
        var s = new WaVideoPlaylist<>()
                .setVideoChangeEvent("onVideoChange($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("(wa-video-change)=\"onVideoChange($event)\""));
    }

    @Test
    void nestsVideoChildren()
    {
        var s = new WaVideoPlaylist<>()
                .add(new WaVideo<>("a.mp4"))
                .add(new WaVideo<>("b.mp4"))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-video"));
        assertTrue(s.contains("src=\"a.mp4\""));
        assertTrue(s.contains("src=\"b.mp4\""));
    }
}

