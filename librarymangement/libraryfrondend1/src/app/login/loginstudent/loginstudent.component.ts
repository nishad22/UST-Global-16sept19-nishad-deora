import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserdbService } from 'src/app/userdb.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginstudent',
  templateUrl: './loginstudent.component.html',
  styleUrls: ['./loginstudent.component.css']
})
export class LoginstudentComponent implements OnInit {

  msg: string;
  constructor(private service: UserdbService, private router: Router) { }

  ngOnInit() {
  }

  loginstudent(form: NgForm) {
    this.msg = null;
    this.service.postLoginStudent(form.value.rollno, form.value.password).subscribe(res => {
      console.log(res);
      if (res && res.statusCode === 201) {
        //  console.log(res);
        localStorage.setItem('studentDetail', JSON.stringify(res.stud));
        const s = JSON.parse(localStorage.getItem('studentDetail'));
        console.log('welcome',s);
        this.router.navigateByUrl('/studenthome');
        console.log('your are loggeg in');
      } else{
        this.msg = 'Your Credentials are incorrect';
        form.reset();
      }
      
    }, err => {
      console.log(err);
    },()=>{
      console.log("Login Succesfully");
    });
  }


}
