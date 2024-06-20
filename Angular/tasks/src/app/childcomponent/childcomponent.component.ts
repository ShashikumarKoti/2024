import { Component, OnInit,Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-childcomponent',
  templateUrl: './childcomponent.component.html',
  styleUrls: ['./childcomponent.component.css']
})
export class ChildcomponentComponent implements OnInit {

  constructor() { }

  @Output() getDataFromChild= new EventEmitter<string>(); 
  ngOnInit(): void {
  }

}
