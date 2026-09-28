# WaCombobox server loading — Web Awesome 3.14

Bind a callback to Angular Awesome's `dataSource` input when the browser should own option loading:

```java
new WaCombobox<>()
        .bindDataSource("loadCustomers")
        .setFilterDebounce(300)
        .setOptionsErrorEvent("showLoadError($event)")
        .reload();
```

For event-driven loading, set `server`, handle `wa-options-request`, replace the slotted options,
then clear the bound `loading` state. The request detail contains the query and an abort signal.
Use the `loading`, `no-results`, `empty`, and `error` slot setters for status content.
