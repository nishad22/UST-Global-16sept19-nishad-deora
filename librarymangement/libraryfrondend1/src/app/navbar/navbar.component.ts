import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private route: Router) { }

  ngOnInit() {
  }

  isStudent() {
    const studentDetails = JSON.parse(localStorage.getItem('studentDetail'));
    if (studentDetails) {
      return true;
    } else {
      return false;
    }
  }

  isLibrerian() {
    const libreriandetail = JSON.parse(localStorage.getItem('librerianDetail'));
    if (libreriandetail) {
      return true;
    } else {
      return false;
    }
  }

  isLoggedIn() {
    const studentDetails = JSON.parse(localStorage.getItem('studentDetail'));
    const libreriandetail = JSON.parse(localStorage.getItem('librerianDetail'));
    if (studentDetails || libreriandetail) {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('studentDetail');
    localStorage.removeItem('librerianDetail');
    this.route.navigateByUrl('/login');
    console.log('Session Completed');
  }
}
