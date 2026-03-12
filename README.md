# WebAwesome Pro – JWebMP Plugin

**Status:** Phase 2 Complete ✅ (WaPage Component with 18 sub-components, full test suite)  
**License:** Apache 2  
**Java:** 25 LTS | **Build:** Maven | **Frameworks:** JWebMP, WebAwesome, Angular, GuicedEE

---

## Overview

WebAwesome Pro is a **JWebMP plugin module** that provides seamless Angular directive wrappers and integration for the WebAwesome open-source web components library. It enables developers to compose rich, responsive layouts and component-based UIs within the JWebMP ecosystem.

### Quick Links
- 🏗️ **[Architecture Docs](docs/architecture/README.md)** – C4 diagrams, sequences, ERD
- 📚 **[WebAwesome Docs](https://webawesome.com/)** – Official WebAwesome documentation
- 🔗 **[JWebMP Home](https://jwebmp.com/)** – JWebMP framework documentation

---

## Phase 2: WaPage Component ✅ (Complete)

✅ **Complete:**
- **WaPage component** (18 sub-components total)
  - 11 layout containers (Banner, Header, Navigation, Main, Aside, Footer, etc.)
  - 7 control components (SkipToContent, Menu, Toggle, DialogWrapper, etc.)
- **Component test suite** (13 comprehensive JUnit 5 tests)
  - Component initialization tests (9 tests)
  - Integration test (1 test)
  - Full demonstration test (1 test)
  - Angular property binding tests (1 test)
  - Navigation control tests (1 test)
- **Angular integration** (via angular-awesome library)
  - @NgImportReference and @NgImportModule annotations
  - Property binding support (12 binding methods)
  - CRTP fluent API for method chaining
  - Slot projection with semantic HTML (18 slots)
- **Documentation**
  - Architecture diagrams updated

⏳ **Pending (Phase 3):**
- Additional enterprise component wrappers (to be identified and prioritized)
- Component-specific test suites
- Enhanced documentation

---

## Phase 1: Foundation ✅ (Complete)

✅ **Complete:**
- Architecture documentation (C4 Context, Container, Component diagrams)
- Sequence diagrams (page load, navigation toggle)
- Entity Relationship Diagram (ERD)
- Project documentation and guidelines

---

## Key Features

- ✅ **Angular Directive Wrappers** for WebAwesome components
- ✅ **JWebMP Plugin Integration** via IPageConfigurator and GuicedEE SPI
- ✅ **Slot Projection** with ng-content attribute selectors
- ✅ **Input/Output Bindings** following Angular conventions
- ✅ **Native Method Access** via @ViewChild and directive APIs
- ✅ **CSS Custom Properties** binding for styling
- ✅ **Comprehensive Documentation** (docs-as-code, C4 architecture, guides)

---

## Getting Started

### Prerequisites
- Java 25 LTS
- Maven 3.9+
- Node.js (for Angular development)

### Build
```bash
# Clone the repository
git clone https://github.com/JWebMP/WebAwesomePro.git
cd webawesome-pro

# Build and test
mvn clean install

# Run tests with coverage
mvn test jacoco:report
```

### Key Commands
- **Build:** `mvn clean install`
- **Test:** `mvn test`
- **Coverage:** `mvn jacoco:report`
- **Package:** `mvn package`

---

## Architecture at a Glance

```
┌──────────────────────────────────────────┐
│  Developer Applications                  │
│  (Using Angular + WebAwesome Components) │
└──────────────┬───────────────────────────┘
               │ imports
┌──────────────▼───────────────────────────┐
│  WebAwesome Pro Plugin (this repo)      │
│  ├─ Angular Directives & Wrappers      │
│  ├─ JWebMP Plugin Metadata              │
│  └─ GuicedEE Integration                │
└──────────────┬─────────┬────────┬────────┘
               │         │        │
      ┌────────▼─┐  ┌───▼──┐  ┌──▼────────┐
      │ WebAwesome  │ JWebMP │ GuicedEE  │
      │   Library   │  Core  │    DI     │
      └────────────┘  └──────┘  └─────────┘
```

See **[Architecture Docs](docs/architecture/README.md)** for detailed C4, sequence, and ERD diagrams.

---

## Documentation Structure

### Architecture & Diagrams
- **docs/architecture/c4-context.md** – System context and external dependencies
- **docs/architecture/c4-container.md** – Major components and communication
- **docs/architecture/c4-component-layout.md** – wa-page component deep dive
- **docs/architecture/sequence-page-load.md** – Full page initialization flow
- **docs/architecture/sequence-nav-toggle.md** – Mobile navigation interaction
- **docs/architecture/erd-domain.md** – Core data model
- **docs/architecture/dependencies.md** – Maven, GuicedEE, Angular dependency tree

---

## Component Documentation

WebAwesome Pro provides comprehensive Java wrappers for WebAwesome components.

### Available Components

**Phase 2 Components** (✅ Complete):
- WaPage – Primary layout container with 18 sub-components
- WaPageHeader – Main page header
- And 9 more layout and control components

**Phase 3 Components** (⏳ Planned):
- WaInput – Form input field
- WaSelect – Dropdown select
- WaButton – Action button
- WaCluster – Horizontal layout
- WaStack – Vertical layout
- WaIconButton – Icon-only button

### Component Usage

See the source code in [src/main/java/](src/main/java/) and tests in [src/test/java/](src/test/java/) for comprehensive examples of how to use each component with JWebMP's CRTP fluent API.

---

## Glossary & Terminology

This project uses **enforced Prompt Language Alignment** for AI systems. Use these canonical terms in all code, prompts, and documentation:

| Concept | Canonical Term |
|---------|---|
| Button Component | `WaButton` |
| Input Component | `WaInput` |
| Page Layout | `WaPage` |
| Horizontal Layout | `WaCluster` |
| Vertical Layout | `WaStack` |
| Icon Button | `WaIconButton` |


---

## Standards & Constraints

### Code Standards
- **Java Version:** Java 25 LTS (enforced)
- **Build Tool:** Apache Maven
- **Module System:** JPMS module descriptors required (module-info.java)
- **Logging:** Log4j2 + Lombok `@Log4j2` annotation
- **Fluent APIs:** CRTP pattern (Curiously Recurring Template Pattern), no @Builder

### Angular/TypeScript
- **Strict Mode:** `strict: true` in tsconfig.json
- **Directives:** `@Input/@Output/@HostListener` for property/event binding
- **Slots:** `ng-content select="[slotAttribute]"` for content projection
- **Type Safety:** Full TypeScript type annotations, no `any`

### Documentation
- **Forward-Only:** Remove legacy docs; never keep compatibility stubs
- **Modularity:** Component-specific documentation in docs/ directory
- **Docs-as-Code:** Mermaid/PlantUML diagrams in version control

---

## Testing & Quality

- **Framework:** Java Micro Harness + JUnit 5
- **Coverage Goal:** ≥ 80% (Jacoco)
- **Browser Testing:** BrowserStack (optional, for cross-browser validation)
- **CI/CD:** GitHub Actions (build, test, coverage on push/PR)

---

## Phases & Roadmap

### Phase 1: Foundation ✅ (Current)
- Architecture documentation and diagrams
- Project documentation and component rules
- Skeleton implementations of configurators and inclusion modules

### Phase 2: Core Components (Next)
- WaPageDirective (primary layout component)
- WaButtonDirective, WaInputDirective, WaSelectDirective
- Layout directives (WaCluster, WaStack)
- Component-specific tests
- Documentation updates with component examples

### Phase 3: Advanced Features (Future)
- Font Awesome Pro integration
- Theming & CSS custom property binding guide
- Reactive forms integration guide
- Additional component wrappers as needed

### Phase 4: Production Release (Future)
- Full test coverage (Jacoco 80%+)
- Javadoc for all public classes
- GitHub Actions CI/CD pipeline
- Release to Maven Central

---

## Contributing

### Before Writing Code
1. Check **[Architecture Docs](docs/architecture/README.md)** for system design
2. Review existing source code in **src/main/java/** for patterns
3. Review existing tests in **src/test/java/** for examples

### Commit Requirements
- ✅ All tests pass (`mvn clean test`)
- ✅ Code compiles with JPMS enabled
- ✅ Coverage ≥ 80% (Jacoco)
- ✅ Reciprocal links updated and validated
- ✅ Architecture diagrams in sync (if applicable)
- ✅ Javadoc present for public APIs
- ✅ Canonical terminology used (WaButton, WaInput, etc.)

See **[.github/copilot-instructions.md](.github/copilot-instructions.md)** for GitHub Copilot workspace rules.

---

## Resources

- **WebAwesome Documentation:** https://www.webawesome.io/
- **JWebMP Documentation:** https://github.com/JWebMP
- **GuicedEE Documentation:** https://github.com/GuicedEE
- **Angular Documentation:** https://angular.io/

---

## License

This project is licensed under the **Apache License 2.0**. See [LICENSE](LICENSE) for details.

---

## Support

For questions or issues:
1. Consult **[Architecture Docs](docs/architecture/README.md)** for system design
2. Review existing source code in **src/main/java/** for patterns
3. Check existing tests in **src/test/java/** for examples
4. Open an issue on GitHub with detailed context

---

**Last Updated:** December 2, 2025  
**Status:** Phase 1 Complete (Architecture & Foundations)
