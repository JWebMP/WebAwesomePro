package com.jwebmp.webawesomepro.components.datagrid;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataType;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataType;

/**
 * A lightweight data type describing a single {@code <wa-data-grid>} column.
 * <p>
 * The native element consumes {@code columns} as a JavaScript array, so this type is
 * <strong>not</strong> a renderable component. It exists to drive Angular data type code
 * generation and to be serialised from a data service / {@code @NgField} that the grid then binds
 * to using {@link WaDataGrid#bindColumns(String)}.
 * <p>
 * Introduced with Web Awesome 3.11.0.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class WaDataGridColumn implements INgDataType<WaDataGridColumn>
{
    /**
     * A stable identifier for the column.
     */
    private String id;

    /**
     * The property on the row object rendered by this column.
     */
    private String field;

    /**
     * The header text rendered for this column.
     */
    private String header;

    /**
     * Whether the column can be sorted.
     */
    private Boolean sortable;

    /**
     * Whether the column can be resized.
     */
    private Boolean resizable;

    /**
     * Whether the column can be pinned.
     */
    private Boolean pinnable;

    /**
     * Whether the column can be filtered.
     */
    private Boolean filterable;

    /**
     * Whether the column is hidden.
     */
    private Boolean hidden;

    /**
     * The edge the column is currently pinned to - {@code left} or {@code right}.
     */
    private String pin;

    /**
     * The column width in pixels.
     */
    private Integer width;

    /**
     * The minimum column width in pixels.
     */
    private Integer minWidth;

    /**
     * The maximum column width in pixels.
     */
    private Integer maxWidth;

    /**
     * Text alignment within the column - {@code start}, {@code center} or {@code end}.
     */
    private String align;

    public String getId()
    {
        return id;
    }

    public WaDataGridColumn setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getField()
    {
        return field;
    }

    public WaDataGridColumn setField(String field)
    {
        this.field = field;
        return this;
    }

    public String getHeader()
    {
        return header;
    }

    public WaDataGridColumn setHeader(String header)
    {
        this.header = header;
        return this;
    }

    public Boolean getSortable()
    {
        return sortable;
    }

    public WaDataGridColumn setSortable(Boolean sortable)
    {
        this.sortable = sortable;
        return this;
    }

    public Boolean getResizable()
    {
        return resizable;
    }

    public WaDataGridColumn setResizable(Boolean resizable)
    {
        this.resizable = resizable;
        return this;
    }

    public Boolean getPinnable()
    {
        return pinnable;
    }

    public WaDataGridColumn setPinnable(Boolean pinnable)
    {
        this.pinnable = pinnable;
        return this;
    }

    public Boolean getFilterable()
    {
        return filterable;
    }

    public WaDataGridColumn setFilterable(Boolean filterable)
    {
        this.filterable = filterable;
        return this;
    }

    public Boolean getHidden()
    {
        return hidden;
    }

    public WaDataGridColumn setHidden(Boolean hidden)
    {
        this.hidden = hidden;
        return this;
    }

    public String getPin()
    {
        return pin;
    }

    public WaDataGridColumn setPin(String pin)
    {
        this.pin = pin;
        return this;
    }

    /**
     * Sets the pinned edge using the typed enum.
     *
     * @param pin The edge to pin to
     * @return This column
     */
    public WaDataGridColumn setPin(DataGridColumnPin pin)
    {
        this.pin = pin == null ? null : pin.toString();
        return this;
    }

    public Integer getWidth()
    {
        return width;
    }

    public WaDataGridColumn setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    public Integer getMinWidth()
    {
        return minWidth;
    }

    public WaDataGridColumn setMinWidth(Integer minWidth)
    {
        this.minWidth = minWidth;
        return this;
    }

    public Integer getMaxWidth()
    {
        return maxWidth;
    }

    public WaDataGridColumn setMaxWidth(Integer maxWidth)
    {
        this.maxWidth = maxWidth;
        return this;
    }

    public String getAlign()
    {
        return align;
    }

    public WaDataGridColumn setAlign(String align)
    {
        this.align = align;
        return this;
    }
}

