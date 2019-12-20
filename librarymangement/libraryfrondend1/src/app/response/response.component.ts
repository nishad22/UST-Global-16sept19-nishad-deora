import { Component, OnInit } from '@angular/core';
import { UserdbService } from '../userdb.service';

import { Router } from '@angular/router';

@Component({
  selector: 'app-response',
  templateUrl: './response.component.html',
  styleUrls: ['./response.component.css']
})
export class ResponseComponent implements OnInit {

  constructor(private service: UserdbService,private route : Router) { }

bookissue: any[];
status;
request;
respond;



  ngOnInit() {
    this.service.getAllRequest().subscribe(data => {
     console.log('Hello', data);
     this.bookissue = data.issue;
     for(let book of this.bookissue){
       this.status = book.status;
       console.log(this.status);
       if(this.status === 'request'){
        this.request= true;
       } else {
         this.request = false;
       }

       if(this.status === 'accept'){
        this.respond = true;
       } else {
         this.respond = false;
       }
     }
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }

  accept(id) {
    console.log(id);
    this.service.acceptRequest(id).subscribe(data=>{
      console.log(data);
    }, err=>{
      console.log(err);
    }, ()=>{
      console.log('Request Accepted');
    });
    this.route.navigateByUrl('/response');
  }

  reject(id) {
    console.log(id);
    this.service.rejectRequest(id).subscribe(data => {
      console.log(data);
    }, err=>{
      console.log(err);
    }, ()=>{
      console.log('Request rejected');
    });
    this.route.navigateByUrl('/response');
  }
}


