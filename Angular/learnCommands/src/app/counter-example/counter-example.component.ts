import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-counter-example',
  templateUrl: './counter-example.component.html',
  styleUrls: ['./counter-example.component.css']
})
export class CounterExampleComponent  {

  title = "Counter with Angular";
  count = 0
  constructor() { }


  counter(type: string) {
    type==='add' ? this.count++ : this.count--;
  }
  

}
