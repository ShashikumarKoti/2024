import { Component } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

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

  loginFormFromReactive=new FormGroup({
    userName:new FormControl('', [Validators.required,Validators.pattern('[a-zA-z]+$')]),
    password:new FormControl('',[Validators.required,Validators.minLength(5)]),
    email:new FormControl('', [Validators.email])

  })

  convertStringToUpperCase(item:string){
   return  item.toUpperCase();
  }

  userLogin(item: any) {
    console.warn(item)
  }

  loginUserFromReactive() {
    console.warn(this.loginFormFromReactive.value);
  }

  get userValidator() {
    return this.loginFormFromReactive.get('userName')
  }

  get emailValidator() {
    return this.loginFormFromReactive.get('email')
  }

  get pwdValidator() {
    return this.loginFormFromReactive.get('password')
  }

}
