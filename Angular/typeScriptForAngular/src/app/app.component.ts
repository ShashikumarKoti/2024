import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular basic pipes';
  today = Date();
  user={
    name: 'shashi',
    age: 35
  }

  convertStringToUpperCase(item:string){
   return  item.toUpperCase();
  }


}
