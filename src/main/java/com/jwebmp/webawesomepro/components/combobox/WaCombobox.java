package com.jwebmp.webawesomepro.components.combobox;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.Size;
import lombok.Getter;
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
     * The current input text value.
     */
    private String inputValue;

    /**
     * Whether the dropdown is open.
     */
    private Boolean open;

    /**
     * Whether to allow creating new options by typing.
     */
    private Boolean allowCreate;

    /**
     * Controls text auto-capitalization behavior.
     */
    private AutoCapitalize autocapitalize;

    /**
     * Controls autocorrect behavior (on, off).
     */
    private String autocorrect;

    /**
     * Controls virtual keyboard type on mobile.
     */
    private InputMode inputmode;

    /**
     * Controls the enter key label on the virtual keyboard.
     */
    private EnterKeyHint enterkeyhint;

    /**
     * Whether spellcheck is enabled for the input.
     */
    private Boolean spellcheck;

    /**
     * Event handler for when a new option is created via allowCreate.
     */
    private String createEvent;

    /**
     * Creates a new WaCombobox component
     */

    @SuppressWarnings("unchecked")
    public J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPlaceholder(String placeholder)
    {
        this.placeholder = placeholder;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setClearable(Boolean clearable)
    {
        this.clearable = clearable;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMultiple(Boolean multiple)
    {
        this.multiple = multiple;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setForm(String form)
    {
        this.form = form;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setStart(IComponentHierarchyBase<?, ?> start)
    {
        this.start = start;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setEnd(IComponentHierarchyBase<?, ?> end)
    {
        this.end = end;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setClearIcon(IComponentHierarchyBase<?, ?> clearIcon)
    {
        this.clearIcon = clearIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setInputEvent(String inputEvent)
    {
        this.inputEvent = inputEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setChangeEvent(String changeEvent)
    {
        this.changeEvent = changeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setClearEvent(String clearEvent)
    {
        this.clearEvent = clearEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setShowEvent(String showEvent)
    {
        this.showEvent = showEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHideEvent(String hideEvent)
    {
        this.hideEvent = hideEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setInputValue(String inputValue)
    {
        this.inputValue = inputValue;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setOpen(Boolean open)
    {
        this.open = open;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAllowCreate(Boolean allowCreate)
    {
        this.allowCreate = allowCreate;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutocapitalize(AutoCapitalize autocapitalize)
    {
        this.autocapitalize = autocapitalize;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAutocorrect(String autocorrect)
    {
        this.autocorrect = autocorrect;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setInputmode(InputMode inputmode)
    {
        this.inputmode = inputmode;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setEnterkeyhint(EnterKeyHint enterkeyhint)
    {
        this.enterkeyhint = enterkeyhint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSpellcheck(Boolean spellcheck)
    {
        this.spellcheck = spellcheck;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCreateEvent(String createEvent)
    {
        this.createEvent = createEvent;
        return (J) this;
    }
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
            if (!Strings.isNullOrEmpty(createEvent))
            {
                addAttribute("(wa-create)", createEvent);
            }

            // New 3.4.1 attributes
            if (!Strings.isNullOrEmpty(inputValue))
            {
                addAttribute("input-value", inputValue);
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }
            if (allowCreate != null && allowCreate)
            {
                addAttribute("allow-create", "");
            }
            if (autocapitalize != null)
            {
                addAttribute("autocapitalize", autocapitalize.toString());
            }
            if (!Strings.isNullOrEmpty(autocorrect))
            {
                addAttribute("autocorrect", autocorrect);
            }
            if (inputmode != null)
            {
                addAttribute("inputmode", inputmode.toString());
            }
            if (enterkeyhint != null)
            {
                addAttribute("enterkeyhint", enterkeyhint.toString());
            }
            if (spellcheck != null && spellcheck)
            {
                addAttribute("spellcheck", "");
            }
        }
        super.init();
    }
}

