import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
user;
message;
  constructor(private service:ServiceService,private router:Router) { }

  loginData(form){
    console.log(form.value);
this.service.loginData(form.value).subscribe(data=>{
this.user=data;
localStorage.setItem("user",JSON.stringify(data));
if(data.statusCode===200){
this.router.navigateByUrl('home');
}
else{
this.message=data.description;
}
}
  )
  }

  ngOnInit() {
  }

}
