import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponentWithInlineStyleComponent } from './component-with-inline-style.component';

describe('ComponentWithInlineStyleComponent', () => {
  let component: ComponentWithInlineStyleComponent;
  let fixture: ComponentFixture<ComponentWithInlineStyleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComponentWithInlineStyleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponentWithInlineStyleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
