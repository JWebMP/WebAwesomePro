# WebAwesome Pro – Project Rules & Standards

**Version:** 1.0  
**Date:** December 2, 2025  
**License:** Apache 2  
**Java LTS:** Java 25  

## Overview

WebAwesome Pro is a **JWebMP plugin module** that provides Angular directive wrappers and integration for the WebAwesome open-source web components library. This project bridges JWebMP's server-side page composition with WebAwesome's client-side custom elements.

### Key Scope
- **Primary Component:** Wrap WebAwesome web components (wa-page, wa-button, wa-input, etc.) as Angular directives
- **Dependency Injection:** Integrate with GuicedEE for automatic module scanning and plugin registration
- **Page Configuration:** Implement `IPageConfigurator` to allow runtime page setup
- **Optional Icons:** Font Awesome Pro (optional dependency) for enhanced iconography

---

## Behavioral Rules (Section 4)

### 4.1 Forward-Only Change Policy
- All documentation changes follow forward-only principles: remove legacy docs, never keep compatibility stubs
- Refactor old monolithic docs to modular ones (split/link to rules repository)
- All documentation resides outside the `rules/` submodule directory
- Update all inbound links when removing or relocating docs (no broken refs)
- Reference: `rules/RULES.md#section-6` (Forward-Only Change Policy)

### 4.2 Documentation Modularity
- Project docs (PACT.md, RULES.md, GUIDES.md, IMPLEMENTATION.md) live in the host repository root or `docs/` directory
- Enterprise rules reside in the `rules/` submodule; never edit or extend enterprise rules from the host project
- GLOSSARY.md is host-level; it composes topic-first glossaries from selected enterprise topics via links and enforces Prompt Language Alignment
- Reference: `rules/RULES.md#document-modularity-policy`

### 4.3 Glossary Precedence Policy
- Topic glossaries override the host glossary for their scope
- The host GLOSSARY.md acts as an index and enforces LLM prompt language alignment (e.g., WaButton, WaInput, WaPage)
- All other terms are referenced (linked) to their topic glossary without duplication
- Reference: `GLOSSARY.md`

### 4.4 Fluent API Strategy: CRTP
- All Java classes implementing fluent interfaces **must** use Curiously Recurring Template Pattern (CRTP)
- Return `(J)this` (CRTP pattern) to support method chaining
- Annotate with `@SuppressWarnings("unchecked")` where type-safety warnings appear
- Do **not** use Lombok `@Builder`; implement manual CRTP fluent setters instead
- Reference: `rules/generative/backend/fluent-api/crtp.rules.md`

### 4.5 Logging
- Default to Log4j2 (configured via classpath resources or parent POM)
- Use Lombok `@Log4j2` annotation for logger injection (available in Java 25 + Lombok)
- All logging must follow SLF4J facade (Log4j2 implements this)
- No other Lombok logging annotations (@Slf4j, @Log, etc.)
- Reference: `rules/generative/backend/logging/README.md`

### 4.6 Component Wrapping & Angular Integration
- Each WebAwesome component wrapper must expose:
  - Inputs: Map native element properties to Angular `@Input()` properties
  - Outputs: Expose custom events as `@Output()` EventEmitters
  - Slots: Use `ng-content select="[slotAttribute]"` for content projection
  - Methods: Expose key native methods via `@ViewChild()` or directive references
- All input names must follow camelCase (Angular convention); bind to camelCase CSS custom properties using style directive
- Template slots use attribute selectors (e.g., `[waPageBanner]`) for clarity and SEO
- Reference: `docs/rules/README.md` (component rules index), `docs/rules/wa-page.rules.md` (wa-page example), `rules/generative/frontend/jwebmp/client/GLOSSARY.md`

---

## Technical Rules (Section 5)

### 5.1 Build & Dependency Management
- **Build Tool:** Apache Maven 3.9+
- **Parent POM:** `com.jwebmp:parent:2.0.0-SNAPSHOT`
- **Java Version:** Java 25 LTS (enforced via `maven-compiler-plugin`)
- **Module System:** Java 9 Module Descriptors required (`module-info.java`)
  - Exports only public component APIs
  - Opens packages for reflection (Guice, Jackson)
  - Uses transitive requires for upstream dependencies
- **Reference:** `pom.xml`, `rules/generative/language/java/java-25.rules.md`

### 5.2 Dependency Coordinates (Maven)
- **Runtime Core:**
  - `com.jwebmp.client:jwebmp-client` (JWebMP client framework)
  - `com.jwebmp.plugins:web-awesome` (WebAwesome library)
  - `com.guicedee:standalone-bom` (GuicedEE DI container, imported)
  - `com.guicedee:fasterxml-bom` (JSON/YAML serialization, imported)
- **Optional:**
  - `com.jwebmp.plugins:font-awesome-pro` (optional, for enhanced icons)
- **Test:**
  - `com.jwebmp.core:jwebmp-testlib` (test utilities, test scope)
- **Annotation Processing:**
  - Lombok (static, auto-processor via parent POM)
  - JSpecify (static, for nullness annotations)

### 5.3 Guice Dependency Injection Integration
- Implement `IGuiceScanModuleInclusions` to register the module with GuicedEE's SPI scanner
- All configuration must occur in a concrete `IPageConfigurator` implementation
- Use Guice `@Inject` for field/constructor injection in page configurators
- All GuicedEE integration is automatic via `module-info.java` `provides` clauses
- Reference: `rules/generative/backend/guicedee/client/README.md`

