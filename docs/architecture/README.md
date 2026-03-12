# WebAwesome Pro Architecture Documentation

This directory contains architecture diagrams and decision records for the WebAwesome Pro JWebMP plugin.

## Diagrams (Docs-as-Code)

All diagrams are version-controlled as Mermaid source files for traceability and diffability.

### Context & Containers
- [C4 Context](c4-context.md) – System boundary, external dependencies
- [C4 Container](c4-container.md) – Major components and communication
- [C4 Component: Layout](c4-component-layout.md) – Deep dive into wa-page wrapper

### Flows & Interactions
- [Sequence: Page Load](sequence-page-load.md) – Full page initialization
- [Sequence: Navigation Toggle](sequence-nav-toggle.md) – Mobile drawer interaction

### Data & Domain
- [Entity Relationship Diagram](erd-domain.md) – Core data model
- [Dependencies & Integration](dependencies.md) – Maven/GuicedEE/Angular bindings

## Legend

- **C4 Model:** Context (L1), Container (L2), Component (L3)
  - Reference: https://c4model.com/
- **Mermaid MCP Server:** Diagrams are generated and validated via Mermaid HTTP/SSE endpoint
- **Sequence Diagrams:** Critical flows with async/boundary markers
- **ERD:** Data ownership, bounded contexts, lifecycles

## Conventions

1. **Diagram Source First:** Always commit `.md` files with Mermaid/PlantUML; images are derived
2. **Naming:** Mermaid node names must not contain parentheses `()` or brackets `[]`
3. **Scope:** Diagrams document observed architecture only; proposals are marked as such

## References

- **[WebAwesome Documentation](https://www.webawesome.io/)** — Official WebAwesome documentation
- **[JWebMP Home](https://jwebmp.com/)** — JWebMP framework documentation
- **[Source Code](../../src/main/java/)** — Current implementation
