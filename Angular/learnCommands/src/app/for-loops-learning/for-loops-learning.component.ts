import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-for-loops-learning',
  templateUrl: './for-loops-learning.component.html',
  styleUrls: ['./for-loops-learning.component.css']
})
export class ForLoopsLearningComponent {

  constructor() { }

  title = "Nested loop/Multi dimensional array  "

  users = ['Shashi', 'Ved', 'kumar'];
  userDetails = [
    { name: 'Shashi', age: 35, email: 'sk@gmail.com' },
    { name: 'Ved', age: 5, email: 'ved@gmail.com' },
    { name: 'Kumar', age: 25, email: 'kumar@gmail.com' }
  ];

  employeeDetails = [
    { name: 'Emp1', id: 1111 , phoneNumbers:['1111','1112']},
    { name: 'Emp2', id: 2222 , phoneNumbers:['2222','2223'] },
    { name: 'Emp3', id: 3333 , phoneNumbers:['3333','3334'] },
  ];


  personDetails = [
    { name: 'Person1', id: 454 , phoneNums:['1111','1112']},
    { name: 'Person2', id: 894 , phoneNums:['2222','2223']},
    { name: 'Person3', id: 564 , phoneNums:['3333','3334']},
  ];



}
