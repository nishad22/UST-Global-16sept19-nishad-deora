import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-candidatedetail',
  templateUrl: './candidatedetail.component.html',
  styleUrls: ['./candidatedetail.component.css']
})
export class CandidatedetailComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  candidateData(form: NgForm ) {
    console.log(form);
  }

}
