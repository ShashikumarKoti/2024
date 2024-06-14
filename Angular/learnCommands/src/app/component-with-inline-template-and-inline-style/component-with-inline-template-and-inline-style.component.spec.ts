import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentWithInlineTemplateAndInlineStyleComponent } from './component-with-inline-template-and-inline-style.component';

describe('ComponentWithInlineTemplateAndInlineStyleComponent', () => {
  let component: ComponentWithInlineTemplateAndInlineStyleComponent;
  let fixture: ComponentFixture<ComponentWithInlineTemplateAndInlineStyleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComponentWithInlineTemplateAndInlineStyleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponentWithInlineTemplateAndInlineStyleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
