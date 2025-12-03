# WebAwesome Pro – Glossary & Terminology Index

**Version:** 1.0  
**Effective Date:** December 2, 2025  
**Composition Model:** Topic-First with Host-Level LLM Alignment  

---

## Overview

This glossary acts as both a **terminology index** and an **enforcer of Prompt Language Alignment** for AI systems. 

### Glossary Precedence Policy
- **Topic Glossaries (Linked)** take precedence for their scope; they are authoritative
- **Host Glossary (This File)** serves as:
  1. An index linking to all topic glossaries
  2. A repository of enforced Prompt Language Alignment mappings (e.g., WaButton, WaInput)
  3. A minimal set of project-specific terms
- **No Duplication:** All other terms are linked (not copied) to avoid divergence

---

## Topic Glossaries (Linked, Authoritative)

When looking up a term, check the relevant topic glossary first (it overrides the host glossary for that scope).

### Frontend & Web Components
1. **JWebMP Client Glossary** → `rules/generative/frontend/jwebmp/client/GLOSSARY.md`
   - Terms: JWebMP, page composition, client-side binding, Angular integration
2. **WebAwesome Components Glossary** → `rules/generative/frontend/webawesome/GLOSSARY.md`
   - Terms: wa-page, wa-button, wa-input, slots, custom elements, web components
3. **Angular Glossary** → `rules/generative/language/angular/GLOSSARY.md`
   - Terms: directive, component, input, output, ng-content, change detection, DI

### Backend & Infrastructure
4. **GuicedEE Glossary** → `rules/generative/backend/guicedee/GLOSSARY.md`
   - Terms: dependency injection, Guice, module scanning, SPI, configuration
5. **Java & Logging Glossary** → `rules/generative/backend/GLOSSARY.md` + `rules/generative/backend/logging/README.md`
   - Terms: Java 25, JPMS (module system), Log4j2, Lombok, JSpecify

### Architecture & Process
6. **Architecture Glossary** → `rules/generative/architecture/GLOSSARY.md`
   - Terms: PACT, specification-driven design, forward-only, documentation-as-code

---

## Enforced Prompt Language Alignment (LLM Mappings)

When prompting any AI system to generate code or docs, use these exact canonical names:

| Concept | Canonical Term | Usage Context | Topic Source |
|---------|---|---|---|
| **Button Component** | `WaButton` | "Create a WaButton with an icon" | WebAwesome |
| **Input Component** | `WaInput` | "Add a WaInput field for email" | WebAwesome |
| **Icon Button** | `WaIconButton` | "Use WaIconButton for toolbar actions" | WebAwesome |
| **Page Layout** | `WaPage` | "Wrap content in WaPage with menu and aside" | WebAwesome |
| **Horizontal Layout** | `WaCluster` | "Use WaCluster to arrange items left-to-right" | WebAwesome |
| **Vertical Layout** | `WaStack` | "Use WaStack to arrange items top-to-bottom" | WebAwesome |
| **Slot Projection** | Slot Projection / `ng-content select` | "Project header content via slot projection" | Angular |
| **CRTP** | CRTP (Curiously Recurring Template Pattern) | "Implement fluent setters using CRTP" | JWebMP/Fluent API |
| **Page Configurator** | `IPageConfigurator` | "Extend IPageConfigurator for runtime setup" | JWebMP |
| **GuicedEE Module** | `IGuiceScanModuleInclusions` | "Register with GuicedEE via IGuiceScanModuleInclusions" | GuicedEE |

---

## Host-Level Project-Specific Terms

These terms are specific to WebAwesome Pro and defined here (not in topic glossaries).

### Core Terms
- **WebAwesome Pro Plugin:** A JWebMP plugin module that wraps WebAwesome web components as Angular directives
- **Angular Wrapper:** An Angular directive (`@Directive`) that exposes a WebAwesome custom element (`<wa-*>`) with Angular-idiomatic inputs, outputs, and content projection
- **Plugin Metadata:** The `@PluginInformation` annotation that registers a JWebMP module with the plugin system
- **Module Descriptor:** `module-info.java` file that declares module exports, requires, and service provider interfaces (SPI)
- **Forward-Only:** Policy to remove/refactor legacy docs without compatibility stubs; all changes propagate via reciprocal links

### Staging & Phases
- **Phase 1 (Foundation):** Architecture docs, RULES, PACT, GLOSSARY, wa-page directive
- **Phase 2 (Core Components):** wa-button, wa-input, wa-select, wa-stack, wa-cluster wrappers
- **Phase 3 (Advanced):** Font Awesome Pro integration, theming guides
- **Phase 4 (Production):** Full test coverage, API docs, GitHub Actions CI/CD, Maven Central release

---

## Example Prompt Queries (Using Alignment)

When asking an AI system for code, phrase queries like this:

**✅ Correct (Uses Canonical Terms)**
- "Create a WaButton directive with click handler"
- "Implement WaInput with email validation"
- "Build a layout using WaPage, WaCluster for headers, and WaStack for sections"
- "Extend IPageConfigurator to register this module"
- "Add CRTP fluent setters to the builder class"

**❌ Incorrect (Generic Terms)**
- "Create a button component" (ambiguous—could mean many things)
- "Build a form input" (should be "WaInput")
- "Make a layout" (should be "WaPage, WaCluster, WaStack")

---

## Quick Reference

| Term | Type | Defined In | Status |
|------|------|-----------|--------|
| WaButton | Component | WebAwesome Glossary | Canonical |
| WaInput | Component | WebAwesome Glossary | Canonical |
| WaPage | Component | WebAwesome Glossary | Canonical |
| WaCluster | Component | WebAwesome Glossary | Canonical |
| WaStack | Component | WebAwesome Glossary | Canonical |
| WaIconButton | Component | WebAwesome Glossary | Canonical |
| IPageConfigurator | Interface | JWebMP Glossary | Canonical |
| IGuiceScanModuleInclusions | Interface | GuicedEE Glossary | Canonical |
| CRTP | Pattern | Fluent API Glossary | Canonical |
| Angular Directive | Concept | Angular Glossary | Canonical |
| Slot Projection | Concept | Angular Glossary | Canonical |
| Forward-Only | Policy | Architecture Glossary | Canonical |

---

## Maintenance

**Updating the Glossary:**
1. Topic glossaries are authoritative; update them first
2. Propagate changes to the host glossary (this file) only if they affect LLM alignment or add project-specific terms
3. Do not duplicate definitions—link instead
4. Use forward-only policy: remove old entries, do not create compat aliases

**For AI Systems:**
- Load this file before generating code or docs
- Consult topic glossaries for full definitions (follow links)
- Use canonical terms in all prompts
- Report missing terms or alignment gaps to the maintainer

---

**Last Updated:** December 2, 2025  
**Version:** 1.0  
**Approval:** Blanket approval (Stage 2 auto-approved)  
**Next Review:** Ongoing; update as new components are added
