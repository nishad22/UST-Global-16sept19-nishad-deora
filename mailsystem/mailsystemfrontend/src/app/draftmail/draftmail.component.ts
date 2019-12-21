import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-draftmail',
  templateUrl: './draftmail.component.html',
  styleUrls: ['./draftmail.component.css']
})
export class DraftmailComponent implements OnInit {
emails;
selectemail;
  constructor(private service:ServiceService) { }
getdraft(){
  return this.service.draftMail().subscribe(data=>{
    this.emails=data;
  });
}

selectedEmail(email){
  this.selectemail=email;
}
  ngOnInit() {
  }

}
