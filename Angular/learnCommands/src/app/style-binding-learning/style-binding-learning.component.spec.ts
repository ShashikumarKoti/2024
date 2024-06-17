import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StyleBindingLearningComponent } from './style-binding-learning.component';

describe('StyleBindingLearningComponent', () => {
  let component: StyleBindingLearningComponent;
  let fixture: ComponentFixture<StyleBindingLearningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StyleBindingLearningComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StyleBindingLearningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
