# Dependencies & Integration Map

## Maven Dependency Tree (Simplified)

```
com.jwebmp.plugins:web-awesome-pro:2.0.0-SNAPSHOT [JAR]
├── com.jwebmp.client:jwebmp-client [transitive]
├── com.jwebmp.plugins:web-awesome [transitive]
├── com.jwebmp.plugins:font-awesome-pro [optional]
└── com.jwebmp.core:jwebmp-testlib [test scope]
```

## GuicedEE Injection Tree

```
com.jwebmp.webawesomepro:WebAwesomeProInclusionModule [GuicedEE SPI]
  └── Registered Bindings:
      - IPageConfigurator → WebAwesomeProPageConfigurator
      - Module scan includes: com.jwebmp.webawesomepro
```

## Angular Module Dependencies

```
WaPageModule (from components/page/)
├── WebAwesome library (custom elements)
└── Angular CommonModule
```

## Service Provider Interfaces (SPI)

The project declares two SPI implementations in `module-info.java`:

```java
provides IPageConfigurator with WebAwesomeProPageConfigurator;
provides IGuiceScanModuleInclusions with WebAwesomeProInclusionModule;
```

These are discovered automatically by GuicedEE at runtime, enabling zero-configuration integration.
