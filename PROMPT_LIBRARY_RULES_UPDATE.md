# 🧰 Starter Prompt — WebAwesome Pro Library Rules Update

Ask your AI tool to copy this template and align with the Rules Repository whenever you maintain this library and need to update or (re)create its rules, indexes, and guides. This drives a forward-only, modular documentation model and ensures developers can navigate component/topic rules easily.

Supported: GitHub Copilot Chat, Cursor, ChatGPT, Claude, Codex.

---

## 0) Provide Inputs
**Pre-configured for WebAwesome Pro. Modify only if project scope changes.**

- **Library name:** WebAwesome Pro
- **Current/new version:** 2.0.0-SNAPSHOT
- **Repository URL / path:** c:\Java\DevSuite\JWebMP\plugins\webawesome-pro
- **Rules Repository Location:** c:\Java\DevSuite\JWebMP\plugins\webawesome-pro\rules (local submodule reference)
- **Short description:** JWebMP wrapper and Angular directives for WebAwesome enterprise web components library
- **Type:**
  - [x] UI component library
  - [ ] Data/ORM
  - [ ] Service/Framework
  - [ ] Other

- **Stage approvals preference for this run (controls STOP gates)**
  - Choose exactly one:
    - [ ] Require explicit approval at each stage (default)
    - [ ] Approvals are optional; proceed with documented defaults if no reply
    - [x] Blanket approval granted for this run (no STOPs)

- **AI engine used:**
  - [ ] Junie
  - [x] GitHub Copilot
  - [ ] Cursor
  - [ ] ChatGPT
  - [ ] Claude
  - [ ] Roo
  - [ ] Codex
  - [ ] AI Assistant
  - Note: Ensure rules/templates are configured for selected engine(s).
  - MCP servers: Mermaid MCP `https://mcp.mermaidchart.com/mcp` type `http` (required for diagrams)

- **Architecture:**
  - [x] Specification-Driven Design (SDD) (mandatory)
  - [x] Documentation-as-Code (mandatory)
  - [ ] Monolith
  - [ ] Microservices
  - [ ] Micro Frontends
  - [x] DDD (Domain-Driven Design)
  - [ ] TDD (docs-first, test-first)
  - [ ] BDD (docs-first, executable specs)

- **Language selection (configured)**
  - Languages
    - Java (choose exactly one LTS)
      - [ ] Java 17 LTS
      - [ ] Java 21 LTS
      - [x] Java 25 LTS
    - Web
      - [x] TypeScript
        - [x] Angular (TypeScript)
          - [x] Angular 19
        - [ ] React (TypeScript)
        - [ ] Vue (TypeScript)
      - [ ] JavaScript
    - Kotlin
      - [ ] Kotlin
      - [ ] Ktor
    - Other: N/A
  - Build engines
    - Java/Kotlin builds
      - [x] Maven
      - [ ] Gradle
    - Web builds: (inherited from angular-awesome)
  - Dependency declarations
    - JVM: artifact coordinates only (groupId:artifactId:version)
    - JavaScript/Web: package names + versions (npm); script wiring deferred to language/build guides

- **Component/topic areas (list):**
  - WaPage (layouts: Banner, Header, Navigation, Main, Aside, Footer, etc.)
  - WaInput (form input component)
  - WaSelect (form select component)
  - WaButton (action button component)
  - WaCluster (horizontal layout container)
  - WaStack (vertical layout container)
  - WaIconButton (icon-only button)
  - WaCard, WaBadge, WaIcon (future phases)

- **Fluent API Strategy (choose exactly one):**
  - [x] CRTP (Curiously Recurring Template Pattern)
  - [ ] Builder pattern (Lombok @Builder/manual)
  - **Status:** CRTP fully implemented with Lombok `@Accessors(chain = true)` (no @Builder)

- **Backend Reactive:**
  - Core stacks:
    - [ ] Vert.x 5
    - [ ] Hibernate Reactive 7
  - Quarkus: N/A (this is a frontend/plugin library)
  - GuicedEE:
    - [x] Core (dependency injection for module scanning)
    - [ ] Client
    - [x] Web (plugin metadata registration)
    - [ ] WebSocket
    - [ ] Rest
    - [ ] Persistence
    - [ ] RabbitMQ
    - [ ] Cerial
    - [ ] OpenAPI
    - [ ] Sockets

