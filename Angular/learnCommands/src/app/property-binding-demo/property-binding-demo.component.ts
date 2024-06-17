import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding-demo',
  templateUrl: './property-binding-demo.component.html',
  styleUrls: ['./property-binding-demo.component.css']
})
export class PropertyBindingDemoComponent{

  constructor() { }

  title = "Property Binding";
  name = "Shashi";
  disable = false;

  title2 ="If-else condition"
  show=true
  showScenario2=true

}
