import { Component, OnInit } from '@angular/core';
import {FormGroup , FormControl, Validators, FormBuilder} from '@angular/forms';
import { UserdbService } from 'src/app/userdb.service';
// import {UserdbService} from '../userdb.service';
// import {LibraryService} from '../liberay.service';
// import { LibraryService } from 'src/app/library.service';

@Component({
  selector: 'app-studentregister',
  templateUrl: './studentregister.component.html',
  styleUrls: ['./studentregister.component.css']
})
export class StudentregisterComponent implements OnInit {
error: string;
form: FormGroup;
  get rollno() {
    return this.form.get('rollno');
  }

  get name() {
    return this.form.get('name');
  }

  get password(){
    return this.form.get('password');
  }

  get department() {
    return this.form.get('department');
  }

  // get age() {
  //   return this.form.get('age');
  // }

  constructor(private service : UserdbService, private fb : FormBuilder) { }
  

  ngOnInit() {
    this.form = new FormGroup({
      rollno : new FormControl('',[ Validators.required]),
      name : new FormControl('',[Validators.required]),
      // age : new FormControl('',[ Validators.required,Validators.min(18),Validators.max(50)]),
      gender : new FormControl('',[Validators.required]),
      department : new FormControl('',[Validators.required]),
      password : new FormControl('',[ Validators.required , Validators.minLength(8)])
      // retype : new FormControl()
    });
  }

  registerUser(register) {
  console.log(register.value);
  this.service.postStudent(register.value).subscribe(data=>{
    register.reset();
    console.log('data got', data);
  }, err => {
        console.log('err');
        this.error = err.error.message;
  }, () => {
    console.log('success');
  });
}

}
