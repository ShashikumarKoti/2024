import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentWithInlineTemplateComponent } from './component-with-inline-template.component';

describe('ComponentWithInlineTemplateComponent', () => {
  let component: ComponentWithInlineTemplateComponent;
  let fixture: ComponentFixture<ComponentWithInlineTemplateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComponentWithInlineTemplateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponentWithInlineTemplateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
