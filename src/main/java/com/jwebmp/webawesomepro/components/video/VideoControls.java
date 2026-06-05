package com.jwebmp.webawesomepro.components.video;

/**
 * Controls preset for {@code <wa-video>} and {@code <wa-video-playlist>}.
 * <p>
 * This is a <strong>Pro</strong> token requiring a Web Awesome Pro licence.
 */
public enum VideoControls
{
    /**
     * No controls are shown.
     */
    None("none"),

    /**
     * Shows the timeline, play/pause, volume, captions, and fullscreen.
     */
    Standard("standard"),

    /**
     * All standard controls plus playback speed and picture-in-picture.
     */
    Full("full");

    private final String value;

    VideoControls(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

