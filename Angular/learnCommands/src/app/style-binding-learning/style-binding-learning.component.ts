import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-style-binding-learning',
  templateUrl: './style-binding-learning.component.html',
  styleUrls: ['./style-binding-learning.component.css']
})
export class StyleBindingLearningComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  title="Style Binding"
  colorToBeDisplayed="red";
  greet="Hello there!!!";
  bgColor="green";

  updateColor() {
      this.colorToBeDisplayed="blue";
      this.bgColor="yellow";
  }

}
