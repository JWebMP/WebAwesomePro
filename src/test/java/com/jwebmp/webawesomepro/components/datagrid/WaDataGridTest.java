package com.jwebmp.webawesomepro.components.datagrid;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.webawesome.components.Size;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaDataGridTest
{
    @Test
    void rendersBasicDataGridTag()
    {
        var s = new WaDataGrid<>().toString(true);
        System.out.println(s);

        assertTrue(s.contains("<wa-data-grid"), "Should render wa-data-grid tag");
        assertTrue(s.contains("</wa-data-grid>"), "Should have a closing tag");
    }

    @Test
    void rendersReflectedAttributes()
    {
        var s = new WaDataGrid<>("id")
                .setSelectable(DataGridSelectable.Multiple)
                .setLabel("Orders")
                .setAppearance(DataGridAppearance.Outlined)
                .setSize(Size.Small)
                .setPageSize(20)
                .setMaxMultiSort(3)
                .setFilterDebounce(250)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("row-key=\"id\""), "Row key expected");
        assertTrue(s.contains("selectable=\"multiple\""), "Selectable expected");
        assertTrue(s.contains("label=\"Orders\""), "Label expected");
        assertTrue(s.contains("appearance=\"outlined\""), "Appearance expected");
        assertTrue(s.contains("size=\"small\""), "Size expected");
        assertTrue(s.contains("page-size=\"20\""), "Page size expected");
        assertTrue(s.contains("max-multi-sort=\"3\""), "Max multi sort expected");
        assertTrue(s.contains("filter-debounce=\"250\""), "Filter debounce expected");
    }

    @Test
    void rendersBooleanAttributes()
    {
        var s = new WaDataGrid<>()
                .setPaginate(true)
                .setWithoutSortRemoval(true)
                .setSortDescFirst(true)
                .setWithSearch(true)
                .setResizable(true)
                .setReorderable(true)
                .setPinnable(true)
                .setWithColumnMenu(true)
                .setWithColumnsMenu(true)
                .setStriped(true)
                .setFilterFromLeafRows(true)
                .setServer(true)
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("paginate"), "paginate expected");
        assertTrue(s.contains("without-sort-removal"), "without-sort-removal expected");
        assertTrue(s.contains("sort-desc-first"), "sort-desc-first expected");
        assertTrue(s.contains("with-search"), "with-search expected");
        assertTrue(s.contains("resizable"), "resizable expected");
        assertTrue(s.contains("reorderable"), "reorderable expected");
        assertTrue(s.contains("pinnable"), "pinnable expected");
        assertTrue(s.contains("with-column-menu"), "with-column-menu expected");
        assertTrue(s.contains("with-columns-menu"), "with-columns-menu expected");
        assertTrue(s.contains("striped"), "striped expected");
        assertTrue(s.contains("filter-from-leaf-rows"), "filter-from-leaf-rows expected");
        assertTrue(s.contains("server"), "server expected");
    }

    @Test
    void omitsFalseBooleans()
    {
        var s = new WaDataGrid<>()
                .setPaginate(false)
                .setStriped(false)
                .setServer(false)
                .toString(true);
        System.out.println(s);

        assertFalse(s.contains("paginate"), "paginate should not render when false");
        assertFalse(s.contains("striped"), "striped should not render when false");
        assertFalse(s.contains("server"), "server should not render when false");
    }

    @Test
    void rendersPropertyBindings()
    {
        var s = new WaDataGrid<>()
                .bindData("rows")
                .bindColumns("columns")
                .bindSort("sort")
                .bindSelectedKeys("selectedKeys")
                .bindExpandedKeys("expandedKeys")
                .bindFilters("filters")
                .bindDataSource("dataService.dataSource")
                .bindTotal("total")
                .bindLoading("loading")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("[data]=\"rows\""), "Data binding expected");
        assertTrue(s.contains("[columns]=\"columns\""), "Columns binding expected");
        assertTrue(s.contains("[sort]=\"sort\""), "Sort binding expected");
        assertTrue(s.contains("[selectedKeys]=\"selectedKeys\""), "Selected keys binding expected");
        assertTrue(s.contains("[expandedKeys]=\"expandedKeys\""), "Expanded keys binding expected");
        assertTrue(s.contains("[filters]=\"filters\""), "Filters binding expected");
        assertTrue(s.contains("[dataSource]=\"dataService.dataSource\""), "Data source binding expected");
        assertTrue(s.contains("[total]=\"total\""), "Total binding expected");
        assertTrue(s.contains("[loading]=\"loading\""), "Loading binding expected");
    }

    @Test
    void rendersCssCustomProperties()
    {
        var s = new WaDataGrid<>()
                .setAccentColor("#2196F3")
                .setMaxHeight("400px")
                .setRowHeight("36px")
                .setHeaderRowHeight("44px")
                .setCellPadding("0.5rem")
                .setHeaderBackground("#fafafa")
                .setStripeBackground("#f5f5f5")
                .setSelectedBackground("#e3f2fd")
                .setIndentSize("1.5rem")
                .setBackgroundColor("#ffffff")
                .setTextColor("#111111")
                .setBorderColor("#dddddd")
                .setBorderWidth("1px")
                .setBorderRadius("6px")
                .setHeaderTextColor("#333333")
                .setRowHoverBackground("#eeeeee")
                .setFocusRing("2px solid #2196F3")
                .setTransitionDuration("150ms")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("--accent-color"), "Accent colour expected");
        assertTrue(s.contains("--max-height"), "Max height expected");
        assertTrue(s.contains("--row-height"), "Row height expected");
        assertTrue(s.contains("--header-row-height"), "Header row height expected");
        assertTrue(s.contains("--cell-padding"), "Cell padding expected");
        assertTrue(s.contains("--header-background"), "Header background expected");
        assertTrue(s.contains("--stripe-background"), "Stripe background expected");
        assertTrue(s.contains("--selected-background"), "Selected background expected");
        assertTrue(s.contains("--indent-size"), "Indent size expected");
        assertTrue(s.contains("--background-color"), "Background colour expected");
        assertTrue(s.contains("--text-color"), "Text colour expected");
        assertTrue(s.contains("--border-color"), "Border colour expected");
        assertTrue(s.contains("--border-width"), "Border width expected");
        assertTrue(s.contains("--border-radius"), "Border radius expected");
        assertTrue(s.contains("--header-text-color"), "Header text colour expected");
        assertTrue(s.contains("--row-hover-background"), "Row hover background expected");
        assertTrue(s.contains("--focus-ring"), "Focus ring expected");
        assertTrue(s.contains("--transition-duration"), "Transition duration expected");
    }

    @Test
    void rendersAllEvents()
    {
        var s = new WaDataGrid<>()
                .setSortChangeEvent("onSortChange($event)")
                .setRowSelectEvent("onRowSelect($event)")
                .setPageChangeEvent("onPageChange($event)")
                .setFilterChangeEvent("onFilterChange($event)")
                .setRowExpandEvent("onRowExpand($event)")
                .setRowCollapseEvent("onRowCollapse($event)")
                .setDataRequestEvent("onDataRequest($event)")
                .setDataErrorEvent("onDataError($event)")
                .setColumnMoveEvent("onColumnMove($event)")
                .setColumnResizeEvent("onColumnResize($event)")
                .setColumnVisibilityChangeEvent("onColumnVisibilityChange($event)")
                .setColumnPinEvent("onColumnPin($event)")
                .setCellClickEvent("onCellClick($event)")
                .setCellContextmenuEvent("onCellContextmenu($event)")
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("(wa-sort-change)="), "Sort change event expected");
        assertTrue(s.contains("(wa-row-select)="), "Row select event expected");
        assertTrue(s.contains("(wa-page-change)="), "Page change event expected");
        assertTrue(s.contains("(wa-filter-change)="), "Filter change event expected");
        assertTrue(s.contains("(wa-row-expand)="), "Row expand event expected");
        assertTrue(s.contains("(wa-row-collapse)="), "Row collapse event expected");
        assertTrue(s.contains("(wa-data-request)="), "Data request event expected");
        assertTrue(s.contains("(wa-data-error)="), "Data error event expected");
        assertTrue(s.contains("(wa-column-move)="), "Column move event expected");
        assertTrue(s.contains("(wa-column-resize)="), "Column resize event expected");
        assertTrue(s.contains("(wa-column-visibility-change)="), "Column visibility change event expected");
        assertTrue(s.contains("(wa-column-pin)="), "Column pin event expected");
        assertTrue(s.contains("(wa-cell-click)="), "Cell click event expected");
        assertTrue(s.contains("(wa-cell-contextmenu)="), "Cell contextmenu event expected");
    }

    @Test
    void rendersSlots()
    {
        var s = new WaDataGrid<>()
                .setEmptySlot(new Div<>().setText("Nothing here"))
                .setNoResultsSlot(new Div<>().setText("No results"))
                .setLoadingSlot(new Div<>().setText("Loading..."))
                .toString(true);
        System.out.println(s);

        assertTrue(s.contains("slot=\"empty\""), "Empty slot expected");
        assertTrue(s.contains("slot=\"no-results\""), "No results slot expected");
        assertTrue(s.contains("slot=\"loading\""), "Loading slot expected");
    }

    @Test
    void columnDtoHoldsValues()
    {
        var column = new WaDataGridColumn()
                .setId("total")
                .setField("orderTotal")
                .setHeader("Total")
                .setSortable(true)
                .setResizable(true)
                .setPinnable(true)
                .setPin(DataGridColumnPin.Right)
                .setWidth(120);

        assertEquals("total", column.getId());
        assertEquals("orderTotal", column.getField());
        assertEquals("Total", column.getHeader());
        assertTrue(column.getSortable());
        assertTrue(column.getResizable());
        assertTrue(column.getPinnable());
        assertEquals("right", column.getPin());
        assertEquals(120, column.getWidth());
    }
}

