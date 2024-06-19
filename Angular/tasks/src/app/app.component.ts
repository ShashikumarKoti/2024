import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'tasks';

  todolist: any[] = [];

  addTask(item: string) {

    this.todolist.push({ id: this.todolist.length, name: item });
    console.warn(this.todolist);
  }

  removeTask(id: number) {
    this.todolist = this.todolist.filter(item => item.id !== id);
    console.warn(id);
  }
}
