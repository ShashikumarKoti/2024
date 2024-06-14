import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component-with-inline-style',
  templateUrl: './component-with-inline-style.component.html',
  styles: [
    '.custom{color:red}'
  ]
})
export class ComponentWithInlineStyleComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