- **Backend (Non-Reactive):**
  - Spring MVC: N/A (JWebMP-native)
  - JDBC Databases: N/A (not applicable to this library)

- **Structural:**
  - [x] MapStruct (future: for DTO mapping)
  - [x] Lombok (for @Log4j2, @Accessors, @Data, etc.)
  - [x] Logging (Log4j2 via Lombok @Log4j2)
  - [x] JSpecify (nullness annotations)

- **Testing & Coverage:**
  - [x] Jacoco (target ≥ 80% coverage)
  - [ ] SonarQube
  - [x] Java Micro Harness (unit testing framework)
  - [ ] Cypress
  - [x] BrowserStack (cross-browser Angular component validation, optional)

- **Frontend (Standard):**
  - [x] Web Components (WebAwesome upstream library)

- **Frontend (Reactive):**
  - Angular (choose exactly one)
    - [ ] Angular 17
    - [ ] Angular 19
    - [x] Angular 20 (latest compatible)
  - Other frameworks: N/A

- **Frontend (Angular Plugins):**
  - [x] Angular Awesome (wrapper directives for WebAwesome components)
  - Frameworks (JWebMP):
    - [x] Core (JWebMP base framework)
    - [ ] Client
    - [ ] TypeScript
    - [x] Angular (Angular integration via angular-awesome)
    - [x] WebAwesome (this library wraps WebAwesome)
    - [ ] AgCharts
    - [ ] AgCharts Enterprise

- **Security/Auth Providers:**
  - [ ] OpenID Connect (generic)
  - [ ] GCP (IAP/OIDC)
  - [ ] Firebase Auth
  - [ ] Microsoft Entra ID (Azure AD)
  - Note: Authentication is handled by JWebMP core or backend services

- **CI/CD Providers:**
  - [x] GitHub Actions (configured in repository)
  - [ ] GitLab CI
  - [ ] Jenkins
  - [ ] TeamCity
  - [ ] Google Cloud Build
  - [ ] Azure Pipelines
  - [ ] AWS CodeBuild/CodePipeline

- **Observability/Diagnostics:**
  - [ ] Wireshark
  - [ ] SLF4J/Log4j2 configuration (part of logging guidelines)

- **Release impact:**
  - [x] Forward-only (breaking changes allowed without migration guides)
  - [ ] Backcompat required

---

## Key Project Policies (Must Honor)

✅ **Enforced Constraints:**
1. **Forward-Only Change Policy** — Refactor docs/code without legacy stubs; update all inbound links (PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION)
2. **Glossary & Prompt Language Alignment** — Use exact canonical names (WaButton, WaInput, WaCluster, WaStack, WaIconButton, WaPage)
3. **Fluent API Strategy: CRTP Only** — Use Curiously Recurring Template Pattern; return `(J)this` for method chaining; no Lombok @Builder
4. **Logging: Log4j2 + Lombok @Log4j2** — Use `@Log4j2` annotation; configure via classpath resources; do not inline Log4j config
5. **Java Module System (JPMS)** — All public APIs declared in `module-info.java`; use `transitive requires` for upstream deps; open packages for reflection (Guice, Jackson)
6. **Reciprocal Links** — All docs linked bidirectionally (PACT → RULES, RULES → GUIDES, GUIDES → IMPLEMENTATION, etc.)
7. **Component Wrapping (Angular Directives)** — Expose inputs as `@Input()` properties (camelCase); outputs as `@Output()` EventEmitters (past-tense verbs); use `ng-content` slot projection
8. **Documentation-as-Code** — Commit Mermaid/PlantUML diagram sources; generate images on-demand; link diagrams from strategic docs
9. **Test Strategy** — Java Micro Harness + JUnit 5; target ≥ 80% coverage (Jacoco); BrowserStack for cross-browser validation (optional)
10. **Build & Deployment** — Enforce Java 25 LTS; Maven parent POM for dependency management; publish to Maven Central (Phase 4)

