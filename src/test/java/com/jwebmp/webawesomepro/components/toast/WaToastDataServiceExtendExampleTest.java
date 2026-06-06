package com.jwebmp.webawesomepro.components.toast;

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.client.DynamicData;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataService;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Example and test that demonstrates how to extend WaToastDataService
 * to add custom helpers or override behavior. This mirrors how an application
 * would declare its toast service in production code.
 */
public class WaToastDataServiceExtendExampleTest
{
    /**
     * A concrete service used for codegen and testing. In an app, place this in your project and
     * inject it where needed.
     */
    @NgDataService(value = "MyToastService", listenerName = "MyToastService")
    public static class MyToastDataService extends WaToastDataService<MyToastDataService> implements INgDataService<MyToastDataService>
    {
        @Override
        public DynamicData getData(AjaxCall<?> call, AjaxResponse<?> response)
        {
            // Seed with one example toast so the container can render something immediately
            return new DynamicData().addData(new WaToastItem()
                    .setId("seed-example")
                    .setMessage("Welcome!")
                    .setVariant("brand")
                    .setDuration(2000));
        }

        @Override
        public List<String> methods()
        {
            // Start with the built-in show/update/close/clearAll + variant helpers
            List<String> list = new ArrayList<>(super.methods());

            // Add a custom convenience helper. This gets emitted to the generated TS service.
            list.add("info(message: string, options: any = {}): string { return this.show(message, { variant: 'neutral', ...options }); }");

            // You can add more domain-specific helpers here as needed.
            return list;
        }

        // Optionally override providedIn() if you want a different DI scope
        // @Override
        // public String providedIn() { return 'root'; }
    }

    @Test
    public void showsHowToExtendServiceAndAddsCustomHelper()
    {
        MyToastDataService svc = new MyToastDataService();
        List<String> methods = svc.methods();
        String ts = String.join("\n\n", methods);

        // Base API should still be present and delegate to waToastService
        assertTrue(ts.contains("setConfig(partial: any"));
        assertTrue(ts.contains("show(message: string"));
        assertTrue(ts.contains("update(id: string"));
        assertTrue(ts.contains("close(id: string"));
        assertTrue(ts.contains("clearAll(): void"));
        assertTrue(ts.contains("this.waToastService.show("), "show() should delegate to waToastService");

        // Custom helper should be present
        assertTrue(ts.contains("info(message: string"));

        // Default DI scope remains "any" unless overridden
        assertEquals("any", svc.providedIn());

        // getData seeding example should return a DynamicData instance
        DynamicData seeded = svc.getData(null, null);
        assertNotNull(seeded);
    }
}
