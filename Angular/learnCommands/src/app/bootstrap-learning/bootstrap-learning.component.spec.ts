import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BootstrapLearningComponent } from './bootstrap-learning.component';

describe('BootstrapLearningComponent', () => {
  let component: BootstrapLearningComponent;
  let fixture: ComponentFixture<BootstrapLearningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BootstrapLearningComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BootstrapLearningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
