import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
search;
emails;
selectEmail;
message;
  constructor(private service:ServiceService) {
    this.getInbox();
   }
  getInbox(){
    this.service.inbox().subscribe(data=>{
      this.emails=data;
    })   }
    selectedEmail(email){
      this.selectEmail=email;
    }
    deletemail(form){
      this.service.deleteEmail(form.value).subscribe(data=>{
        this.message=data.description;
      })
    }



  ngOnInit() {
  }

}
