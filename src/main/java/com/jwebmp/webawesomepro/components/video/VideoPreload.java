package com.jwebmp.webawesomepro.components.video;

/**
 * Browser preload behaviour for {@code <wa-video>}.
 * <p>
 * This is a <strong>Pro</strong> token requiring a Web Awesome Pro licence.
 */
public enum VideoPreload
{
    Auto("auto"),
    Metadata("metadata"),
    None("none");

    private final String value;

    VideoPreload(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return value;
    }
}

