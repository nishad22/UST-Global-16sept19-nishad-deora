import { Component } from '@angular/core';


@Component ({
    selector: 'app-about',
    templateUrl: 'about.component.html',
    styleUrls: ['about.component.css']
})

export class AboutComponent {
    name = 'Nishad';
    str = '';
    msg = '';
    hobby = ''; 
    Person = [{
        name : 'Nishad',
        age : 21
    }, {
        name : 'Harsh',
        age : 22
    }]
    pStyle = {
        fontStyle : 'italic',
        fontFamily : 'Times New Roman, Times, serif' 
    }

    onClick() {
      this.str = 'Welcome to my world';  
    }

    logMessage(value){
        this.msg = value;
    }
    registerData(f) {
        console.log(f)
    }
    constructor() {}
}