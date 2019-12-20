import { Component, OnInit } from '@angular/core';
import {FormGroup , FormControl, Validators} from '@angular/forms';
import { UserdbService } from 'src/app/userdb.service';
// import {UserdbService} from '../userdb.service';


@Component({
  selector: 'app-librerianregister',
  templateUrl: './librerianregister.component.html',
  styleUrls: ['./librerianregister.component.css']
})
export class LibrerianregisterComponent implements OnInit {

 
  get libid(){
    return this.form.get('libid');
  }

  get name() {
    return this.form.get('name');
  }

  get password(){
  return this.form.get('passowrd');
  }
  // get age() {
  //   return this.form.get('age');
  // }

  constructor(private service : UserdbService) { }
  form = new FormGroup({
    libid : new FormControl('',[ Validators.required]),
    name : new FormControl('',[Validators.required]),
    gender : new FormControl('',[Validators.required]),
    password : new FormControl('',[Validators.required]),
  });

  ngOnInit() {
  }
  
  registerUser(form) {
  console.log(this.form.value);
  this.service.postLibrarian(form.value).subscribe(data=>{
    console.log('data got', data);
    form.reset();
  }, err => {
    console.log('error');
  }, () => {
    console.log('success');
  });
}

}
