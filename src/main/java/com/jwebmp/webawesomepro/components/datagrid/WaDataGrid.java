package com.jwebmp.webawesomepro.components.datagrid;

import com.google.common.base.Strings;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.webawesome.components.BorderTokenCapable;
import com.jwebmp.webawesome.components.Size;
import com.jwebmp.webawesome.components.SpaceTokenCapable;
import com.jwebmp.webawesome.components.TypographyTokenCapable;
import lombok.Getter;

/**
 * The {@code WaDataGrid} component renders the {@code <wa-data-grid>} element - a full featured
 * data table supporting sorting, filtering, selection, pagination, grouping, tree data, column
 * pin / reorder / resize and a server driven data source.
 * <p>
 * New in Web Awesome <strong>3.11.0</strong> (mirrors {@code WaDataGridDirective} from
 * {@code angular-awesome@3.11.0}).
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 *
 * <p><b>Reflected attributes vs property bindings</b></p>
 * Simple configuration is emitted as HTML attributes. Everything that is a JavaScript object,
 * array or function ({@code data}, {@code columns}, {@code sort}, {@code filters},
 * {@code selectedKeys}, {@code expandedKeys}, {@code dataSource}, {@code total}, {@code loading})
 * <strong>cannot</strong> be authored as an inline attribute - use the {@code bindXxx(...)}
 * helpers, which emit an Angular property binding against an {@code @NgField} on the host
 * component or against a data service.
 *
 * <p><b>Slots</b>: {@code empty}, {@code no-results}, {@code loading}</p>
 *
 * <p><b>Usage</b></p>
 * <pre>{@code
 * WaDataGrid<?> grid = new WaDataGrid<>()
 *         .setRowKey("id")
 *         .setSelectable(DataGridSelectable.Multiple)
 *         .setPaginate(true)
 *         .setPageSize(20)
 *         .setWithSearch(true)
 *         .bindColumns("columns")
 *         .bindData("rows")
 *         .setSortChangeEvent("onSortChange($event)");
 * }</pre>
 *
 * @see WaDataGridColumn
 * @see WaDataGridDataService
 */
