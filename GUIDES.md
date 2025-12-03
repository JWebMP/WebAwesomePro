# WebAwesome Pro – Development Guides

**Version:** 1.0  
**Effective Date:** December 2, 2025  

---

## Overview

This document provides step-by-step guides for implementing, testing, and deploying WebAwesome Pro components. Each section links back to RULES.md for constraints and IMPLEMENTATION.md for architecture.

### Quick Links
- **[Component Rules Index](docs/rules/README.md)** – Master index with modular rules for each component (WaPage, WaInput, WaButton, etc.)
- **[RULES.md](RULES.md)** – Project standards and constraints
- **[IMPLEMENTATION.md](IMPLEMENTATION.md)** – Code organization and module map
- **[GLOSSARY.md](GLOSSARY.md)** – Terminology index and prompt language alignment

---

---

## Guide Index

### Component Wrappers
- [Guide: Create an Angular Directive Wrapper](#guide-create-an-angular-directive-wrapper)
- [Guide: Expose Component Inputs & Outputs](#guide-expose-component-inputs--outputs)
- [Guide: Implement Slot Projection](#guide-implement-slot-projection)
- [Guide: Access Native Methods via ViewChild](#guide-access-native-methods-via-viewchild)

### Testing & Validation
- [Guide: Unit Test Angular Directives](#guide-unit-test-angular-directives)
- [Guide: Browser Testing with BrowserStack](#guide-browser-testing-with-browserstack)

### Build & Deployment
- [Guide: Configure Maven Build](#guide-configure-maven-build)
- [Guide: Set Up GitHub Actions CI/CD](#guide-set-up-github-actions-cicd)
- [Guide: Release to Maven Central](#guide-release-to-maven-central)

### Documentation
- [Guide: Update Architecture Diagrams](#guide-update-architecture-diagrams)
- [Guide: Maintain Reciprocal Links](#guide-maintain-reciprocal-links)

---

## Guide: Create an Angular Directive Wrapper

### Goal
Wrap a WebAwesome web component (e.g., `<wa-page>`) as an Angular directive that exposes inputs, outputs, and slots.

### Steps

#### 1. Create the Directive Class
```typescript
import { Directive, Input, Output, EventEmitter, ViewChild, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: 'wa-page',  // Matches <wa-page> custom element
  standalone: true
})
export class WaPageDirective {
  @Input() mobileBreakpoint: string | number = '768px';
  @Input() navOpen: boolean = false;
  @Input() view: 'mobile' | 'desktop' = 'desktop';
  @Input() disableSticky: string = '';
  @Input() navigationPlacement: 'start' | 'end' = 'start';
  
  @Input() set menuWidth(value: string) {
    this.elementRef.nativeElement.style.setProperty('--menu-width', value);
  }
  @Input() set mainWidth(value: string) {
    this.elementRef.nativeElement.style.setProperty('--main-width', value);
  }
  @Input() set asideWidth(value: string) {
    this.elementRef.nativeElement.style.setProperty('--aside-width', value);
  }
  
  @Output() navToggle = new EventEmitter<boolean>();
  
  @ViewChild('nativeElement') nativeElement!: ElementRef;

  constructor(private elementRef: ElementRef) {}

  showNavigation(): void {
    this.elementRef.nativeElement.showNavigation();
  }

  hideNavigation(): void {
    this.elementRef.nativeElement.hideNavigation();
  }

  toggleNavigation(): void {
    this.elementRef.nativeElement.toggleNavigation();
  }

  @HostListener('navToggle', ['$event'])
  onNavToggle(event: CustomEvent<boolean>): void {
    this.navToggle.emit(event.detail);
  }
}
```

#### 2. Template with ng-content Slots
```html
<wa-page
  [mobileBreakpoint]="920"
  [navOpen]="navDrawerOpen"
  [menuWidth]="'15rem'"
  [asideWidth]="'20rem'"
  (navToggle)="onNavToggle($event)"
>
  <div *ngIf="hasBanner" slot="banner">Banner content</div>
  <header slot="header">Header content</header>
  <main>Main page content</main>
  <aside slot="aside">Sidebar content</aside>
  <footer slot="footer">Footer content</footer>
</wa-page>
```

#### 3. Register in Angular Module
```typescript
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WaPageDirective } from './wa-page.directive';

@NgModule({
  declarations: [WaPageDirective],
  imports: [CommonModule],
  exports: [WaPageDirective]
})
export class WebAwesomeModule { }
```

### Validation
- [ ] Directive compiles with TypeScript strict mode
- [ ] All @Input properties are camelCase and documented
- [ ] @Output events are named with past-tense verbs (navToggle, buttonClicked)
- [ ] Template examples render in the browser
- [ ] No console warnings for unknown attributes

### Related Documents
- **RULES.md § 4.6:** Component Wrapping & Angular Integration
- **RULES.md § 5.5:** Angular Version
- **docs/page.rules.md:** wa-page example

---

## Guide: Expose Component Inputs & Outputs

### Goal
Map native web component properties and events to Angular @Input and @Output, following Angular conventions.

### Pattern
```typescript
// Input: property binding
@Input() set menuWidth(value: string) {
  this.elementRef.nativeElement.style.setProperty('--menu-width', value);
}

// Output: event emission
@Output() navToggle = new EventEmitter<boolean>();

@HostListener('navToggle', ['$event'])
onNavToggle(event: CustomEvent<boolean>): void {
  this.navToggle.emit(event.detail);
}
```

### Naming Conventions
- **Inputs:** camelCase, verb-free (e.g., `menuWidth`, not `setMenuWidth`)
- **Outputs:** camelCase, past-tense verb (e.g., `navToggle`, `buttonClicked`)
- **CSS Properties:** linked via `style.setProperty('--property-name', value)`

### Validation
- [ ] All properties documented in JSDoc
- [ ] Input types are specific (not `any`)
- [ ] Output EventEmitter is typed (not `any`)

### Related Documents
- **RULES.md § 5.6:** TypeScript & Component Compilation
- **docs/page.rules.md:** Input/Output table

---

## Guide: Implement Slot Projection

### Goal
Use Angular `ng-content` with slot attribute selectors to project content into WebAwesome component slots.

### Pattern
```html
<ng-content select="[waPageBanner]"></ng-content>
<ng-content select="[waPageHeader]"></ng-content>
<ng-content select="[waPageNavigation]"></ng-content>
<ng-content></ng-content>  <!-- Default slot for main content -->
<ng-content select="[waPageAside]"></ng-content>
<ng-content select="[waPageFooter]"></ng-content>
```

### Usage in Component
```html
<wa-page>
  <div waPageBanner>Banner content</div>
  <header waPageHeader>Header content</header>
  <nav waPageNavigation>Navigation links</nav>
  <main>This goes to the default slot</main>
  <aside waPageAside>Sidebar</aside>
  <footer waPageFooter>Footer</footer>
</wa-page>
```

### Why Attribute Selectors?
- Semantic (clearly marks slot purpose)
- SEO-friendly (no hidden markup)
- Avoids ambiguity with other slot mechanisms

### Validation
- [ ] Each slot has a corresponding attribute selector
- [ ] Default slot (no selector) is last in template
- [ ] Slot attributes are consistent (waPageXxx naming)
- [ ] Documentation lists all available slots

### Related Documents
- **RULES.md § 4.6:** Slots use attribute selectors
- **docs/page.rules.md:** Slot Selectors table

---

## Guide: Access Native Methods via ViewChild

### Goal
Expose native web component methods (e.g., `showNavigation()`) via Angular directives.

### Pattern
```typescript
@ViewChild('nativeElement') nativeElement!: ElementRef;

showNavigation(): void {
  this.elementRef.nativeElement.showNavigation();
}

toggleNavigation(): void {
  this.elementRef.nativeElement.toggleNavigation();
}
```

### Usage
```typescript
export class MyPageComponent {
  @ViewChild(WaPageDirective) waPage!: WaPageDirective;

  openNav(): void {
    this.waPage.showNavigation();
  }

  closeNav(): void {
    this.waPage.hideNavigation();
  }
}
```

### Validation
- [ ] Methods are public and documented
- [ ] Method names match native element API (no renaming without reason)
- [ ] Type safety is maintained (no `any` casts)

### Related Documents
- **RULES.md § 5.6:** TypeScript Type Safety

---

## Guide: Unit Test Angular Directives

### Goal
Test Angular directive inputs, outputs, and slot projection using Angular testing utilities.

### Pattern
```typescript
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Component, DebugElement } from '@angular/core';
import { By } from '@angular/platform-browser';
import { WaPageDirective } from './wa-page.directive';

@Component({
  template: \`
    <wa-page
      [mobileBreakpoint]="920"
      [navOpen]="navOpen"
      (navToggle)="onNavToggle($event)"
    >
      <div waPageBanner>Test Banner</div>
      <main>Test Content</main>
    </wa-page>
  \`,
  standalone: true,
  imports: [WaPageDirective, CommonModule]
})
class TestComponent {
  navOpen = false;
  onNavToggle(open: boolean) { this.navOpen = open; }
}

describe('WaPageDirective', () => {
  let component: TestComponent;
  let fixture: ComponentFixture<TestComponent>;
  let waPageElement: DebugElement;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TestComponent, WaPageDirective]
    }).compileComponents();

    fixture = TestBed.createComponent(TestComponent);
    component = fixture.componentInstance;
    waPageElement = fixture.debugElement.query(By.directive(WaPageDirective));
    fixture.detectChanges();
  });

  it('should bind mobileBreakpoint input', () => {
    const nativeElement = waPageElement.nativeElement;
    expect(nativeElement.getAttribute('mobilebreakpoint')).toBe('920');
  });

  it('should project banner slot', () => {
    const banner = waPageElement.nativeElement.querySelector('[waPageBanner]');
    expect(banner?.textContent).toContain('Test Banner');
  });
});
```

### Test Coverage Goals
- Input binding (properties and styles)
- Output events
- Slot projection
- Method invocation
- Error handling

### Validation
- [ ] All tests pass with `ng test`
- [ ] Coverage ≥ 80% (Jacoco for Java)
- [ ] No console warnings

### Related Documents
- **RULES.md § 5.7:** Testing Strategy

---

## Guide: Configure Maven Build

### Goal
Set up Maven to build, test, and package the WebAwesome Pro plugin.

### Build Commands
```bash
# Clean build
mvn clean install

# Run tests with coverage
mvn clean test jacoco:report

# Package JAR
mvn package

# Deploy to Maven Central (requires credentials)
mvn deploy
```

### Validation
- [ ] Build succeeds with no errors
- [ ] All tests pass
- [ ] JAR is created and contains expected classes
- [ ] Module descriptor validates (JPMS)

### Related Documents
- **RULES.md § 5.1:** Build & Dependency Management
- **rules/generative/language/java/java-25.rules.md:** Java 25 specifics

---

## Guide: Set Up GitHub Actions CI/CD

### Goal
Create a GitHub Actions workflow to build, test, and (optionally) publish on every commit.

### Workflow File: `.github/workflows/build.yml`
```yaml
name: Build and Test

on:
  push:
    branches: [ master, develop ]
  pull_request:
    branches: [ master, develop ]

jobs:
  build:
    runs-on: ubuntu-latest
    strategy:
      matrix:
        java-version: [ '25' ]
    steps:
      - uses: actions/checkout@v3
      
      - name: Set up Java
        uses: actions/setup-java@v3
        with:
          java-version: ${{ matrix.java-version }}
          distribution: 'temurin'
      
      - name: Build with Maven
        run: mvn clean install
      
      - name: Run Tests
        run: mvn test
      
      - name: Generate Coverage Report
        run: mvn jacoco:report
      
      - name: Deploy Snapshot
        if: github.ref == 'refs/heads/develop'
        run: mvn deploy
        env:
          MAVEN_USERNAME: ${{ secrets.MAVEN_USERNAME }}
          MAVEN_PASSWORD: ${{ secrets.MAVEN_PASSWORD }}
```

### Required Secrets
- `MAVEN_USERNAME`: Sonatype username
- `MAVEN_PASSWORD`: Sonatype password

### Validation
- [ ] Workflow runs successfully on push/PR
- [ ] Tests pass and coverage is reported

### Related Documents
- **rules/generative/platform/ci-cd/providers/github-actions.md:** Provider details

---

## Guide: Release to Maven Central

### Goal
Publish WebAwesome Pro to Maven Central Repository.

### Prerequisites
1. Sonatype JIRA account (OSS hosting)
2. GPG key for code signing
3. Credentials configured in `~/.m2/settings.xml`

### Steps
1. Update version in `pom.xml` (remove `-SNAPSHOT`)
2. Tag commit: `git tag v2.0.0`
3. Run release: `mvn clean deploy -Prelease`
4. Follow Sonatype release process (close and release staging repo)

### Validation
- [ ] JAR and sources are signed with GPG
- [ ] Artifact appears in Maven Central (allow 1-2 hours for sync)

---

## Guide: Update Architecture Diagrams

### Goal
Keep C4, sequence, and ERD diagrams in sync with code changes.

### Process
1. Modify the Mermaid/PlantUML source in `docs/architecture/*.md`
2. Update reciprocal links in PACT.md, RULES.md, GUIDES.md, IMPLEMENTATION.md
3. Commit source files (never commit generated images)

### Validation
- [ ] Diagram renders without errors
- [ ] All links in docs still resolve

### Related Documents
- **docs/architecture/README.md:** Full diagram index

---

## Guide: Maintain Reciprocal Links

### Goal
Ensure all PACT ↔ RULES ↔ GUIDES ↔ IMPLEMENTATION links are current and bidirectional.

### Checklist
- [ ] PACT.md links to RULES.md, GUIDES.md, IMPLEMENTATION.md, GLOSSARY.md
- [ ] RULES.md links back to PACT.md and links to relevant enterprise rules
- [ ] GUIDES.md references RULES.md for constraints and IMPLEMENTATION.md for code locations
- [ ] IMPLEMENTATION.md maps code to GUIDES.md
- [ ] GLOSSARY.md is linked by all strategic docs
- [ ] Architecture diagrams in `docs/architecture/` are referenced
- [ ] No broken links (validate manually or via CI)

### Validation
- [ ] All links work (test manually)
- [ ] No orphaned docs

---

**Last Updated:** December 2, 2025  
**Approval:** Blanket approval (Stage 2 auto-approved)
