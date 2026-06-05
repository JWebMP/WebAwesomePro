package com.jwebmp.webawesomepro.components.video;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-video>} component used to embed and play video content with custom
 * controls and captions.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 * <p>
 * Events: {@code timeupdate}, {@code play}, {@code pause}, {@code volumechange}, {@code error},
 * {@code ended}, {@code loadedmetadata}.
 * <p>
 * Slots: default ({@code <source>}/{@code <track>}), {@code controls-start}, {@code controls-after-play},
 * {@code poster-icon}, {@code play-icon}, {@code pause-icon}, {@code volume-icon}, {@code mute-icon},
 * {@code fullscreen-icon}, {@code exit-fullscreen-icon}.
 * <p>
 * CSS Custom Properties: {@code --controls-color}, {@code --controls-background},
 * {@code --poster-play-button-background}.
 */
@Getter
@NgImportReference(value = "WaVideoDirective", reference = "angular-awesome")
@NgImportModule("WaVideoDirective")
public class WaVideo<J extends WaVideo<J>> extends DivSimple<J>
{
    /**
     * The video's controls preset.
     */
    private VideoControls controls;

    /**
     * A URL pointing to a WebVTT file for timeline thumbnail previews.
     */
    private String thumbnails;

    /**
     * The URL of the video source.
     */
    private String src;

    /**
     * Poster image URL.
     */
    private String poster;

    /**
     * The video's title.
     */
    private String title;

    /**
     * Whether the video is currently playing.
     */
    private Boolean playing;

    /**
     * Whether the video is muted.
     */
    private Boolean muted;

    /**
     * The video's volume (0-1).
     */
    private String volume;

    /**
     * The total duration of the video in seconds.
     */
    private String duration;

    /**
     * The current playback position in seconds.
     */
    private String currentTime;

    /**
     * Enables autoplay when the component connects.
     */
    private Boolean autoplay;

    /**
     * Loops the video when playback ends.
     */
    private Boolean loop;

    /**
     * Enables autoplay in a muted state.
     */
    private Boolean autoplayMuted;

    /**
     * Automatically resumes playback when scrolled back into view.
     */
    private Boolean autoplayOnVisible;

    /**
     * Controls how the browser preloads the video.
     */
    private VideoPreload preload;

    /**
     * Icon library used for all built-in control icons.
     */
    private String iconLibrary;

    // CSS custom properties
    private String controlsColor;
    private String controlsBackground;
    private String posterPlayButtonBackground;

    // Slots
    private IComponentHierarchyBase<?, ?> controlsStart;
    private IComponentHierarchyBase<?, ?> controlsAfterPlay;
    private IComponentHierarchyBase<?, ?> posterIcon;
    private IComponentHierarchyBase<?, ?> playIcon;
    private IComponentHierarchyBase<?, ?> pauseIcon;
    private IComponentHierarchyBase<?, ?> volumeIcon;
    private IComponentHierarchyBase<?, ?> muteIcon;
    private IComponentHierarchyBase<?, ?> fullscreenIcon;
    private IComponentHierarchyBase<?, ?> exitFullscreenIcon;

    // Events
    private String timeupdateEvent;
    private String playEvent;
    private String pauseEvent;
    private String volumechangeEvent;
    private String errorEvent;
    private String endedEvent;
    private String loadedmetadataEvent;

    /**
     * Creates a new WaVideo component.
     */
    public WaVideo()
    {
        setTag("wa-video");
    }

    /**
     * Creates a new WaVideo component with the specified source URL.
     *
     * @param src The video source URL
     */
    public WaVideo(String src)
    {
        this();
        this.src = src;
    }

