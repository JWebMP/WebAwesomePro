package com.jwebmp.webawesomepro.components.fileinput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaFileInput component provides a file upload input control.
 * It supports single and multiple file selection, accepted file types, and integrates
 * with Angular forms via ControlValueAccessor (value type: FileList).
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.1
 * <p>
 * Attributes:
 * - {@code accept}: Comma-separated list of accepted file types (e.g., "image/*,.pdf")
 * - {@code multiple}: Whether to allow multiple file selection
 * - {@code disabled}: Whether the input is disabled
 * - {@code label}: Label text displayed above the input
 * - {@code hint}: Hint text displayed below the input
 * - {@code required}: Whether a file is required
 * - {@code size}: Component size (small, medium, large)
 * - {@code form}: Form ID to associate with
 * <p>
 * Events:
 * - {@code wa-change}: Fires when files are selected
 * - {@code wa-focus}: Fires when the input gains focus
 * - {@code wa-blur}: Fires when the input loses focus
 * <p>
 * Slots:
 * - label: Custom label content
 * - hint: Custom hint content
 * - button: Custom trigger button
 * <p>
 * Usage examples:
 * <pre>
 * WaFileInput fileInput = new WaFileInput();
 * fileInput.setAccept("image/*,.pdf");
 * fileInput.setMultiple(true);
 *
 * WaFileInput singleFile = new WaFileInput();
 * singleFile.setLabel("Upload document");
 * singleFile.setAccept(".doc,.docx,.pdf");
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaFileInputDirective", reference = "angular-awesome")
@NgImportModule("WaFileInputDirective")
public class WaFileInput<J extends WaFileInput<J>> extends DivSimple<J>
{
    private String accept;
    private Boolean multiple;
    private Boolean disabled;
    private String label;
    private String hint;
    private Boolean required;
    private Size size;
    private String form;

    // Slots
    private IComponentHierarchyBase<?, ?> button;

    // Event handlers
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;

    /**
     * Creates a new WaFileInput component
     */
    public WaFileInput()
    {
        setTag("wa-file-input");
    }

    /**
     * Creates a new WaFileInput component with the specified label
     *
     * @param label The label text
     */
    public WaFileInput(String label)
    {
        this();
        this.label = label;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (accept != null)
            {
                addAttribute("accept", accept);
            }
            if (multiple != null && multiple)
            {
                addAttribute("multiple", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (form != null)
            {
                addAttribute("form", form);
            }
            if (button != null)
            {
                button.asAttributeBase().addAttribute("slot", "button");
                add(button);
            }

            // Event handlers
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("(wa-change)", changeEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("(wa-focus)", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("(wa-blur)", blurEvent);
            }
        }
        super.init();
    }
}

