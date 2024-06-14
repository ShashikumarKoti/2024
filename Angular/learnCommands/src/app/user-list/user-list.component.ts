import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

getName()
{
  alert("function called");
}
getNameWithParams(name: string)
{
  alert(name);
}
getNameWithParamsAsInt(num: number)
{
  alert(num);
}
getNameWithAnyParams(name: string, num: number)
{
  alert(name);
  alert(num);
}
}
