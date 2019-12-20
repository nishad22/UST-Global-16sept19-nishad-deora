import { Component, OnInit, DoCheck } from '@angular/core';
import { CanActivate } from '@angular/router';
import { UserdbService } from 'src/app/userdb.service';
import { ConstantPool } from '@angular/compiler';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-studenthome',
  templateUrl: './studenthome.component.html',
  styleUrls: ['./studenthome.component.css']
})
export class StudenthomeComponent implements OnInit {
  bookDetails;
  name;
  rollno;
  bid;
  constructor(private service: UserdbService) { }
  booksearch(form: NgForm) {

    console.log(form.value);
    this.service.searchBook(form.value.bid).subscribe(data => {
      this.bookDetails = data.book;
      // console.log('book id', this.bookDetails.bid);
      this.bid = this.bookDetails.bid;
      console.log('book id', this.bid);
    }, err => {
      console.log(err);
    }, () => {
      console.log("Search successfully");
    });
  }

  ngOnInit() {
    const studentDetails = JSON.parse(localStorage.getItem('studentDetail'));
    this.name = null;
    let dept;
    for (let student of studentDetails) {
      this.name = student.name;
      this.rollno = student.rollno;
      dept = student.department;
    }
    console.log('name', this.name);
    console.log('rollno', this.rollno);
  }
  makeRequest() {
    return this.service.postRequestBook(this.rollno, this.bid).subscribe(data => {
      if (data && data.desdescription === 'Book requested') {
        console.log('Book requested successfully');
      }
    }, err => {
      console.log(err);
    }, () => {
      console.log('Book Requested');
    });
  }
}


