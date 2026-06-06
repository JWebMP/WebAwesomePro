package com.jwebmp.webawesomepro.components.dateinput;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-date-input>} form control combining a text field with a pop-up calendar.
 * <p>
 * Values are exchanged in ISO format ({@code YYYY-MM-DD}, or {@code YYYY-MM-DD/YYYY-MM-DD} in range mode).
 * <p>
 * Events: {@code input}, {@code change}, {@code focus}, {@code blur}, {@code wa-clear}, {@code wa-show},
 * {@code wa-after-show}, {@code wa-hide}, {@code wa-after-hide}, {@code wa-invalid}.
 * <p>
 * Slots: {@code label}, {@code hint}, {@code start}, {@code end}, {@code clear-icon}, {@code expand-icon},
 * {@code footer}, {@code previous-icon}, {@code next-icon}, and dynamic {@code day-YYYY-MM-DD}.
 * <p>
 * CSS Custom Properties: {@code --show-duration}, {@code --hide-duration}.
 */
@Getter
@NgImportReference(value = "WaDateInputDirective", reference = "angular-awesome")
@NgImportModule("WaDateInputDirective")
public class WaDateInput<J extends WaDateInput<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>, TypographyTokenCapable<J>
{
    /**
     * The control value. ISO {@code YYYY-MM-DD}, or {@code YYYY-MM-DD/YYYY-MM-DD} in range mode.
     */
    private String value;

    /**
     * Whether the control is disabled.
     */
    private Boolean disabled;

    /**
     * Whether the control is required.
     */
    private Boolean required;

    /**
     * Whether the control is read-only.
     */
    private Boolean readonly;

    /**
     * The control size.
     */
    private DateInputSize size;

    /**
     * The control appearance.
     */
    private DateInputAppearance appearance;

    /**
     * Whether to render pill-shaped corners.
     */
    private Boolean pill;

    /**
     * The label text.
     */
    private String label;

    /**
     * The hint text displayed below the control.
     */
    private String hint;

    /**
     * The autocomplete behaviour.
     */
    private String autocomplete;

    /**
     * Whether to show a clear button.
     */
    private Boolean withClear;

    /**
     * SSR flag to indicate the label slot is present on initial paint.
     */
    private Boolean withLabel;

    /**
     * SSR flag to indicate the hint slot is present on initial paint.
     */
    private Boolean withHint;

    /**
     * Selection mode ({@code single} or {@code range}).
     */
    private DateInputMode mode;

    /**
     * The earliest selectable date (ISO {@code YYYY-MM-DD}).
     */
    private String min;

    /**
     * The latest selectable date (ISO {@code YYYY-MM-DD}).
     */
    private String max;

    /**
     * Overrides the value treated as "today" (ISO {@code YYYY-MM-DD}).
     */
    private String today;

    /**
     * The first day of the week (0 = Sunday).
     */
    private String firstDayOfWeek;

    /**
     * Dates to disable, as a space-separated list of ISO dates.
     */
    private String disabledDates;

    /**
     * Days of the week to disable, as a space-separated list (0 = Sunday).
     */
    private String disabledDaysOfWeek;

    /**
     * Whether to disable all dates in the past.
     */
    private Boolean disablePast;

    /**
     * Whether to disable all dates in the future.
     */
    private Boolean disableFuture;

    /**
     * The minimum range length, in days (range mode).
     */
    private String minRange;

    /**
     * The maximum range length, in days (range mode).
     */
    private String maxRange;

    /**
     * The number of calendar months to show ({@code 1} or {@code 2}).
     */
    private Integer months;

    /**
     * Pagination behaviour ({@code months} or {@code single}).
     */
    private PageBy pageBy;

    /**
     * Whether to show days from adjacent months.
     */
    private Boolean withOutsideDays;

    /**
     * Whether to show week numbers.
     */
    private Boolean withWeekNumbers;

    /**
     * The weekday label format.
     */
    private WeekdayFormat weekdayFormat;

    /**
     * Whether the calendar is open.
     */
    private Boolean open;

    /**
     * The preferred placement of the calendar.
     */
    private String placement;

