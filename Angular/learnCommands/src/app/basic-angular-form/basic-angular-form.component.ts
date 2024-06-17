import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-basic-angular-form',
  templateUrl: './basic-angular-form.component.html',
  styleUrls: ['./basic-angular-form.component.css']
})

export class BasicAngularFormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userData: any = {};

  display = false

  getData(data: NgForm) {
    console.warn(data);
    this.userData = data;
  }

  toggle() {
    this.display = !this.display;
  }

}
