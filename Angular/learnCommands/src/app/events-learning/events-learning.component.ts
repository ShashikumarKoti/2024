import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-events-learning',
  templateUrl: './events-learning.component.html',
  styleUrls: ['./events-learning.component.css']
})
export class EventsLearningComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  getData(name: string) {
    console.warn(name);
  }

  getDataAsTypedInSearchBox(name: string) {
    console.warn(name);
  }

  getMouseOverData() {
    console.warn("Mouse over event called");
  }

  getMouseLeaveData(mouseLeaveData: string) {
    console.warn(mouseLeaveData)
  }

  multipleEvents(text: string) {
    console.warn(text)
  }

}
