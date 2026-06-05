package com.jwebmp.webawesomepro.components.toast;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * Wrapper for the {@code <wa-toast>} element.
 * <p>
 * The container is responsible for positioning and stacking toasts created via the toast service.
 * Uses {@code placement} attribute with directional values (top-start, top-end, bottom-start, bottom-end).
 * <p>
 * Properties {@code gap} and {@code zIndex} are handled natively by the web component via CSS
 * custom properties ({@code --gap}) and native stacking respectively. {@code closable} is handled
 * by the native {@code <wa-toast-item>} close button. {@code appearance} is not supported by the
 * official component.
 */
@Getter
@NgImportReference(value = "WaToastDirective",reference = "angular-awesome")
@NgImportModule(value = "WaToastDirective")
public class WaToastContainer<J extends WaToastContainer<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{
    /**
     * Placement of the container on the screen. Supported values:
     * top-start, top-end, bottom-start, bottom-end, top-center, bottom-center
     */
    private String placement;

    /**
     * Maximum concurrent toasts visible. Optional; usually configured via provider.
     */
    private Integer max;

    /**
     * Default duration for auto-dismiss in ms. Optional; usually configured via provider.
     */
    private Integer duration;

    /**
     * When true, newer toasts appear at the top of the stack.
     */
    private Boolean newestOnTop;
    @SuppressWarnings("unchecked")
    public J setPlacement(String placement)
    {
        this.placement = placement;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setMax(Integer max)
    {
        this.max = max;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setDuration(Integer duration)
    {
        this.duration = duration;
        return (J) this;
    }    @SuppressWarnings("unchecked")
    public J setNewestOnTop(Boolean newestOnTop)
    {
        this.newestOnTop = newestOnTop;
        return (J) this;
    }

    public WaToastContainer()
    {
        setTag("wa-toast");
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (placement != null)
            {
                addAttribute("placement", placement);
            }
            if (max != null)
            {
                addAttribute("max", String.valueOf(max));
            }
            if (duration != null)
            {
                addAttribute("duration", String.valueOf(duration));
            }
            if (newestOnTop != null && newestOnTop)
            {
                addAttribute("newest-on-top", "");
            }
        }
        super.init();
    }

    // Binding helpers
    @SuppressWarnings("unchecked")
    public J bindPlacement(String variable)
    {
        addAttribute("[placement]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindMax(String variable)
    {
        addAttribute("[max]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindDuration(String variable)
    {
        addAttribute("[duration]", variable);
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J bindNewestOnTop(String variable)
    {
        addAttribute("[newestOnTop]", variable);
        return (J) this;
    }
}