    /**
     * The distance, in pixels, between the control and the calendar.
     */
    private String distance;

    /**
     * The {@code --show-duration} CSS custom property.
     */
    private String showDuration;

    /**
     * The {@code --hide-duration} CSS custom property.
     */
    private String hideDuration;

    // Slots
    private IComponentHierarchyBase<?, ?> labelSlot;
    private IComponentHierarchyBase<?, ?> hintSlot;
    private IComponentHierarchyBase<?, ?> start;
    private IComponentHierarchyBase<?, ?> end;
    private IComponentHierarchyBase<?, ?> clearIcon;
    private IComponentHierarchyBase<?, ?> expandIcon;
    private IComponentHierarchyBase<?, ?> footer;
    private IComponentHierarchyBase<?, ?> previousIcon;
    private IComponentHierarchyBase<?, ?> nextIcon;

    // Events
    private String inputEvent;
    private String changeEvent;
    private String focusEvent;
    private String blurEvent;
    private String clearEvent;
    private String showEvent;
    private String afterShowEvent;
    private String hideEvent;
    private String afterHideEvent;
    private String invalidEvent;

    /**
     * Creates a new WaDateInput component.
     */
    public WaDateInput()
    {
        setTag("wa-date-input");
    }

    /**
     * Creates a new WaDateInput with the specified label.
     *
     * @param label The label text
     */
    public WaDateInput(String label)
    {
        this();
        this.label = label;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setValue(String value)
    {
        this.value = value;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setRequired(Boolean required)
    {
        this.required = required;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setSize(DateInputSize size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAppearance(DateInputAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPill(Boolean pill)
    {
        this.pill = pill;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHint(String hint)
    {
        this.hint = hint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAutocomplete(String autocomplete)
    {
        this.autocomplete = autocomplete;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithClear(Boolean withClear)
    {
        this.withClear = withClear;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithLabel(Boolean withLabel)
    {
        this.withLabel = withLabel;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithHint(Boolean withHint)
    {
        this.withHint = withHint;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMode(DateInputMode mode)
    {
        this.mode = mode;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMin(String min)
    {
        this.min = min;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMax(String max)
    {
        this.max = max;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setToday(String today)
    {
        this.today = today;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFirstDayOfWeek(String firstDayOfWeek)
    {
        this.firstDayOfWeek = firstDayOfWeek;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabledDates(String disabledDates)
    {
        this.disabledDates = disabledDates;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabledDaysOfWeek(String disabledDaysOfWeek)
    {
        this.disabledDaysOfWeek = disabledDaysOfWeek;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisablePast(Boolean disablePast)
    {
        this.disablePast = disablePast;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisableFuture(Boolean disableFuture)
    {
        this.disableFuture = disableFuture;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMinRange(String minRange)
    {
        this.minRange = minRange;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMaxRange(String maxRange)
    {
        this.maxRange = maxRange;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMonths(Integer months)
    {
        this.months = months;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPageBy(PageBy pageBy)
    {
        this.pageBy = pageBy;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithOutsideDays(Boolean withOutsideDays)
    {
        this.withOutsideDays = withOutsideDays;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWithWeekNumbers(Boolean withWeekNumbers)
    {
        this.withWeekNumbers = withWeekNumbers;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setWeekdayFormat(WeekdayFormat weekdayFormat)
    {
        this.weekdayFormat = weekdayFormat;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setOpen(Boolean open)
    {
        this.open = open;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPlacement(String placement)
    {
        this.placement = placement;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDistance(String distance)
    {
        this.distance = distance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setShowDuration(String showDuration)
    {
        this.showDuration = showDuration;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHideDuration(String hideDuration)
    {
        this.hideDuration = hideDuration;
        return (J) this;
    }

    // Slot setters
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLabelSlot(IComponentHierarchyBase<?, ?> labelSlot)
    {
        this.labelSlot = labelSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHintSlot(IComponentHierarchyBase<?, ?> hintSlot)
    {
        this.hintSlot = hintSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setStart(IComponentHierarchyBase<?, ?> start)
    {
        this.start = start;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setEnd(IComponentHierarchyBase<?, ?> end)
    {
        this.end = end;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setClearIcon(IComponentHierarchyBase<?, ?> clearIcon)
    {
        this.clearIcon = clearIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setExpandIcon(IComponentHierarchyBase<?, ?> expandIcon)
    {
        this.expandIcon = expandIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFooter(IComponentHierarchyBase<?, ?> footer)
    {
        this.footer = footer;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPreviousIcon(IComponentHierarchyBase<?, ?> previousIcon)
    {
        this.previousIcon = previousIcon;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setNextIcon(IComponentHierarchyBase<?, ?> nextIcon)
    {
        this.nextIcon = nextIcon;
        return (J) this;
    }

    /**
     * Adds a component bound to the dynamic {@code day-YYYY-MM-DD} slot for the given ISO date.
     *
     * @param isoDate   The ISO date ({@code YYYY-MM-DD})
     * @param component The component to render in the day slot
     * @return This component for chaining
     */
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J addDaySlot(String isoDate, IComponentHierarchyBase<?, ?> component)
    {
        component.asAttributeBase()
                 .addAttribute("slot", "day-" + isoDate);
        add(component);
        return (J) this;
    }

    // Event setters
    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setInputEvent(String inputEvent)
    {
        this.inputEvent = inputEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setChangeEvent(String changeEvent)
    {
        this.changeEvent = changeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFocusEvent(String focusEvent)
    {
        this.focusEvent = focusEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setBlurEvent(String blurEvent)
    {
        this.blurEvent = blurEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setClearEvent(String clearEvent)
    {
        this.clearEvent = clearEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setShowEvent(String showEvent)
    {
        this.showEvent = showEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterShowEvent(String afterShowEvent)
    {
        this.afterShowEvent = afterShowEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHideEvent(String hideEvent)
    {
        this.hideEvent = hideEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setAfterHideEvent(String afterHideEvent)
    {
        this.afterHideEvent = afterHideEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setInvalidEvent(String invalidEvent)
    {
        this.invalidEvent = invalidEvent;
        return (J) this;
    }

    /**
     * Sets focus on the control. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J focus()
    {
        return (J) this;
    }

    /**
     * Removes focus from the control. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J blur()
    {
        return (J) this;
    }

    /**
     * Shows the calendar. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J show()
    {
        return (J) this;
    }

    /**
     * Hides the calendar. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J hide()
    {
        return (J) this;
    }

    /**
     * Clears the control. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J clear()
    {
        return (J) this;
    }

    @Override
    public J bind(String variableName)
    {
        return addAttribute("[(ngModel)]", variableName);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (getName() != null && !getName().isEmpty())
            {
                String defaultName = getClass().getName().replace('.', '_');
                if (!getName().equals(defaultName))
                {
                    addAttribute("name", getName());
                }
            }
            if (value != null)
            {
                addAttribute("value", value);
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (label != null)
            {
                addAttribute("label", label);
            }
            if (hint != null)
            {
                addAttribute("hint", hint);
            }
            if (autocomplete != null)
            {
                addAttribute("autocomplete", autocomplete);
            }
            if (mode != null)
            {
                addAttribute("mode", mode.toString());
            }
            if (min != null)
            {
                addAttribute("min", min);
            }
            if (max != null)
            {
                addAttribute("max", max);
            }
            if (today != null)
            {
                addAttribute("today", today);
            }
            if (firstDayOfWeek != null)
            {
                addAttribute("first-day-of-week", firstDayOfWeek);
            }
            if (disabledDates != null)
            {
                addAttribute("disabled-dates", disabledDates);
            }
            if (disabledDaysOfWeek != null)
            {
                addAttribute("disabled-days-of-week", disabledDaysOfWeek);
            }
            if (minRange != null)
            {
                addAttribute("min-range", minRange);
            }
            if (maxRange != null)
            {
                addAttribute("max-range", maxRange);
            }
            if (months != null)
            {
                addAttribute("months", months.toString());
            }
            if (pageBy != null)
            {
                addAttribute("page-by", pageBy.toString());
            }
            if (weekdayFormat != null)
            {
                addAttribute("weekday-format", weekdayFormat.toString());
            }
            if (placement != null)
            {
                addAttribute("placement", placement);
            }
            if (distance != null)
            {
                addAttribute("distance", distance);
            }

            // Boolean attributes
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (required != null && required)
            {
                addAttribute("required", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (pill != null && pill)
            {
                addAttribute("pill", "");
            }
            if (withClear != null && withClear)
            {
                addAttribute("with-clear", "");
            }
            if (withLabel != null && withLabel)
            {
                addAttribute("with-label", "");
            }
            if (withHint != null && withHint)
            {
                addAttribute("with-hint", "");
            }
            if (disablePast != null && disablePast)
            {
                addAttribute("disable-past", "");
            }
            if (disableFuture != null && disableFuture)
            {
                addAttribute("disable-future", "");
            }
            if (withOutsideDays != null && withOutsideDays)
            {
                addAttribute("with-outside-days", "");
            }
            if (withWeekNumbers != null && withWeekNumbers)
            {
                addAttribute("with-week-numbers", "");
            }
            if (open != null && open)
            {
                addAttribute("open", "");
            }

            // CSS custom properties
            if (!Strings.isNullOrEmpty(showDuration))
            {
                addStyle("--show-duration", showDuration);
            }
            if (!Strings.isNullOrEmpty(hideDuration))
            {
                addStyle("--hide-duration", hideDuration);
            }

            // Events
            if (!Strings.isNullOrEmpty(inputEvent))
            {
                addAttribute("input", inputEvent);
            }
            if (!Strings.isNullOrEmpty(changeEvent))
            {
                addAttribute("change", changeEvent);
            }
            if (!Strings.isNullOrEmpty(focusEvent))
            {
                addAttribute("focus", focusEvent);
            }
            if (!Strings.isNullOrEmpty(blurEvent))
            {
                addAttribute("blur", blurEvent);
            }
            if (!Strings.isNullOrEmpty(clearEvent))
            {
                addAttribute("wa-clear", clearEvent);
            }
            if (!Strings.isNullOrEmpty(showEvent))
            {
                addAttribute("wa-show", showEvent);
            }
            if (!Strings.isNullOrEmpty(afterShowEvent))
            {
                addAttribute("wa-after-show", afterShowEvent);
            }
            if (!Strings.isNullOrEmpty(hideEvent))
            {
                addAttribute("wa-hide", hideEvent);
            }
            if (!Strings.isNullOrEmpty(afterHideEvent))
            {
                addAttribute("wa-after-hide", afterHideEvent);
            }
            if (!Strings.isNullOrEmpty(invalidEvent))
            {
                addAttribute("wa-invalid", invalidEvent);
            }

            // Slots
            if (labelSlot != null)
            {
                labelSlot.asAttributeBase()
                         .addAttribute("slot", "label");
                add(labelSlot);
            }
            if (hintSlot != null)
            {
                hintSlot.asAttributeBase()
                        .addAttribute("slot", "hint");
                add(hintSlot);
            }
            if (start != null)
            {
                start.asAttributeBase()
                     .addAttribute("slot", "start");
                add(start);
            }
            if (end != null)
            {
                end.asAttributeBase()
                   .addAttribute("slot", "end");
                add(end);
            }
            if (clearIcon != null)
            {
                clearIcon.asAttributeBase()
                         .addAttribute("slot", "clear-icon");
                add(clearIcon);
            }
            if (expandIcon != null)
            {
                expandIcon.asAttributeBase()
                          .addAttribute("slot", "expand-icon");
                add(expandIcon);
            }
            if (footer != null)
            {
                footer.asAttributeBase()
                      .addAttribute("slot", "footer");
                add(footer);
            }
            if (previousIcon != null)
            {
                previousIcon.asAttributeBase()
                            .addAttribute("slot", "previous-icon");
                add(previousIcon);
            }
            if (nextIcon != null)
            {
                nextIcon.asAttributeBase()
                        .addAttribute("slot", "next-icon");
                add(nextIcon);
            }
        }
        super.init();
    }
}

