import { Component, OnInit } from '@angular/core';
import { UserdbService } from 'src/app/userdb.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-librerianhome',
  templateUrl: './librerianhome.component.html',
  styleUrls: ['./librerianhome.component.css']
})
export class LibrerianhomeComponent implements OnInit {

 name;
 bookid;
 bookDetail;
  constructor(private service: UserdbService) {}

  booksearch(form) {
    this.service.searchBook(form.value.bid).subscribe(data => {
      this.bookDetail = data.book;
      this.bookid = this.bookDetail.bid;
      console.log('BookDetail' , this.bookDetail.bid);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Book Found');
    });
  }

  updateBook(data: NgForm)  {
    this.service.updateBook(this.bookid, data.value.bname, data.value.bauthor, data.value.publication).subscribe(resp => {
      console.log('Updated', resp);
    }, err => {
      console.log(err);
    }, () => {
      console.log('One Book Record updated');
    });
  }

  ngOnInit() {
    const librerianDetail = JSON.parse(localStorage.getItem('librerianDetail'));
    for (const library of librerianDetail) {
     this.name = library.name;
     console.log('Librerian', this.name);
    }
  }

}

