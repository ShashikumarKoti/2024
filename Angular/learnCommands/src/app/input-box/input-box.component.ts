import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-input-box',
  templateUrl: './input-box.component.html',
  styleUrls: ['./input-box.component.css']
})
export class InputBoxComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  displayVal : string = '';
  displayValOnClick : string = '';
  getTextBoxValue(val: string) {
    console.warn(val)
    this.displayVal = val;
  }

  getTextBoxValueOnButtonClick(val: string) {
    this.displayValOnClick = val;
  }

}
