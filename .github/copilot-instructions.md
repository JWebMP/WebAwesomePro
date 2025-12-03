# GitHub Copilot Workspace Instructions

**Version:** 1.0  
**Effective Date:** December 2, 2025  
**Repository:** WebAwesome Pro JWebMP Plugin  

---

## Preamble

This file establishes constraints and policies for GitHub Copilot when generating code, documentation, or architecture for the WebAwesome Pro project. All AI-assisted development must honor these rules before committing changes.

---

## Reference Documents

Before generating any code or documentation, load and understand:

1. **docs/PROMPT_REFERENCE.md** – Configuration snapshot and selected stacks
2. **PACT.md** – Project charter, mission, phases
3. **RULES.md** – Project standards, behavioral/technical constraints
4. **GLOSSARY.md** – Terminology index and LLM prompt alignment
5. **GUIDES.md** – Step-by-step development guides
6. **IMPLEMENTATION.md** – Current code map and status
7. **docs/architecture/README.md** – Architecture diagrams (C4, sequences, ERD)

---

## Key Constraints

### 1. Forward-Only Change Policy
- ✅ Remove/refactor legacy docs when appropriate
- ✅ Update all inbound links when moving/removing artifacts
- ❌ Do NOT keep deprecated docs or compatibility stubs
- ❌ Do NOT maintain "migration guides" for old APIs

### 2. Glossary & Prompt Language Alignment

Use these **exact canonical names** in all prompts and code:

| Concept | Canonical Term |
|---------|---|
| Button Component | `WaButton` |
| Input Component | `WaInput` |
| Page Layout | `WaPage` |
| Horizontal Layout | `WaCluster` |
| Vertical Layout | `WaStack` |
| Icon Button | `WaIconButton` |

### 3. Fluent API Strategy: CRTP Only

- ✅ Use Curiously Recurring Template Pattern (CRTP) for fluent builders
- ✅ Return `(J)this` for method chaining
- ✅ Annotate with `@SuppressWarnings("unchecked")` as needed
- ❌ Do NOT use Lombok `@Builder`
- ❌ Do NOT create non-CRTP builder patterns

### 4. Logging: Log4j2 + Lombok @Log4j2

- ✅ Use Lombok `@Log4j2` annotation for logger injection
- ✅ Delegate to SLF4J facade
- ❌ Do NOT use @Slf4j, @Log, @CommonsLog, or other Lombok logging annotations
- ❌ Do NOT configure Log4j directly in code (use classpath resources)

### 5. Java Module System (JPMS)

- ✅ All public APIs must be declared in `module-info.java`
- ✅ Use `transitive requires` for upstream dependencies
- ✅ Open packages for reflection (Guice, Jackson)
- ✅ Declare `provides` for service provider interfaces (SPI)
- ❌ Do NOT use unnamed modules
- ❌ Do NOT expose internal packages without reason

### 6. Reciprocal Links (PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION)

When updating any strategic document:
- ✅ Update all inbound and outbound links
- ✅ Validate links resolve (no broken refs)
- ✅ Ensure bidirectional references where applicable
- ❌ Do NOT create orphaned docs (all docs must be linked)
- ❌ Do NOT break existing links

### 7. Component Wrapping (Angular Directives)

- ✅ Expose inputs as `@Input()` properties (camelCase)
- ✅ Expose outputs as `@Output()` EventEmitters (past-tense verbs)
- ✅ Use `ng-content select="[slotAttribute]"` for slot projection
- ✅ Use attribute selectors for semantic clarity (e.g., `[waPageBanner]`)
- ✅ Provide method access via `@ViewChild()` or public directive methods
- ❌ Do NOT hide native web component APIs
- ❌ Do NOT rename components without documented reason

### 8. Documentation-as-Code

- ✅ Commit diagram sources (Mermaid/PlantUML `.md` files) to version control
- ✅ Link diagrams from strategic docs (PACT, RULES, GUIDES)
- ✅ Update diagrams when architecture changes
- ❌ Do NOT commit generated images (derive them from sources)
- ❌ Do NOT use ASCII art as primary diagrams (use Mermaid/PlantUML)

### 9. Test Strategy

- ✅ Use Java Micro Harness + JUnit 5 for Java unit tests
- ✅ Target ≥ 80% code coverage (Jacoco)
- ✅ Use BrowserStack for cross-browser Angular component validation (optional)
- ❌ Do NOT skip test setup or use `@Disabled` without reason

### 10. Build & Deployment

- ✅ Enforce Java 25 LTS (no substitution)
- ✅ Use Maven parent POM for dependency management
- ✅ Publish to Maven Central (Phase 4)
- ✅ Use GitHub Actions CI/CD pipeline
- ❌ Do NOT downgrade Java version
- ❌ Do NOT fork/modify parent POM locally

---

## Before Committing Code

1. ✅ All tests pass (`mvn clean test`)
2. ✅ Code compiles with JPMS enabled
3. ✅ Coverage ≥ 80% (Jacoco)
4. ✅ All reciprocal links are updated and resolve
5. ✅ Architecture diagrams are in sync
6. ✅ No deprecation warnings in Java 25 compilation
7. ✅ Javadoc is present for all public classes/methods
8. ✅ Canonical terminology (WaButton, WaInput, etc.) is used consistently

---

## Stage-Gate Policy

The project follows a documentation-first, stage-gated workflow:

- **Stage 1 (Architecture & Foundations):** Diagrams, PACT, RULES, GLOSSARY
- **Stage 2 (Guides & Design Validation):** GUIDES.md, design patterns, API sketches
- **Stage 3 (Implementation Plan):** Module/file structure, scaffolding plan
- **Stage 4 (Implementation & Code):** Code generation (only after Stage 3 approval)

**For This Run:** Blanket approval granted; all stages auto-approved. Document approvals in commit message.

---

## Escalation & Conflicts

If you encounter a conflict between:
- This file and RULES.md → RULES.md wins
- This file and PACT.md → PACT.md wins
- This file and enterprise rules (`rules/RULES.md`) → Enterprise rules win

**Escalate:** Report conflicts to the project lead with full context.

---

## Questions?

Refer to:
- **docs/PROMPT_REFERENCE.md** – Configuration and setup
- **GUIDES.md** – How-to guides for specific tasks
- **RULES.md** – Technical and behavioral standards

---

**Last Updated:** December 2, 2025  
**Version:** 1.0  
**Valid For:** All future code generation on WebAwesome Pro
