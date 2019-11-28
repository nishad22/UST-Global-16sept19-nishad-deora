import { Component } from "@angular/core";

@Component({
    selector : "app-about",
    templateUrl : 'about.component.html',
    styleUrls : ['about.component.css']
})

export class AboutComponent {
    name = 'Harsh';
    btn;
    message ="";
    btnData(myInput) {
        this.btn = myInput.value;
    }
    constructor() {}
}