### 5.4 Module Metadata & Plugin System
- Decorate the main page configurator with `@PluginInformation` to register with JWebMP's plugin system
- Set `pluginStatus = PluginStatus.DevelopmentStarted` for early-stage modules
- Provide plugin name, version, categories, and URLs for discoverability
- Reference: `src/main/java/com/jwebmp/webawesomepro/WebAwesomeProPageConfigurator.java`

### 5.5 Angular Version
- **Angular LTS:** To be confirmed from parent POM (likely Angular 19 or 20 based on Java 25 alignment)
- Once determined, link to the selected version rules:
  - Angular 17: `rules/generative/language/angular/angular-17.rules.md`
  - Angular 19: `rules/generative/language/angular/angular-19.rules.md`
  - Angular 20: `rules/generative/language/angular/angular-20.rules.md`
- **Base Rules:** `rules/generative/language/angular/angular.md`
- All Angular code must comply with selected version's compilation target and RxJS version

### 5.6 TypeScript & Component Compilation
- **Language:** TypeScript (version determined by Angular LTS)
- **Strict Mode:** `strict: true` in `tsconfig.json`
- **Web Components:** Use Angular Elements or native custom elements API
- **Type Safety:** Leverage JSpecify `@Nullable` / `@NonNull` annotations in Java; TypeScript strict mode in Angular
- **Reference:** `rules/generative/language/typescript/README.md`, `rules/generative/language/angular/angular.md`

### 5.7 Testing Strategy
- **Java Unit Tests:** Java Micro Harness + JUnit 5 (from jwebmp-testlib)
- **Code Coverage:** Jacoco (configured in parent POM)
- **Browser Testing (Optional):** BrowserStack for cross-browser Angular component validation
- **Test Scope:** All tests in `src/test/java/**`
- **Reference:** `rules/generative/backend/testing/junit5.rules.md`

### 5.8 Documentation & JavaDoc
- **API Docs:** Javadoc required for all public classes and methods
- **Example Docs:** Link to `docs/page.rules.md` for component wrapper patterns
- **README Updates:** Must reference PACT.md, RULES.md, GUIDES.md, IMPLEMENTATION.md, GLOSSARY.md
- **Reference:** `GUIDES.md`, `IMPLEMENTATION.md`

---

## Linked Enterprise Rules & Topics

### Frontend Framework
- **JWebMP Client:** `rules/generative/frontend/jwebmp/client/README.md`
- **WebAwesome Components:** `rules/generative/frontend/webawesome/README.md`
- **Angular (Base):** `rules/generative/language/angular/README.md`
- **Angular Version Overrides:** `rules/generative/language/angular/angular-{17|19|20}.rules.md` (TBD)

### Backend & Infrastructure
- **GuicedEE (Client Mode):** `rules/generative/backend/guicedee/client/README.md`
- **Fluent API (CRTP):** `rules/generative/backend/fluent-api/crtp.rules.md`
- **Logging (Log4j2):** `rules/generative/backend/logging/README.md`
- **JSpecify Nullness:** `rules/generative/backend/jspecify/README.md`

### Build & Tooling
- **Java 25 LTS:** `rules/generative/language/java/java-25.rules.md`
- **Maven & Build Tooling:** `rules/generative/language/java/build-tooling.md`

### CI/CD & Deployment
- **GitHub Actions:** `rules/generative/platform/ci-cd/providers/github-actions.md`
- **CI/CD Overview:** `rules/generative/platform/ci-cd/README.md`

### Architecture
- **Documentation-as-Code:** `rules/generative/architecture/README.md`
- **TDD (Test-Driven Development):** `rules/generative/architecture/tdd/README.md`

---

## Glossary & Terminology

Reference: `GLOSSARY.md` (host-level index and LLM alignment) and topic-scoped glossaries (linked, precedence).

**Prompt Language Alignment (Enforced):**
| Concept | JWebMP Canonical | Usage in Prompts |
|---------|------------------|------------------|
| Button Component | `WaButton` | Use when referring to WebAwesome button |
| Input Component | `WaInput` | Use for form inputs |
| Page Layout | `WaPage` | Primary layout wrapper (main example) |
| Horizontal Stack | `WaCluster` | Horizontal layout alignment |
| Vertical Stack | `WaStack` | Vertical layout alignment |
| Icon-Only Button | `WaIconButton` | Button variant showing icon only |

---

## Required Reading Before Implementation

All team members and AI systems must read and understand before code generation:
1. `PACT.md` — Project contract and vision
2. `GLOSSARY.md` — Terminology precedence and alignment
3. `GUIDES.md` — How-to guides for each component family
4. `IMPLEMENTATION.md` — Current modules and architecture
5. `docs/architecture/README.md` — Architecture diagrams and flows
6. `docs/PROMPT_REFERENCE.md` — Configuration and MCP registration

---

## Guardrails & Policy

### Forward-Only Enforcement
- No legacy branches or compat modes; refactor or remove
- All doc changes logged and propagated to inbound links
- Monolithic docs are split into modular pieces or replaced with enterprise rule links

### Artifact Integrity
- PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION close all loops (reciprocal refs)
- Diagrams in `docs/architecture/` are linked by all strategic docs
- Enterprise rule links point to versioned/pinned commits where applicable

---

**Last Updated:** December 2, 2025  
**Approval:** Blanket approval (Stage 2 auto-approved)  
**Next Review:** Stage 3 (Implementation Plan)
