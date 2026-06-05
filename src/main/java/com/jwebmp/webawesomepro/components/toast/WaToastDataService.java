package com.jwebmp.webawesomepro.components.toast;

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.client.DynamicData;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataService;
import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.structures.NgInject;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;

import java.util.ArrayList;
import java.util.List;

/**
 * Data service used to programmatically manage toasts.
 * Components can depend on this service by declaring an @NgDataService-annotated subclass in their app/tests.
 * The underlying Angular service is generated from the metadata provided here.
 */
@NgDataTypeReference(value = WaToastItem.class, primary = false)
@NgImportReference(value = "TemplateRef", reference = "@angular/core")
@NgImportReference(value = "inject", reference = "@angular/core")
@NgImportReference(value = "WaToastService", reference = "angular-awesome")
@NgInject(value = "WaToastService", referenceName = "waToastService")
@NgDataService(value = "WaToastDataService", listenerName = "WaToastDataService", fetchOnCreate = false)
public class WaToastDataService<J extends WaToastDataService<J>> implements INgDataService<J>
{
    @Override
    public List<String> fields()
    {
        List<String> fields = new ArrayList<>(INgDataService.super.fields());
        fields.add("private waToastService: WaToastService = inject(WaToastService);");
        return fields;
    }

    @Override
    public String providedIn()
    {
        // Make service globally available by default.
        return "any";
    }

    @Override
    public DynamicData getData(AjaxCall<?> call, AjaxResponse<?> response)
    {
        return null;
    }

    @Override
    public List<String> methods()
    {
        List<String> list = new ArrayList<>(INgDataService.super.methods());

        // Delegate to the injected WaToastService from angular-awesome.
        list.add("""
                setConfig(partial: any = {}): void {
                  this.waToastService.setConfig(partial);
                }""");

        list.add("""
                show(message: string, options: any = {}): string {
                  return this.waToastService.show(message, options);
                }""");

        list.add("""
                update(id: string, changes: any = {}): void {
                  this.waToastService.update(id, changes);
                }""");

        list.add("""
                close(id: string): void {
                  this.waToastService.close(id);
                }""");

        list.add("""
                clearAll(): void {
                  this.waToastService.clearAll();
                }""");

        // Backward-compatible aliases.
        list.add("remove(id: string): void { this.close(id); }");
        list.add("clear(): void { this.clearAll(); }");

        // Convenience helpers for common variants - delegate through show().
        list.add("success(message: string, options: any = {}): string { return this.show(message, { variant: 'success', ...options }); }");
        list.add("warning(message: string, options: any = {}): string { return this.show(message, { variant: 'warning', ...options }); }");
        list.add("danger(message: string, options: any = {}): string { return this.show(message, { variant: 'danger', ...options }); }");
        list.add("brand(message: string, options: any = {}): string { return this.show(message, { variant: 'brand', ...options }); }");
        list.add("neutral(message: string, options: any = {}): string { return this.show(message, { variant: 'neutral', ...options }); }");

        return list;
    }
}
