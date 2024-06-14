import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component-with-inline-template-and-inline-style',
  template: `
    <h2 class="custom">
      component-with-inline-template-and-inline-style works!
    </h2>
  `,
  styles: [
    '.custom{color:blue}'
  ]
})
export class ComponentWithInlineTemplateAndInlineStyleComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
