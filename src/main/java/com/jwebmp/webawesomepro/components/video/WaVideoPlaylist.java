package com.jwebmp.webawesomepro.components.video;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-video-playlist>} component that wraps multiple {@link WaVideo} elements
 * into a playlist with navigation controls and a sidebar.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 * <p>
 * Events: {@code wa-video-change}.
 * <p>
 * Slots: default (place {@code <wa-video>} elements).
 */
@Getter
@NgImportReference(value = "WaVideoPlaylistDirective", reference = "angular-awesome")
@NgImportModule("WaVideoPlaylistDirective")
public class WaVideoPlaylist<J extends WaVideoPlaylist<J>> extends DivSimple<J>
{
    /**
     * The controls preset forwarded to each child {@code <wa-video>}. Default {@code full}.
     */
    private VideoControls controls;

    /**
     * Icon library used for placeholder icons.
     */
    private String iconLibrary;

    /**
     * Event handler for when the active video changes.
     */
    private String videoChangeEvent;

    /**
     * Creates a new WaVideoPlaylist component.
     */
    public WaVideoPlaylist()
    {
        setTag("wa-video-playlist");
    }

    @SuppressWarnings("unchecked")
    public J setControls(VideoControls controls)
    {
        this.controls = controls;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setIconLibrary(String iconLibrary)
    {
        this.iconLibrary = iconLibrary;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setVideoChangeEvent(String videoChangeEvent)
    {
        this.videoChangeEvent = videoChangeEvent;
        return (J) this;
    }

    /**
     * Plays the next video in the playlist. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J next()
    {
        return (J) this;
    }

    /**
     * Plays the previous video in the playlist. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J previous()
    {
        return (J) this;
    }

    /**
     * Jumps to the video at the given index. Implemented client-side; provided here for fluent chaining.
     *
     * @param index The zero-based video index
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J goTo(int index)
    {
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (controls != null)
            {
                addAttribute("controls", controls.toString());
            }
            if (iconLibrary != null)
            {
                addAttribute("icon-library", iconLibrary);
            }
            if (!Strings.isNullOrEmpty(videoChangeEvent))
            {
                addAttribute("(wa-video-change)", videoChangeEvent);
            }
        }
        super.init();
    }
}

