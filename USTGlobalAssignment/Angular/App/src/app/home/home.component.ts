import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component ({
    selector: 'app-home',
    templateUrl: 'home.component.html',
    styleUrls: ['home.component.css']
})

export class HomeComponent {
    news;
    color = 'red';
    colorName = 'yellow';
    isActive = false;
    constructor(private http: HttpClient) {
        setInterval(() =>{
            this.isActive = ! this.isActive;
        },2000)
        this.getNews();
    }
    getNews() {
        this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=98e4c3d072974b9985bfcd9c8996b2b8').subscribe(data =>{
            this.news = data.articles;
        },err => {
            console.log(err);
        }, () => {
            console.log("news got successfully");
        });
    }

}