✅ **Strategic Documents (Authoritative References):**
- **PACT.md** — Project charter, mission, phases, scope, success criteria
- **RULES.md** — Technical/behavioral standards, fluent API rules, logging policy
- **GUIDES.md** — How-to guides for component wrappers, testing, deployment
- **IMPLEMENTATION.md** — Module/package structure, current code map, status
- **GLOSSARY.md** — Terminology index, topic-first precedence, prompt language alignment
- **docs/architecture/** — C4 diagrams, sequence flows, ERD, architecture README
- **docs/PROMPT_REFERENCE.md** — Configuration snapshot linked from all future prompts

✅ **AI Workspace Configuration (GitHub Copilot):**
- `.github/copilot-instructions.md` — Pinned constraints and STOP-gate policy
- Mermaid MCP server registered for diagram generation

---

## 1) Self‑Configure the AI Engine (GitHub Copilot)

- ✅ Pin `.github/copilot-instructions.md` anchors (RULES sections 4,5, Document Modularity, Forward-Only)
- ✅ Operate in forward-only mode (breaking changes allowed; no legacy stubs)
- ✅ Register Mermaid MCP server: HTTP `https://mcp.mermaidchart.com/mcp` (type `http`) for diagram generation
- ✅ Language selection → Java 25 LTS rules applied (link: rules/generative/language/java/java-25.rules.md)
- ✅ Fluent API: CRTP only (no Lombok @Builder)
- ✅ Angular 20 integration via Angular Awesome directives (link: rules/generative/frontend/angular-awesome/README.md)
- ✅ WebAwesome component wrapping (link: rules/generative/frontend/webawesome/README.md)

---

## 2) Library Documentation Tasks
**Perform as forward-only change set. Store in library repo root or docs/ (not inside rules/ submodule).**

### 2.1 Topic Index (Parent README)
Create/update a topic index README for this library's component rules:
- Index each component with links to individual rule files:
  - `docs/rules/wa-page.rules.md` — WaPage layout container
  - `docs/rules/wa-input.rules.md` — WaInput form input
  - `docs/rules/wa-select.rules.md` — WaSelect form select
  - `docs/rules/wa-button.rules.md` — WaButton action button
  - `docs/rules/wa-icon-button.rules.md` — WaIconButton icon-only button
  - `docs/rules/wa-cluster.rules.md` — WaCluster horizontal layout
  - `docs/rules/wa-stack.rules.md` — WaStack vertical layout
  - `docs/rules/wa-card.rules.md` — WaCard (Phase 3+)
  - `docs/rules/wa-badge.rules.md` — WaBadge (Phase 3+)
  - `docs/rules/wa-icon.rules.md` — WaIcon (Phase 3+)
- For each component, summarize purpose, key inputs/outputs, slot support, and link to detailed rule file

### 2.2 Modularize Content
- Split monolithic docs into smaller modular files (one component or topic per file)
- Use kebab-case filenames; format: `<component-name>.rules.md`
- Remove obsolete docs (forward-only); update all references

### 2.3 Rules Templates (Components)
For each component/topic, create a `.rules.md` file with:
- **Overview** — Purpose and place in the component hierarchy
- **JWebMP Java Class** — Canonical class name, package, module declaration
- **Usage Patterns** — Minimal code examples (Java fluent API)
- **Inputs/Outputs** — For Angular: @Input properties (camelCase), @Output EventEmitters (past-tense verbs)
- **Slot Projection** — Named slots for ng-content; semantic HTML attributes (e.g., `[waPageBanner]`)
- **Styling/Theming** — CSS custom properties (if applicable), WebAwesome variant support
- **Accessibility** — ARIA roles, keyboard navigation, screen-reader considerations
- **See-Also Links** — Parent index, related rules, architecture reference

### 2.4 Cross-Links to Enterprise Rules Repository
Link to relevant topics in the Rules Repository to aid host projects:

**Frontend (Standard):**
- Web Components: `rules/generative/frontend/webcomponents/README.md`
- WebAwesome: `rules/generative/frontend/webawesome/README.md`
- JWebMP: `rules/generative/frontend/jwebmp/README.md`
- JWebMP Client: `rules/generative/frontend/jwebmp/client/README.md`
- JWebMP Angular: `rules/generative/frontend/jwebmp/angular/README.md`
- JWebMP WebAwesome wrapper: `rules/generative/frontend/jwebmp/webawesome/README.md`

**Frontend (Reactive):**
- Angular: `rules/generative/language/angular/README.md`
- Angular Awesome: `rules/generative/frontend/angular-awesome/README.md`

**Backend:**
- Hibernate: `rules/generative/backend/hibernate/README.md`
- Quarkus: `rules/generative/backend/quarkus/README.md`
- GuicedEE: `rules/generative/backend/guicedee/README.md`
- Logging: `rules/generative/backend/logging/README.md`

**Language:**
- Java 25 LTS: `rules/generative/language/java/java-25.rules.md`
- TypeScript: `rules/generative/language/typescript/README.md`

**Architecture:**
- DDD: `rules/generative/architecture/ddd/README.md`
- Specification-Driven Design: `rules/generative/architecture/README.md`

**Platform:**
- CI/CD: `rules/generative/platform/ci-cd/README.md`
- GitHub Actions: `rules/generative/platform/ci-cd/providers/github-actions.md`

### 2.5 Versioning and Release Notes
- Update CHANGELOG.md with breaking changes (if applicable)
- Prepare RELEASE_NOTES.md summarizing rules reorganization
- Bump semantic version in pom.xml

### 2.6 README (Library Root) Updates
Add/update sections in root README.md:
- **"How to Use These Rules"** — Point to topic index and Rules Repository submodule
- **"Prompt Language Alignment & Glossary"** — Link to GLOSSARY.md; state that it is the authoritative, minimal glossary for this library with LLM interpretation guidance (topic-first)
- **"Component Index"** — Table of all wrapped components with status (Phase 1, Phase 2, etc.)

### 2.7 Architecture Diagrams (Docs-as-Code)
Maintain under `docs/architecture/`:
- **C4-Context** (`c4-context.md`) — Ecosystem position (WebAwesome, JWebMP, Angular integration)
- **C4-Container** (`c4-container.md`) — Major modules (JWebMP wrapper plugin, Angular directives, page configurator)
- **C4-Component** (`c4-component-layout.md`) — WaPage sub-components and layout structure
- **Sequence Diagrams** — Page load flow, navigation toggle, component binding
- **ERD** (if applicable) — Data structures, domain model
- **Architecture README** (`docs/architecture/README.md`) — Index and navigation

All diagrams use Mermaid or PlantUML (source format committed; images generated on-demand).

### 2.8 AI Workspace Configuration (GitHub Copilot)
Ensure `.github/copilot-instructions.md` is pinned with:
- RULES sections 4,5, Document Modularity Policy, Forward-Only
- Stage-gated workflow (STOP checkpoints at Stage 1, 2, 3; auto-approved Stage 4 due to blanket approval)
- Mermaid MCP server registration (HTTP `https://mcp.mermaidchart.com/mcp`)

---

## 3) Special Guidance — WebAwesome UI Component Library

### 3.1 Component Wrapping Pattern
Each WebAwesome component is wrapped in two layers:
1. **JWebMP Java Class** (extends `com.jwebmp.core.base.ComponentBase`)
   - CRTP fluent setters returning `(J)this`
   - Method access for sub-components via lazy initialization
   - Slot projection via named semantic attributes

2. **Angular Directive** (via angular-awesome plugin)
   - `@Input()` properties (camelCase) for component attributes
   - `@Output()` EventEmitters (past-tense verbs) for native events
   - `@ViewChild()` for method access to underlying JWebMP component
   - `ng-content select="[slotAttribute]"` for projection

### 3.2 Prompt Language Alignment (Canonical Names)
All examples and documentation must use exact canonical names:
- `WaPage` — Page layout container
- `WaInput` — Form input component
- `WaSelect` — Form select component
- `WaButton` — Action button component
- `WaIconButton` — Icon-only button component
- `WaCluster` — Horizontal layout container (flex row)
- `WaStack` — Vertical layout container (flex column)
- `WaCard` — Card container (future)
- `WaBadge` — Badge component (future)
- `WaIcon` — Icon component (future)

### 3.3 Component Rules File Structure
For each component, create `<component-name>.rules.md`:

```markdown
# WaComponent Rules

## Overview
[Purpose, key use cases, place in hierarchy]

## JWebMP Java Class
- Canonical name: `com.jwebmp.webawesomepro.components.<domain>.WaComponent`
- Module: `com.jwebmp.webawesomepro`
- Extends: `ComponentBase`

## Fluent API Pattern (CRTP)
```java
WaComponent comp = new WaComponent()
    .setProperty(value)
    .addChild(new WaChild())
    .doSomething();
```

## Inputs & Outputs (Angular Directive)
- `@Input() property: Type` — Description
- `@Output() eventName = new EventEmitter<T>()` — When fired, meaning

## Slot Projection
- Named slots: `[waComponentSlot1]`, `[waComponentSlot2]`, etc.
- Default content supported: yes/no

## Styling & Theming
- CSS Custom Properties: `--wa-component-color`, etc.
- Variants: outlined, filled, etc.

## Accessibility
- ARIA roles: button, navigation, etc.
- Keyboard support: Tab, Enter, Escape, etc.

## See Also
- Parent index: [link to component README]
- Related rules: [links to related components]
- Architecture: [link to C4 diagram]
```

### 3.4 Component Status Tracking
Update IMPLEMENTATION.md with:
- **Phase 1** (Foundation) — Architecture, rules, guides, strategic docs
- **Phase 2** (WaPage) — ✅ Complete (18 sub-components, 13 tests)
- **Phase 3** (Additional Components) — WaInput, WaSelect, WaButton, WaCluster, WaStack, etc.
- **Phase 4** (Production Release) — Maven Central publication, v1.0.0 stable

---

## 4) Output Checklist

- [ ] Topic index README created/updated (component list with links)
- [ ] Modular `.rules.md` files created for each component (WaPage, WaInput, WaSelect, WaButton, WaCluster, WaStack, WaIconButton)
- [ ] Monolithic docs removed; all references updated (forward-only policy)
- [ ] Component `.rules.md` files include: overview, JWebMP class, usage patterns, inputs/outputs, slots, styling, accessibility, see-also
- [ ] Cross-links to Rules Repository topic indexes included (Java 25, TypeScript, Angular, WebAwesome, JWebMP, GuicedEE, etc.)
- [ ] CRTP fluent API pattern documented and enforced (no Lombok @Builder)
- [ ] Lombok @Log4j2 usage documented (logging policy)
- [ ] JPMS (module-info.java) exports and opens documented
- [ ] Topic GLOSSARY.md created/updated (topic-first, minimal duplication) with Prompt Language Alignment for canonical component names
- [ ] Root README updated with "How to Use These Rules" and "Prompt Language Alignment" sections
- [ ] Architecture diagrams under `docs/architecture/` committed (Mermaid/PlantUML sources)
  - [ ] C4-Context diagram
  - [ ] C4-Container diagram
  - [ ] C4-Component diagram(s)
  - [ ] Sequence diagrams (page load, navigation, binding)
  - [ ] docs/architecture/README.md with navigation
- [ ] docs/PROMPT_REFERENCE.md created/updated with config snapshot and diagram links
- [ ] CHANGELOG.md and semantic version bumped
- [ ] AI workspace files committed for GitHub Copilot (`.github/copilot-instructions.md`)
- [ ] All links resolve (no broken references)
- [ ] PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION loop closed

---

## 5) Guardrails

- ✅ **No backwards compatibility stubs** — Apply Forward-Only Change Policy fully
- ✅ **Canonical Component Names** — Use exact terms in prompts/examples (WaButton, WaInput, WaCluster, WaStack, WaIconButton, WaPage)
- ✅ **CRTP Only** — No Lombok @Builder for fluent setters; use manual CRTP returning `(J)this`
- ✅ **Log4j2 + @Log4j2** — Use Lombok's `@Log4j2` annotation; configure via classpath resources
- ✅ **JPMS Mandatory** — All public APIs declared in `module-info.java`; open packages for reflection
- ✅ **Keep library docs in library repo** — Outside rules/ submodule (PACT, RULES, GUIDES, IMPLEMENTATION, docs/, etc. at repo root)
- ✅ **Close loops** — Index ↔ rules files ↔ examples/implementations ↔ architecture diagrams
- ✅ **Test coverage ≥ 80%** (Jacoco) — All test files under `src/test/java/` with JUnit 5 + Java Micro Harness
- ✅ **Forward-Only component evolution** — Phase 1 (foundation), Phase 2 (WaPage), Phase 3 (additional), Phase 4 (release)

---

## 6) AI Response Format (Blanket Approval — No STOP Gates)

Since blanket approval is granted for this run:

1. **Stage 1 (Architecture & Foundations)** — Deliver docs; no STOP gate
2. **Stage 2 (Rules/Guides Design)** — Deliver docs; no STOP gate
3. **Stage 3 (Implementation Plan)** — Deliver plan; no STOP gate
4. **Stage 4 (Implementation)** — Execute changes; present diffs and validation

For each stage:
- Deliver file paths and working links
- Summarize decisions, open questions, risks
- Continue to next stage without waiting for user approval

---

## Diagrams and Docs-as-Code Policy (Mandatory)

All strategic documentation is backed by versioned, human-readable diagram sources.

### Required Artifacts (Docs-as-Code)

- **C4 Architecture** (Mermaid/PlantUML)
  - **Level 1 (Context):** Library position, upstream (WebAwesome), downstream (JWebMP core, Angular), external integrations
  - **Level 2 (Container):** Modules — JWebMP wrapper plugin, Angular directives, page configurator, component sub-packages
  - **Level 3 (Component):** WaPage sub-components (Banner, Header, Navigation, Main, Aside, Footer, etc.)

- **Sequence Diagrams**
  - Page load and initialization flow
  - Navigation toggle/collapse behavior
  - Angular property binding lifecycle
  - Component slot projection

- **ERD (if applicable)**
  - Component hierarchy (inheritance/composition)
  - Data structures for page metadata

- **Deployment/Distribution**
  - Maven artifact coordinates
  - Module system (JPMS) declarations
  - Service providers (IPageConfigurator, IGuiceScanModuleInclusions)

### Format and Storage (Docs-as-Code)

**Text Format (Diff-Friendly):**
- Mermaid (preferred) fenced blocks (```mermaid`)
  - Node names without parentheses `(` or `)`; use plain names
- PlantUML (.puml) or fenced blocks (```plantuml`)

**Storage (Library Repo, Outside rules/):**
- `docs/architecture/README.md` — Index of all diagrams
- `docs/architecture/c4-context.md` — C4 Level 1
- `docs/architecture/c4-container.md` — C4 Level 2
- `docs/architecture/c4-component-layout.md` — C4 Level 3 (WaPage layout)
- `docs/architecture/sequence-page-load.md` — Page initialization sequence
- `docs/architecture/sequence-nav-toggle.md` — Navigation toggle sequence
- `docs/architecture/erd-domain.md` — Entity/component hierarchy
- Optional: `docs/architecture/img/` for generated images (never commit images without sources)

**Version Control:**
- Commit diagram sources (Mermaid/PlantUML) ✅
- Do not commit rendered images unless sources are also committed ❌

### Prompt Seeding and Traceability

Create/update `docs/PROMPT_REFERENCE.md`:
- Selected stacks (Java 25 LTS, Angular 20, WebAwesome, JWebMP, GuicedEE)
- Supported versions (com.jwebmp.plugins:web-awesome-pro 2.0.0-SNAPSHOT, etc.)
- Glossary composition (topic-first precedence: WebAwesome canonical names)
- Links to all diagrams under `docs/architecture/`
- Reference this file in all future prompts for this library

---

## Quick Start: Running This Prompt

1. **Load Strategic Docs:** Open PACT.md, RULES.md, GUIDES.md, IMPLEMENTATION.md, GLOSSARY.md in your editor
2. **Review Architecture:** Check docs/architecture/README.md and referenced diagrams
3. **Confirm Java Version:** Verify Java 25 LTS is enforced in pom.xml (parent POM)
4. **Register MCP Servers:** Confirm Mermaid MCP is available (HTTP `https://mcp.mermaidchart.com/mcp`)
5. **Ask Copilot:** Paste this prompt and specify the task (e.g., "Add WaInput component rules" or "Update architecture diagrams for Phase 3")
6. **Review & Commit:** Check diffs, validate links, commit forward-only change set

---

**Last Updated:** December 3, 2025  
**Version:** 2.0 (WebAwesome Pro)  
**Status:** Blanket approval for Stage 1–4  
**Next Action:** Select a task (e.g., "Create WaInput component rules") and run the prompt with Copilot

---

**Approval Record:**
- ✅ Blanket approval granted (no STOP gates)
- ✅ Forward-only mode enabled
- ✅ CRTP fluent API enforced (no @Builder)
- ✅ Log4j2 + @Log4j2 policy active
- ✅ JPMS module system required
- ✅ GitHub Copilot workspace configured (`.github/copilot-instructions.md`)
- ✅ Mermaid MCP server available
