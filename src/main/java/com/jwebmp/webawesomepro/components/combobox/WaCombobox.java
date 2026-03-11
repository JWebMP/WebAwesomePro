package com.jwebmp.webawesomepro.components.combobox;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * The WaCombobox component is a combination of a text input and a dropdown select that allows
 * users to type to filter and select from a list of options. It supports single and multiple selection,
 * labeling, hints, clearable state, and custom styling.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 * <p>
 * Attributes:
 * - {@code value}: The current selected value(s)
 * - {@code placeholder}: Placeholder text displayed when no option is selected
 * - {@code disabled}: Whether the combobox is disabled
 * - {@code clearable}: Whether to show a clear button
 * - {@code multiple}: Whether to allow multiple selections
 * - {@code size}: Component size (small, medium, large)
 * - {@code label}: Label text displayed above the combobox
 * - {@code hint}: Hint text displayed below the combobox
 * - {@code required}: Whether a value is required
 * - {@code form}: Form ID to associate with
 * <p>
 * Events:
 * - {@code wa-input}: Fires as the user types in the filter input
 * - {@code wa-change}: Fires when the selected value changes
 * - {@code wa-focus}: Fires when the combobox gains focus
 * - {@code wa-blur}: Fires when the combobox loses focus
 * - {@code wa-clear}: Fires when the clear button is clicked
 * - {@code wa-show}: Fires when the dropdown opens
 * - {@code wa-hide}: Fires when the dropdown closes
 * <p>
 * Slots:
 * - default: The combobox options (wa-option elements)
 * - label: Custom label content
 * - hint: Custom hint content
 * - start: Content before the input
 * - end: Content after the input
 * - clear-icon: Custom clear icon
 * <p>
 * Usage examples:
 * <pre>
 * WaCombobox combobox = new WaCombobox("Search items");
 * combobox.add(new WaSelectOption().setValue("item1").setText("Item 1"));
 * combobox.add(new WaSelectOption().setValue("item2").setText("Item 2"));
 *
 * // Multiple selection combobox
 * WaCombobox multi = new WaCombobox("Tags");
 * multi.setMultiple(true);
 * multi.setClearable(true);
 * </pre>
 */
@Getter
@Setter
@NgImportReference(value = "WaComboboxDirective", reference = "angular-awesome")
@NgImportModule("WaComboboxDirective")
public class WaCombobox<J extends WaCombobox<J>> extends DivSimple<J>
{
    private String value;
    private String placeholder;
    private Boolean disabled;
    private Boolean clearable;
    private Boolean multiple;
    private Size size;
    private String label;
    private String hint;
    private Boolean required;
    private String form;

    // Slots
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;
    private IComponentHierarchyBase<?, ?> clearIcon;

    // Event handlers
    private String inputEvent;
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;
    private String clearEvent;
    private String showEvent;
    private String hideEvent;

    /**
     * Creates a new WaCombobox component
     */
    public WaCombobox()
    {
        setTag("wa-combobox");
    }

    /**
     * Creates a new WaCombobox component with the specified label
     *
     * @param label The label text
     */
    public WaCombobox(String label)
    {
        this();
        this.label = label;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (placeholder != null)
            {
                addAttribute("placeholder", placeholder);
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (clearable != null && clearable)
            {
                addAttribute("clearable", "");
            }
            if (multiple != null && multiple)
            {
                addAttribute("multiple", "");
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
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
            if (form != null)
            {
                addAttribute("form", form);
            }
            if (start != null)
            {
                start.asAttributeBase().addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase().addAttribute("slot", "end");
                add(end);
            }
            if (clearIcon != null)
            {
                clearIcon.asAttributeBase().addAttribute("slot", "clear-icon");
                add(clearIcon);
            }

            // Event handlers
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("(wa-input)", inputEvent);
            }
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
            if (!Strings.isNullOrEmpty(clearEvent))
            {
                addAttribute("(wa-clear)", clearEvent);
            }
            if (!Strings.isNullOrEmpty(showEvent))
            {
                addAttribute("(wa-show)", showEvent);
            }
            if (!Strings.isNullOrEmpty(hideEvent))
            {
                addAttribute("(wa-hide)", hideEvent);
            }
        }
        super.init();
    }
}

