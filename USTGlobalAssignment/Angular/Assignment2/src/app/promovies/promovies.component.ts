import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-promovies',
  templateUrl: './promovies.component.html',
  styleUrls: ['./promovies.component.css']
})
export class PromoviesComponent implements OnInit {
  @Input() movies: {imgUrl: string , name: string , desc: string};
  constructor() { }

  ngOnInit() {
  }

}
