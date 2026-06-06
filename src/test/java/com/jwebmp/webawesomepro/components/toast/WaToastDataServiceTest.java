package com.jwebmp.webawesomepro.components.toast;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WaToastDataServiceTest
{
    @Test
    public void verifiesServiceMethodsAreExposed()
    {
        var svc = new WaToastDataService<>();
        List<String> methods = svc.methods();
        String all = String.join("\n\n", methods);
        assertTrue(all.contains("setConfig(partial: any"), "setConfig() should be included in generated methods");
        assertTrue(all.contains("show(message: string"), "show() should be included in generated methods");
        assertTrue(all.contains("update(id: string"), "update() should be included in generated methods");
        assertTrue(all.contains("close(id: string"), "close() should be included in generated methods");
        assertTrue(all.contains("clearAll(): void"), "clearAll() should be included in generated methods");
        assertTrue(all.contains("remove(id: string"), "remove() compatibility alias should be included in generated methods");
        assertTrue(all.contains("clear(): void"), "clear() compatibility alias should be included in generated methods");
        assertEquals("any", svc.providedIn(), "Service should be provided in 'any' scope by default");
    }

    @Test
    public void verifyWaToastServiceFieldIsDeclared()
    {
        var svc = new WaToastDataService<>();
        List<String> fields = svc.fields();
        String all = String.join("\n", fields);
        assertTrue(all.contains("waToastService: WaToastService"), "waToastService field should be declared");
        assertTrue(all.contains("inject(WaToastService)"), "waToastService should use inject()");
    }

    @Test
    public void verifyMethodsDelegateToWaToastService()
    {
        var svc = new WaToastDataService<>();
        List<String> methods = svc.methods();
        String all = String.join("\n\n", methods);
        assertTrue(all.contains("this.waToastService.setConfig("), "setConfig() should delegate to waToastService");
        assertTrue(all.contains("this.waToastService.show("), "show() should delegate to waToastService");
        assertTrue(all.contains("this.waToastService.update("), "update() should delegate to waToastService");
        assertTrue(all.contains("this.waToastService.close("), "close() should delegate to waToastService");
        assertTrue(all.contains("this.waToastService.clearAll()"), "clearAll() should delegate to waToastService");
        assertTrue(all.contains("remove(id: string): void { this.close(id); }"), "remove() should alias to close()");
        assertTrue(all.contains("clear(): void { this.clearAll(); }"), "clear() should alias to clearAll()");
    }

    @Test
    public void verifyConvenienceHelpersDelegateToShow()
    {
        var svc = new WaToastDataService<>();
        List<String> methods = svc.methods();
        String all = String.join("\n\n", methods);
        assertTrue(all.contains("success(message: string"), "success() helper should be present");
        assertTrue(all.contains("warning(message: string"), "warning() helper should be present");
        assertTrue(all.contains("danger(message: string"), "danger() helper should be present");
        assertTrue(all.contains("brand(message: string"), "brand() helper should be present");
        assertTrue(all.contains("neutral(message: string"), "neutral() helper should be present");
    }
}
