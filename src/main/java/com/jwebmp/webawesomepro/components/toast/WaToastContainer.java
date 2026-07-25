package com.jwebmp.webawesomepro.components.toast;


import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import lombok.Getter;
/**
 * Wrapper for the {@code <wa-toast-container>} element, hydrated on the client by the
 * {@code WaToastContainerComponent} from {@code angular-awesome}.
 * <p>
 * The container is responsible for positioning and stacking toasts created via the toast service.
 * Uses the {@code placement} attribute with directional values (top-start, top-center, top-end,
 * bottom-start, bottom-center, bottom-end) — this is the <em>only</em> input the official
 * {@code WaToastContainerComponent} binds to the native element.
 * <p>
 * <strong>Important:</strong> this component <em>must</em> render {@code <wa-toast-container>}
 * (mapped to {@code WaToastContainerComponent}), <em>not</em> a bare {@code <wa-toast>} element
 * (mapped to the passive {@code WaToastDirective}). Only {@code WaToastContainerComponent}
 * subscribes to {@code WaToastService.toasts$} and renders one {@code <wa-toast-item>} per
 * notification. A plain {@code <wa-toast>} is not wired to the service, so every {@code show()}
 * call succeeds silently and nothing ever appears — the #1 cause of "toasts never show".
 * <p>
 * {@code max}, {@code duration} and {@code newestOnTop} are <strong>not</strong> attributes of the
 * native element or inputs of {@code WaToastContainerComponent}.
 * They are application-wide {@code ToastConfig} settings consumed by {@code WaToastService} and must be
 * configured either at bootstrap via {@code provideWaToasts(config)} or at runtime via
 * {@link WaToastDataService#methods() WaToastDataService.setConfig(partial)}. Rendering them as HTML
 * attributes here would have no effect, so they are intentionally omitted.
 * <p>
 * {@code --gap} (spacing between stacked items) and {@code --width} (stack width) are native CSS custom
 * properties and can be set via {@link #addStyle(String, String)}, e.g.
 * {@code addStyle("--gap", "var(--wa-space-l)")}. {@code closable} is handled by the native
 * {@code <wa-toast-item>} close button; {@code appearance} is not supported by the official component.
 */
@Getter
@NgImportReference(value = "WaToastContainerComponent", reference = "angular-awesome")
@NgImportModule(value = "WaToastContainerComponent")
public class WaToastContainer<J extends WaToastContainer<J>> extends DivSimple<J> implements SpaceTokenCapable<J>
{
    /**
     * Placement of the container on the screen. Supported values:
     * top-start, top-center, top-end, bottom-start, bottom-center, bottom-end
     */
    private String placement;

    @SuppressWarnings("unchecked")
    public J setPlacement(String placement)
    {
        this.placement = placement;
        return (J) this;
    }

    public WaToastContainer()
    {
        setTag("wa-toast-container");
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
}