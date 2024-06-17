import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ForLoopsLearningComponent } from './for-loops-learning.component';

describe('ForLoopsLearningComponent', () => {
  let component: ForLoopsLearningComponent;
  let fixture: ComponentFixture<ForLoopsLearningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ForLoopsLearningComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ForLoopsLearningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