@Getter
@NgImportReference(value = "WaDataGridDirective", reference = "angular-awesome")
@NgImportModule("WaDataGridDirective")
public class WaDataGrid<J extends WaDataGrid<J>> extends DivSimple<J>
        implements BorderTokenCapable<J>, SpaceTokenCapable<J>, TypographyTokenCapable<J>
{
    // ---------------------------------------------------------------------
    // Reflected attributes
    // ---------------------------------------------------------------------

    /**
     * The row property used as the unique row identifier.
     */
    private String rowKey;

    /**
     * The row selection mode.
     */
    private DataGridSelectable selectable;

    /**
     * The accessible label for the grid.
     */
    private String label;

    /**
     * The visual appearance of the grid.
     */
    private DataGridAppearance appearance;

    /**
     * The component size.
     */
    private Size size;

    /**
     * The number of rows rendered per page when pagination is active.
     */
    private Integer pageSize;

    /**
     * The maximum number of columns that may participate in a multi column sort.
     */
    private Integer maxMultiSort;

    /**
     * The debounce, in milliseconds, applied to filter input.
     */
    private Integer filterDebounce;

    /**
     * Enables the built in pagination control.
     */
    private Boolean paginate;

    /**
     * Prevents a sort from cycling back to "unsorted".
     */
    private Boolean withoutSortRemoval;

    /**
     * Starts the sort cycle in descending order.
     */
    private Boolean sortDescFirst;

    /**
     * Renders the global search field.
     */
    private Boolean withSearch;

    /**
     * Allows columns to be resized.
     */
    private Boolean resizable;

    /**
     * Allows columns to be reordered.
     */
    private Boolean reorderable;

    /**
     * Allows columns to be pinned.
     */
    private Boolean pinnable;

    /**
     * Renders the per column menu.
     */
    private Boolean withColumnMenu;

    /**
     * Renders the columns visibility menu.
     */
    private Boolean withColumnsMenu;

    /**
     * Renders alternating row backgrounds.
     */
    private Boolean striped;

    /**
     * Applies filters against leaf rows when using tree data.
     */
    private Boolean filterFromLeafRows;

    /**
     * Switches the grid into server driven mode - sorting, filtering and paging are delegated to
     * the bound {@code dataSource}.
     */
    private Boolean server;

    // ---------------------------------------------------------------------
    // CSS custom properties
    // ---------------------------------------------------------------------

    private String accentColor;
    private String maxHeight;
    private String rowHeight;
    private String headerRowHeight;
    private String cellPadding;
    private String headerBackground;
    private String stripeBackground;
    private String selectedBackground;
    private String indentSize;
    private String backgroundColor;
    private String textColor;
    private String borderColor;
    private String borderWidth;
    private String borderRadius;
    private String headerTextColor;
    private String rowHoverBackground;
    private String focusRing;
    private String transitionDuration;

    // ---------------------------------------------------------------------
    // Slots
    // ---------------------------------------------------------------------

    private IComponentHierarchyBase<?, ?> emptySlot;
    private IComponentHierarchyBase<?, ?> noResultsSlot;
    private IComponentHierarchyBase<?, ?> loadingSlot;

    // ---------------------------------------------------------------------
    // Events
    // ---------------------------------------------------------------------

    private String sortChangeEvent;
    private String rowSelectEvent;
    private String pageChangeEvent;
    private String filterChangeEvent;
    private String rowExpandEvent;
    private String rowCollapseEvent;
    private String dataRequestEvent;
    private String dataErrorEvent;
    private String columnMoveEvent;
    private String columnResizeEvent;
    private String columnVisibilityChangeEvent;
    private String columnPinEvent;
    private String cellClickEvent;
    private String cellContextmenuEvent;

    /**
     * Creates a new data grid rendering {@code <wa-data-grid>}.
     */
    public WaDataGrid()
    {
        setTag("wa-data-grid");
    }

    /**
     * Creates a new data grid with the given row key applied.
     *
     * @param rowKey The row property used as the unique row identifier
     */
    public WaDataGrid(String rowKey)
    {
        this();
        this.rowKey = rowKey;
    }

    // ---------------------------------------------------------------------
    // Attribute setters
    // ---------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    public J setRowKey(String rowKey)
    {
        this.rowKey = rowKey;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSelectable(DataGridSelectable selectable)
    {
        this.selectable = selectable;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLabel(String label)
    {
        this.label = label;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setAppearance(DataGridAppearance appearance)
    {
        this.appearance = appearance;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSize(Size size)
    {
        this.size = size;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMaxMultiSort(Integer maxMultiSort)
    {
        this.maxMultiSort = maxMultiSort;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFilterDebounce(Integer filterDebounce)
    {
        this.filterDebounce = filterDebounce;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPaginate(Boolean paginate)
    {
        this.paginate = paginate;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithoutSortRemoval(Boolean withoutSortRemoval)
    {
        this.withoutSortRemoval = withoutSortRemoval;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSortDescFirst(Boolean sortDescFirst)
    {
        this.sortDescFirst = sortDescFirst;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithSearch(Boolean withSearch)
    {
        this.withSearch = withSearch;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setResizable(Boolean resizable)
    {
        this.resizable = resizable;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setReorderable(Boolean reorderable)
    {
        this.reorderable = reorderable;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPinnable(Boolean pinnable)
    {
        this.pinnable = pinnable;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithColumnMenu(Boolean withColumnMenu)
    {
        this.withColumnMenu = withColumnMenu;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setWithColumnsMenu(Boolean withColumnsMenu)
    {
        this.withColumnsMenu = withColumnsMenu;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setStriped(Boolean striped)
    {
        this.striped = striped;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFilterFromLeafRows(Boolean filterFromLeafRows)
    {
        this.filterFromLeafRows = filterFromLeafRows;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setServer(Boolean server)
    {
        this.server = server;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // CSS custom property setters
    // ---------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    public J setAccentColor(String accentColor)
    {
        this.accentColor = accentColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setMaxHeight(String maxHeight)
    {
        this.maxHeight = maxHeight;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRowHeight(String rowHeight)
    {
        this.rowHeight = rowHeight;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHeaderRowHeight(String headerRowHeight)
    {
        this.headerRowHeight = headerRowHeight;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCellPadding(String cellPadding)
    {
        this.cellPadding = cellPadding;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHeaderBackground(String headerBackground)
    {
        this.headerBackground = headerBackground;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setStripeBackground(String stripeBackground)
    {
        this.stripeBackground = stripeBackground;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setSelectedBackground(String selectedBackground)
    {
        this.selectedBackground = selectedBackground;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setIndentSize(String indentSize)
    {
        this.indentSize = indentSize;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBackgroundColor(String backgroundColor)
    {
        this.backgroundColor = backgroundColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setTextColor(String textColor)
    {
        this.textColor = textColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBorderColor(String borderColor)
    {
        this.borderColor = borderColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBorderWidth(String borderWidth)
    {
        this.borderWidth = borderWidth;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setBorderRadius(String borderRadius)
    {
        this.borderRadius = borderRadius;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setHeaderTextColor(String headerTextColor)
    {
        this.headerTextColor = headerTextColor;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRowHoverBackground(String rowHoverBackground)
    {
        this.rowHoverBackground = rowHoverBackground;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFocusRing(String focusRing)
    {
        this.focusRing = focusRing;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setTransitionDuration(String transitionDuration)
    {
        this.transitionDuration = transitionDuration;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // Slot setters
    // ---------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    public J setEmptySlot(IComponentHierarchyBase<?, ?> emptySlot)
    {
        this.emptySlot = emptySlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setNoResultsSlot(IComponentHierarchyBase<?, ?> noResultsSlot)
    {
        this.noResultsSlot = noResultsSlot;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setLoadingSlot(IComponentHierarchyBase<?, ?> loadingSlot)
    {
        this.loadingSlot = loadingSlot;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // Event setters
    // ---------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    public J setSortChangeEvent(String sortChangeEvent)
    {
        this.sortChangeEvent = sortChangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRowSelectEvent(String rowSelectEvent)
    {
        this.rowSelectEvent = rowSelectEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setPageChangeEvent(String pageChangeEvent)
    {
        this.pageChangeEvent = pageChangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setFilterChangeEvent(String filterChangeEvent)
    {
        this.filterChangeEvent = filterChangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRowExpandEvent(String rowExpandEvent)
    {
        this.rowExpandEvent = rowExpandEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setRowCollapseEvent(String rowCollapseEvent)
    {
        this.rowCollapseEvent = rowCollapseEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDataRequestEvent(String dataRequestEvent)
    {
        this.dataRequestEvent = dataRequestEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setDataErrorEvent(String dataErrorEvent)
    {
        this.dataErrorEvent = dataErrorEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setColumnMoveEvent(String columnMoveEvent)
    {
        this.columnMoveEvent = columnMoveEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setColumnResizeEvent(String columnResizeEvent)
    {
        this.columnResizeEvent = columnResizeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setColumnVisibilityChangeEvent(String columnVisibilityChangeEvent)
    {
        this.columnVisibilityChangeEvent = columnVisibilityChangeEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setColumnPinEvent(String columnPinEvent)
    {
        this.columnPinEvent = columnPinEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCellClickEvent(String cellClickEvent)
    {
        this.cellClickEvent = cellClickEvent;
        return (J) this;
    }

    @SuppressWarnings("unchecked")
    public J setCellContextmenuEvent(String cellContextmenuEvent)
    {
        this.cellContextmenuEvent = cellContextmenuEvent;
        return (J) this;
    }

    // ---------------------------------------------------------------------
    // Angular property bindings (objects / arrays / functions)
    // ---------------------------------------------------------------------

    /**
     * Binds the row array to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindData(String expression)
    {
        addAttribute("[data]", expression);
        return (J) this;
    }

    /**
     * Binds the column definition array to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindColumns(String expression)
    {
        addAttribute("[columns]", expression);
        return (J) this;
    }

    /**
     * Binds the sort descriptor to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindSort(String expression)
    {
        addAttribute("[sort]", expression);
        return (J) this;
    }

    /**
     * Binds the selected row keys to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindSelectedKeys(String expression)
    {
        addAttribute("[selectedKeys]", expression);
        return (J) this;
    }

    /**
     * Binds the expanded row keys to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindExpandedKeys(String expression)
    {
        addAttribute("[expandedKeys]", expression);
        return (J) this;
    }

    /**
     * Binds the filter descriptor to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindFilters(String expression)
    {
        addAttribute("[filters]", expression);
        return (J) this;
    }

    /**
     * Binds the server mode data source function to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindDataSource(String expression)
    {
        addAttribute("[dataSource]", expression);
        return (J) this;
    }

    /**
     * Binds the total row count (server mode) to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindTotal(String expression)
    {
        addAttribute("[total]", expression);
        return (J) this;
    }

    /**
     * Binds the loading state to an Angular expression.
     *
     * @param expression The expression to bind to
     * @return This component
     */
    @SuppressWarnings("unchecked")
    public J bindLoading(String expression)
    {
        addAttribute("[loading]", expression);
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!isInitialized())
        {
            // ----- reflected attributes -----
            if (!Strings.isNullOrEmpty(rowKey))
            {
                addAttribute("row-key", rowKey);
            }
            if (selectable != null)
            {
                addAttribute("selectable", selectable.toString());
            }
            if (!Strings.isNullOrEmpty(label))
            {
                addAttribute("label", label);
            }
            if (appearance != null)
            {
                addAttribute("appearance", appearance.toString());
            }
            if (size != null)
            {
                addAttribute("size", size.toString());
            }
            if (pageSize != null)
            {
                addAttribute("page-size", pageSize.toString());
            }
            if (maxMultiSort != null)
            {
                addAttribute("max-multi-sort", maxMultiSort.toString());
            }
            if (filterDebounce != null)
            {
                addAttribute("filter-debounce", filterDebounce.toString());
            }

            // ----- booleans -----
            if (paginate != null && paginate)
            {
                addAttribute("paginate", "");
            }
            if (withoutSortRemoval != null && withoutSortRemoval)
            {
                addAttribute("without-sort-removal", "");
            }
            if (sortDescFirst != null && sortDescFirst)
            {
                addAttribute("sort-desc-first", "");
            }
            if (withSearch != null && withSearch)
            {
                addAttribute("with-search", "");
            }
            if (resizable != null && resizable)
            {
                addAttribute("resizable", "");
            }
            if (reorderable != null && reorderable)
            {
                addAttribute("reorderable", "");
            }
            if (pinnable != null && pinnable)
            {
                addAttribute("pinnable", "");
            }
            if (withColumnMenu != null && withColumnMenu)
            {
                addAttribute("with-column-menu", "");
            }
            if (withColumnsMenu != null && withColumnsMenu)
            {
                addAttribute("with-columns-menu", "");
            }
            if (striped != null && striped)
            {
                addAttribute("striped", "");
            }
            if (filterFromLeafRows != null && filterFromLeafRows)
            {
                addAttribute("filter-from-leaf-rows", "");
            }
            if (server != null && server)
            {
                addAttribute("server", "");
            }

            // ----- CSS custom properties -----
            if (!Strings.isNullOrEmpty(accentColor))
            {
                addStyle("--accent-color", accentColor);
            }
            if (!Strings.isNullOrEmpty(maxHeight))
            {
                addStyle("--max-height", maxHeight);
            }
            if (!Strings.isNullOrEmpty(rowHeight))
            {
                addStyle("--row-height", rowHeight);
            }
            if (!Strings.isNullOrEmpty(headerRowHeight))
            {
                addStyle("--header-row-height", headerRowHeight);
            }
            if (!Strings.isNullOrEmpty(cellPadding))
            {
                addStyle("--cell-padding", cellPadding);
            }
            if (!Strings.isNullOrEmpty(headerBackground))
            {
                addStyle("--header-background", headerBackground);
            }
            if (!Strings.isNullOrEmpty(stripeBackground))
            {
                addStyle("--stripe-background", stripeBackground);
            }
            if (!Strings.isNullOrEmpty(selectedBackground))
            {
                addStyle("--selected-background", selectedBackground);
            }
            if (!Strings.isNullOrEmpty(indentSize))
            {
                addStyle("--indent-size", indentSize);
            }
            if (!Strings.isNullOrEmpty(backgroundColor))
            {
                addStyle("--background-color", backgroundColor);
            }
            if (!Strings.isNullOrEmpty(textColor))
            {
                addStyle("--text-color", textColor);
            }
            if (!Strings.isNullOrEmpty(borderColor))
            {
                addStyle("--border-color", borderColor);
            }
            if (!Strings.isNullOrEmpty(borderWidth))
            {
                addStyle("--border-width", borderWidth);
            }
            if (!Strings.isNullOrEmpty(borderRadius))
            {
                addStyle("--border-radius", borderRadius);
            }
            if (!Strings.isNullOrEmpty(headerTextColor))
            {
                addStyle("--header-text-color", headerTextColor);
            }
            if (!Strings.isNullOrEmpty(rowHoverBackground))
            {
                addStyle("--row-hover-background", rowHoverBackground);
            }
            if (!Strings.isNullOrEmpty(focusRing))
            {
                addStyle("--focus-ring", focusRing);
            }
            if (!Strings.isNullOrEmpty(transitionDuration))
            {
                addStyle("--transition-duration", transitionDuration);
            }

            // ----- slots -----
            if (emptySlot != null)
            {
                emptySlot.asAttributeBase()
                         .addAttribute("slot", "empty");
                add(emptySlot);
            }
            if (noResultsSlot != null)
            {
                noResultsSlot.asAttributeBase()
                             .addAttribute("slot", "no-results");
                add(noResultsSlot);
            }
            if (loadingSlot != null)
            {
                loadingSlot.asAttributeBase()
                           .addAttribute("slot", "loading");
                add(loadingSlot);
            }

            // ----- events -----
            if (!Strings.isNullOrEmpty(sortChangeEvent))
            {
                addAttribute("(wa-sort-change)", sortChangeEvent);
            }
            if (!Strings.isNullOrEmpty(rowSelectEvent))
            {
                addAttribute("(wa-row-select)", rowSelectEvent);
            }
            if (!Strings.isNullOrEmpty(pageChangeEvent))
            {
                addAttribute("(wa-page-change)", pageChangeEvent);
            }
            if (!Strings.isNullOrEmpty(filterChangeEvent))
            {
                addAttribute("(wa-filter-change)", filterChangeEvent);
            }
            if (!Strings.isNullOrEmpty(rowExpandEvent))
            {
                addAttribute("(wa-row-expand)", rowExpandEvent);
            }
            if (!Strings.isNullOrEmpty(rowCollapseEvent))
            {
                addAttribute("(wa-row-collapse)", rowCollapseEvent);
            }
            if (!Strings.isNullOrEmpty(dataRequestEvent))
            {
                addAttribute("(wa-data-request)", dataRequestEvent);
            }
            if (!Strings.isNullOrEmpty(dataErrorEvent))
            {
                addAttribute("(wa-data-error)", dataErrorEvent);
            }
            if (!Strings.isNullOrEmpty(columnMoveEvent))
            {
                addAttribute("(wa-column-move)", columnMoveEvent);
            }
            if (!Strings.isNullOrEmpty(columnResizeEvent))
            {
                addAttribute("(wa-column-resize)", columnResizeEvent);
            }
            if (!Strings.isNullOrEmpty(columnVisibilityChangeEvent))
            {
                addAttribute("(wa-column-visibility-change)", columnVisibilityChangeEvent);
            }
            if (!Strings.isNullOrEmpty(columnPinEvent))
            {
                addAttribute("(wa-column-pin)", columnPinEvent);
            }
            if (!Strings.isNullOrEmpty(cellClickEvent))
            {
                addAttribute("(wa-cell-click)", cellClickEvent);
            }
            if (!Strings.isNullOrEmpty(cellContextmenuEvent))
            {
                addAttribute("(wa-cell-contextmenu)", cellContextmenuEvent);
            }
        }
        super.init();
    }
}

