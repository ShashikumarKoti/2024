import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component-with-inline-template',
  template: `
    <h1 class="custom">
      component-with-inline-template works!
    </h1>
  `,
  styleUrls: ['./component-with-inline-template.component.css']
})
export class ComponentWithInlineTemplateComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