    @SuppressWarnings("unchecked")
    public J setControls(VideoControls controls)
    {
        this.controls = controls;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setThumbnails(String thumbnails)
    {
        this.thumbnails = thumbnails;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSrc(String src)
    {
        this.src = src;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPoster(String poster)
    {
        this.poster = poster;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setTitle(String title)
    {
        this.title = title;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPlaying(Boolean playing)
    {
        this.playing = playing;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMuted(Boolean muted)
    {
        this.muted = muted;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setVolume(String volume)
    {
        this.volume = volume;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setVolume(double volume)
    {
        this.volume = String.valueOf(volume);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDuration(String duration)
    {
        this.duration = duration;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCurrentTime(String currentTime)
    {
        this.currentTime = currentTime;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutoplay(Boolean autoplay)
    {
        this.autoplay = autoplay;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLoop(Boolean loop)
    {
        this.loop = loop;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutoplayMuted(Boolean autoplayMuted)
    {
        this.autoplayMuted = autoplayMuted;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutoplayOnVisible(Boolean autoplayOnVisible)
    {
        this.autoplayOnVisible = autoplayOnVisible;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPreload(VideoPreload preload)
    {
        this.preload = preload;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setIconLibrary(String iconLibrary)
    {
        this.iconLibrary = iconLibrary;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setControlsColor(String controlsColor)
    {
        this.controlsColor = controlsColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setControlsBackground(String controlsBackground)
    {
        this.controlsBackground = controlsBackground;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPosterPlayButtonBackground(String posterPlayButtonBackground)
    {
        this.posterPlayButtonBackground = posterPlayButtonBackground;
        return (J) this;
    }

    // Slot setters
    @SuppressWarnings("unchecked")
    public J setControlsStart(IComponentHierarchyBase<?, ?> controlsStart)
    {
        this.controlsStart = controlsStart;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setControlsAfterPlay(IComponentHierarchyBase<?, ?> controlsAfterPlay)
    {
        this.controlsAfterPlay = controlsAfterPlay;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPosterIcon(IComponentHierarchyBase<?, ?> posterIcon)
    {
        this.posterIcon = posterIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPlayIcon(IComponentHierarchyBase<?, ?> playIcon)
    {
        this.playIcon = playIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPauseIcon(IComponentHierarchyBase<?, ?> pauseIcon)
    {
        this.pauseIcon = pauseIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setVolumeIcon(IComponentHierarchyBase<?, ?> volumeIcon)
    {
        this.volumeIcon = volumeIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMuteIcon(IComponentHierarchyBase<?, ?> muteIcon)
    {
        this.muteIcon = muteIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFullscreenIcon(IComponentHierarchyBase<?, ?> fullscreenIcon)
    {
        this.fullscreenIcon = fullscreenIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setExitFullscreenIcon(IComponentHierarchyBase<?, ?> exitFullscreenIcon)
    {
        this.exitFullscreenIcon = exitFullscreenIcon;
        return (J) this;
    }

    // Event setters
    @SuppressWarnings("unchecked")
    public J setTimeupdateEvent(String timeupdateEvent)
    {
        this.timeupdateEvent = timeupdateEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPlayEvent(String playEvent)
    {
        this.playEvent = playEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPauseEvent(String pauseEvent)
    {
        this.pauseEvent = pauseEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setVolumechangeEvent(String volumechangeEvent)
    {
        this.volumechangeEvent = volumechangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setErrorEvent(String errorEvent)
    {
        this.errorEvent = errorEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setEndedEvent(String endedEvent)
    {
        this.endedEvent = endedEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLoadedmetadataEvent(String loadedmetadataEvent)
    {
        this.loadedmetadataEvent = loadedmetadataEvent;
        return (J) this;
    }

    /**
     * Starts playback. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J play()
    {
        return (J) this;
    }

    /**
     * Pauses playback. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J pause()
    {
        return (J) this;
    }

    /**
     * Toggles between play and pause. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J togglePlay()
    {
        return (J) this;
    }

    /**
     * Toggles the muted state. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J toggleMute()
    {
        return (J) this;
    }

    /**
     * Seeks to a specific time in the video. Implemented client-side; provided here for fluent chaining.
     *
     * @param time The time in seconds
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J seek(double time)
    {
        return (J) this;
    }

    /**
     * Sets the volume level. Implemented client-side; provided here for fluent chaining.
     *
     * @param volume The volume (0-1)
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setPlaybackVolume(double volume)
    {
        return (J) this;
    }

    /**
     * Sets the playback rate (speed). Implemented client-side; provided here for fluent chaining.
     *
     * @param rate The playback rate
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J setPlaybackRate(double rate)
    {
        return (J) this;
    }

    /**
     * Enters fullscreen mode. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J requestFullscreen()
    {
        return (J) this;
    }

    /**
     * Exits fullscreen mode. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J exitFullscreen()
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
            if (thumbnails != null)
            {
                addAttribute("thumbnails", thumbnails);
            }
            if (src != null)
            {
                addAttribute("src", src);
            }
            if (poster != null)
            {
                addAttribute("poster", poster);
            }
            if (title != null)
            {
                addAttribute("title", title);
            }
            if (volume != null)
            {
                addAttribute("volume", volume);
            }
            if (duration != null)
            {
                addAttribute("duration", duration);
            }
            if (currentTime != null)
            {
                addAttribute("current-time", currentTime);
            }
            if (preload != null)
            {
                addAttribute("preload", preload.toString());
            }
            if (iconLibrary != null)
            {
                addAttribute("icon-library", iconLibrary);
            }

            // Boolean attributes
            if (playing != null && playing)
            {
                addAttribute("playing", "");
            }
            if (muted != null && muted)
            {
                addAttribute("muted", "");
            }
            if (autoplay != null && autoplay)
            {
                addAttribute("autoplay", "");
            }
            if (loop != null && loop)
            {
                addAttribute("loop", "");
            }
            if (autoplayMuted != null && autoplayMuted)
            {
                addAttribute("autoplay-muted", "");
            }
            if (autoplayOnVisible != null && autoplayOnVisible)
            {
                addAttribute("autoplay-on-visible", "");
            }

            // CSS custom properties
            if (!Strings.isNullOrEmpty(controlsColor))
            {
                addStyle("--controls-color", controlsColor);
            }
            if (!Strings.isNullOrEmpty(controlsBackground))
            {
                addStyle("--controls-background", controlsBackground);
            }
            if (!Strings.isNullOrEmpty(posterPlayButtonBackground))
            {
                addStyle("--poster-play-button-background", posterPlayButtonBackground);
            }

            // Events
            if (!Strings.isNullOrEmpty(timeupdateEvent))
            {
                addAttribute("(timeupdate)", timeupdateEvent);
            }
            if (!Strings.isNullOrEmpty(playEvent))
            {
                addAttribute("(play)", playEvent);
            }
            if (!Strings.isNullOrEmpty(pauseEvent))
            {
                addAttribute("(pause)", pauseEvent);
            }
            if (!Strings.isNullOrEmpty(volumechangeEvent))
            {
                addAttribute("(volumechange)", volumechangeEvent);
            }
            if (!Strings.isNullOrEmpty(errorEvent))
            {
                addAttribute("(error)", errorEvent);
            }
            if (!Strings.isNullOrEmpty(endedEvent))
            {
                addAttribute("(ended)", endedEvent);
            }
            if (!Strings.isNullOrEmpty(loadedmetadataEvent))
            {
                addAttribute("(loadedmetadata)", loadedmetadataEvent);
            }

            // Slots
            if (controlsStart != null)
            {
                controlsStart.asAttributeBase()
                             .addAttribute("slot", "controls-start");
                add(controlsStart);
            }
            if (controlsAfterPlay != null)
            {
                controlsAfterPlay.asAttributeBase()
                                 .addAttribute("slot", "controls-after-play");
                add(controlsAfterPlay);
            }
            if (posterIcon != null)
            {
                posterIcon.asAttributeBase()
                          .addAttribute("slot", "poster-icon");
                add(posterIcon);
            }
            if (playIcon != null)
            {
                playIcon.asAttributeBase()
                        .addAttribute("slot", "play-icon");
                add(playIcon);
            }
            if (pauseIcon != null)
            {
                pauseIcon.asAttributeBase()
                         .addAttribute("slot", "pause-icon");
                add(pauseIcon);
            }
            if (volumeIcon != null)
            {
                volumeIcon.asAttributeBase()
                          .addAttribute("slot", "volume-icon");
                add(volumeIcon);
            }
            if (muteIcon != null)
            {
                muteIcon.asAttributeBase()
                        .addAttribute("slot", "mute-icon");
                add(muteIcon);
            }
            if (fullscreenIcon != null)
            {
                fullscreenIcon.asAttributeBase()
                              .addAttribute("slot", "fullscreen-icon");
                add(fullscreenIcon);
            }
            if (exitFullscreenIcon != null)
            {
                exitFullscreenIcon.asAttributeBase()
                                  .addAttribute("slot", "exit-fullscreen-icon");
                add(exitFullscreenIcon);
            }
        }
        super.init();
    }
}

