import { Component, OnInit } from '@angular/core';
import { UserdbService } from '../userdb.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  constructor(private service: UserdbService, private route : Router) { }

  ngOnInit() {
  }
  
  addBook(data : NgForm) {
    this.service.postAddBook(data.value).subscribe(form => {
      if ( form && form.message === 'success') {
        console.log(data.value);
        data.reset();
      }}, err => {
        console.log(err);
      }, () => {
        console.log('New Book Added');
      });
  }

  goToHOme(){
    this.route.navigateByUrl('/librerianhome');
  }
}
