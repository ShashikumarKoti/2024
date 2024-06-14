import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventsLearningComponent } from './events-learning.component';

describe('EventsLearningComponent', () => {
  let component: EventsLearningComponent;
  let fixture: ComponentFixture<EventsLearningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventsLearningComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventsLearningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
