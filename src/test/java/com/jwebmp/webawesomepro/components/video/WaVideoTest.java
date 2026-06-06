package com.jwebmp.webawesomepro.components.video;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaVideoTest
{
    @Test
    void rendersBasicVideoTag()
    {
        var s = new WaVideo<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-video"), "Should render wa-video tag");
        assertTrue(s.contains("</wa-video>"), "Should have closing tag");
    }

    @Test
    void rendersSourcePosterAndControls()
    {
        var s = new WaVideo<>("https://example.com/movie.mp4")
                .setPoster("https://example.com/poster.jpg")
                .setTitle("Demo")
                .setControls(VideoControls.Full)
                .setPreload(VideoPreload.Auto)
                .setIconLibrary("system")
                .setThumbnails("https://example.com/thumbs.vtt")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("src=\"https://example.com/movie.mp4\""));
        assertTrue(s.contains("poster=\"https://example.com/poster.jpg\""));
        assertTrue(s.contains("title=\"Demo\""));
        assertTrue(s.contains("controls=\"full\""));
        assertTrue(s.contains("preload=\"auto\""));
        assertTrue(s.contains("icon-library=\"system\""));
        assertTrue(s.contains("thumbnails=\"https://example.com/thumbs.vtt\""));
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaVideo<>()
                .setPlaying(true)
                .setMuted(true)
                .setAutoplay(true)
                .setLoop(true)
                .setAutoplayMuted(true)
                .setAutoplayOnVisible(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("playing"), "playing boolean expected");
        assertTrue(s.contains("muted"), "muted boolean expected");
        assertTrue(s.contains("autoplay"), "autoplay boolean expected");
        assertTrue(s.contains("loop"), "loop boolean expected");
        assertTrue(s.contains("autoplay-muted"), "autoplay-muted boolean expected");
        assertTrue(s.contains("autoplay-on-visible"), "autoplay-on-visible boolean expected");
    }

    @Test
    void rendersNumericAttributesAndCssProps()
    {
        var s = new WaVideo<>()
                .setVolume(0.5)
                .setDuration("120")
                .setCurrentTime("12")
                .setControlsColor("white")
                .setControlsBackground("#000")
                .setPosterPlayButtonBackground("#222")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("volume=\"0.5\""));
        assertTrue(s.contains("duration=\"120\""));
        assertTrue(s.contains("current-time=\"12\""));
        assertTrue(s.contains("--controls-color:white"));
        assertTrue(s.contains("--controls-background:#000"));
        assertTrue(s.contains("--poster-play-button-background:#222"));
    }

    @Test
    void rendersEvents()
    {
        var s = new WaVideo<>()
                .setTimeupdateEvent("onTimeUpdate($event)")
                .setPlayEvent("onPlay()")
                .setEndedEvent("onEnded()")
                .setLoadedmetadataEvent("onLoaded($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("(timeupdate)=\"onTimeUpdate($event)\""));
        assertTrue(s.contains("(play)=\"onPlay()\""));
        assertTrue(s.contains("(ended)=\"onEnded()\""));
        assertTrue(s.contains("(loadedmetadata)=\"onLoaded($event)\""));
    }
}

