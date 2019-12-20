import { Component, OnInit } from '@angular/core';
import { UserdbService } from '../userdb.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginlibrerian',
  templateUrl: './loginlibrerian.component.html',
  styleUrls: ['./loginlibrerian.component.css']
})
export class LoginlibrerianComponent implements OnInit {

  constructor(private service: UserdbService, private route: Router) { }

  ngOnInit() {
  }

  loginstudent(form: NgForm) {
    this.service.postLoginLibrerian(form.value.libid, form.value.password).subscribe(data => {
      if (data && data.statusCode === 201) {
        localStorage.setItem('librerianDetail', JSON.stringify(data.lib));
        console.log('Login Successfully');
        this.route.navigateByUrl('/librerianhome');
      }
    });
  }
}
