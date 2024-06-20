import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'tasks';
  firstInputFromParent=10;
  secondInputFromParent=20;
  todolist: any[] = [];
  name:any;
  
  userDetails=[
    {name : 'Shashi', email: 'sk@gmail.com'},
    {name : 'Arun', email: 'ag@gmail.com'},
    {name : 'Ram', email: 'rp@gmail.com'},
  ]

  addTask(item: string) {

    this.todolist.push({ id: this.todolist.length, name: item });
    console.warn(this.todolist);
  }

  removeTask(id: number) {
    this.todolist = this.todolist.filter(item => item.id !== id);
    console.warn(id);
  }

  updateChildComponent() {
    this.firstInputFromParent= Math.floor(Math.random()*10);
    this.secondInputFromParent= Math.floor(Math.random()*10);
  }

  data="x";
  getDataFromChildComponent(item:string) {
    this.data=item;
  }

  getValue(item:any) {
console.warn(item)
  }

  getValue2(item:HTMLInputElement) {
    console.warn(item)
      }


}
