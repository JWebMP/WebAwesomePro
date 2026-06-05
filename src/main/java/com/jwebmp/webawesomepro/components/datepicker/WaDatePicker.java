package com.jwebmp.webawesomepro.components.datepicker;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.FocusTokenCapable;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import lombok.Getter;

/**
 * A Web Awesome {@code <wa-date-picker>} inline calendar / form control.
 * <p>
 * Events: {@code input}, {@code change}, {@code wa-focus-day} ({@code detail: { date }}),
 * {@code wa-view-change} ({@code detail: { view, date }}).
 * <p>
 * Slots: {@code previous-icon}, {@code next-icon}, {@code header}, {@code footer}, and dynamic {@code day-YYYY-MM-DD}.
 */
@Getter
@NgImportReference(value = "WaDatePickerDirective", reference = "angular-awesome")
@NgImportModule("WaDatePickerDirective")
public class WaDatePicker<J extends WaDatePicker<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, FocusTokenCapable<J>
{
    /**
     * Selection mode ({@code single} or {@code range}).
     */
    private DatePickerMode mode;

    /**
     * The control value.
     */
    private String value;

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
     * The currently focused date (ISO {@code YYYY-MM-DD}).
     */
    private String focusedDate;

    /**
     * The visible calendar view.
     */
    private DatePickerView view;

    /**
     * The number of calendar months to show ({@code 1} or {@code 2}).
     */
    private Integer months;

    /**
     * Pagination behaviour.
     */
    private DatePickerPageBy pageBy;

    /**
     * The first day of the week (0 = Sunday).
     */
    private String firstDayOfWeek;

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
    private DatePickerWeekdayFormat weekdayFormat;

    /**
     * Whether the control is disabled.
     */
    private Boolean disabled;

    /**
     * Whether the control is read-only.
     */
    private Boolean readonly;

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
     * The control size.
     */
    private DatePickerSize size;

    /**
     * The locale used to format dates.
     */
    private String locale;

    // Slots
    private IComponentHierarchyBase<?, ?> previousIcon;
    private IComponentHierarchyBase<?, ?> nextIcon;
    private IComponentHierarchyBase<?, ?> header;
    private IComponentHierarchyBase<?, ?> footer;

    // Events
    private String inputEvent;
    private String changeEvent;
    private String focusDayEvent;
    private String viewChangeEvent;

    /**
     * Creates a new WaDatePicker component.
     */
    public WaDatePicker()
    {
        setTag("wa-date-picker");
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMode(DatePickerMode mode)
    {
        this.mode = mode;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setValue(String value)
    {
        this.value = value;
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
    public @org.jspecify.annotations.NonNull J setFocusedDate(String focusedDate)
    {
        this.focusedDate = focusedDate;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setView(DatePickerView view)
    {
        this.view = view;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setMonths(Integer months)
    {
        this.months = months;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setPageBy(DatePickerPageBy pageBy)
    {
        this.pageBy = pageBy;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFirstDayOfWeek(String firstDayOfWeek)
    {
        this.firstDayOfWeek = firstDayOfWeek;
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
    public @org.jspecify.annotations.NonNull J setWeekdayFormat(DatePickerWeekdayFormat weekdayFormat)
    {
        this.weekdayFormat = weekdayFormat;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setReadonly(Boolean readonly)
    {
        this.readonly = readonly;
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
    public @org.jspecify.annotations.NonNull J setSize(DatePickerSize size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setLocale(String locale)
    {
        this.locale = locale;
        return (J) this;
    }

    // Slots
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

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setHeader(IComponentHierarchyBase<?, ?> header)
    {
        this.header = header;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setFooter(IComponentHierarchyBase<?, ?> footer)
    {
        this.footer = footer;
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

    // Events
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
    public @org.jspecify.annotations.NonNull J setFocusDayEvent(String focusDayEvent)
    {
        this.focusDayEvent = focusDayEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public @org.jspecify.annotations.NonNull J setViewChangeEvent(String viewChangeEvent)
    {
        this.viewChangeEvent = viewChangeEvent;
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
     * Navigates the calendar to the given date. Implemented client-side; provided here for fluent chaining.
     *
     * @param date The ISO date to navigate to
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J goToDate(String date)
    {
        return (J) this;
    }

    /**
     * Navigates the calendar to today. Implemented client-side; provided here for fluent chaining.
     *
     * @return This object for method chaining
     */
    @SuppressWarnings("unchecked")
    public J goToToday()
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
    @SuppressWarnings("unchecked")
    public J bind(String variableName)
    {
        return addAttribute("[(ngModel)]", variableName);
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            if (mode != null)
            {
                addAttribute("mode", mode.toString());
            }
            if (value != null)
            {
                addAttribute("value", value);
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
            if (focusedDate != null)
            {
                addAttribute("focused-date", focusedDate);
            }
            if (view != null)
            {
                addAttribute("view", view.toString());
            }
            if (months != null)
            {
                addAttribute("months", months.toString());
            }
            if (pageBy != null)
            {
                addAttribute("page-by", pageBy.toString());
            }
            if (firstDayOfWeek != null)
            {
                addAttribute("first-day-of-week", firstDayOfWeek);
            }
            if (weekdayFormat != null)
            {
                addAttribute("weekday-format", weekdayFormat.toString());
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
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (locale != null)
            {
                addAttribute("locale", locale);
            }

            // Boolean attributes
            if (withOutsideDays != null && withOutsideDays)
            {
                addAttribute("with-outside-days", "");
            }
            if (withWeekNumbers != null && withWeekNumbers)
            {
                addAttribute("with-week-numbers", "");
            }
            if (disabled != null && disabled)
            {
                addAttribute("disabled", "");
            }
            if (readonly != null && readonly)
            {
                addAttribute("readonly", "");
            }
            if (disablePast != null && disablePast)
            {
                addAttribute("disable-past", "");
            }
            if (disableFuture != null && disableFuture)
            {
                addAttribute("disable-future", "");
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
            if (!Strings.isNullOrEmpty(focusDayEvent))
            {
                addAttribute("wa-focus-day", focusDayEvent);
            }
            if (!Strings.isNullOrEmpty(viewChangeEvent))
            {
                addAttribute("wa-view-change", viewChangeEvent);
            }

            // Slots
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
            if (header != null)
            {
                header.asAttributeBase()
                      .addAttribute("slot", "header");
                add(header);
            }
            if (footer != null)
            {
                footer.asAttributeBase()
                      .addAttribute("slot", "footer");
                add(footer);
            }
        }
        super.init();
    }
}

