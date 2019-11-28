import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  selectedMovies;
  Movies = [
    {
      name : 'The India Most Wnated',
      desc : '',
      imgUrl : 'https://cdn.pinkvilla.com/files/styles/contentpreview/public/Indias-Most-Wanted-review.jpg?itok=wMGEpJRD'
    },
    {
      name : 'Simbha',
      desc : '',
      imgUrl : 'https://st1.bollywoodlife.com/wp-content/uploads/2018/12/simbha-2.jpg'
    },
    {
      name : 'Batla House',
      desc : '',
      imgUrl : 'https://cdn.pinkvilla.com/files/styles/contentpreview/public/john_main.png?itok=mYE2lwZ7'
    },
    {
      name : 'Laagan',
      desc : '',
      imgUrl : 'http://www.impawards.com/2001/posters/lagaan_ver3.jpg'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendMovies(movies) {
    // console.log(car.imgUrl);
    this.selectedMovies = movies;
  }
}
