import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-companydetail',
  templateUrl: './companydetail.component.html',
  styleUrls: ['./companydetail.component.css']
})
export class CompanydetailComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  companyData(form: NgForm ) {
    console.log(form);
  }
}
