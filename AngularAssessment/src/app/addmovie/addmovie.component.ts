import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {
  get title(){
    return this.form.get('title');
  }
  get url(){
    return this.form.get('url');
  }
  get desc(){
    return this.form.get('desc');
  }
    constructor() { }
    form = new FormGroup({
      title : new FormControl('', [Validators.required]),
      url : new FormControl('', [Validators.required]),
      desc : new FormControl('', [Validators.required])
    });
    ngOnInit() {
    }
    addMovie(form){
      console.log(form.value);
    }
  
}
