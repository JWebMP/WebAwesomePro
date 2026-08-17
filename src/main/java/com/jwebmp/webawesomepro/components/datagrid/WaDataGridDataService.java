package com.jwebmp.webawesomepro.components.datagrid;

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.client.DynamicData;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataService;
import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;

import java.util.ArrayList;
import java.util.List;

/**
 * Data service backing the server driven mode of {@link WaDataGrid}.
 * <p>
 * When {@link WaDataGrid#setServer(Boolean)} is enabled the grid delegates sorting, filtering and
 * paging to a {@code dataSource} function. This service generates an Angular service exposing a
 * {@code load(request)} method (and a bindable {@code dataSource} arrow function) that resolves
 * rows and a total row count from a JWebMP AJAX endpoint.
 * <p>
 * Wire it up with:
 * <pre>{@code
 * grid.setServer(true)
 *     .bindDataSource("dataService.dataSource");
 * }</pre>
 * <p>
 * Extend this class in your application to override {@link #getData(AjaxCall, AjaxResponse)} and
 * return the page of rows for the incoming request.
 * <p>
 * This is a <strong>Pro</strong> component requiring a Web Awesome Pro licence.
 */
@NgDataTypeReference(value = WaDataGridColumn.class, primary = false)
@NgDataService(value = "WaDataGridDataService", listenerName = "WaDataGridDataService", fetchOnCreate = false)
public class WaDataGridDataService<J extends WaDataGridDataService<J>> implements INgDataService<J>
{
    @Override
    public String providedIn()
    {
        // Make the service globally available by default.
        return "root";
    }

    @Override
    public DynamicData getData(AjaxCall<?> call, AjaxResponse<?> response)
    {
        return null;
    }

    @Override
    public List<String> fields()
    {
        List<String> fields = new ArrayList<>(INgDataService.super.fields());
        // Bindable arrow function - pass straight into [dataSource] on <wa-data-grid>
        fields.add("readonly dataSource = (request: any = {}) => this.load(request);");
        return fields;
    }

    @Override
    public List<String> methods()
    {
        List<String> list = new ArrayList<>(INgDataService.super.methods());

        list.add("""
                         load(request: any = {}): Promise<{ rows: any[]; total: number }> {
                           this.additionalData = { ...this.additionalData, ...request };
                           this.fetchData();
                           return new Promise((resolve, reject) => {
                             const sub = this.dataSubject.subscribe({
                               next: (data: any) => {
                                 if (data === undefined || data === null) {
                                   return;
                                 }
                                 sub.unsubscribe();
                                 const rows = Array.isArray(data) ? data : (data.rows ?? data.data ?? []);
                                 const total = Array.isArray(data) ? data.length : (data.total ?? rows.length);
                                 resolve({ rows, total });
                               },
                               error: (err: any) => {
                                 sub.unsubscribe();
                                 reject(err);
                               }
                             });
                           });
                         }""");

        return list;
    }
}

