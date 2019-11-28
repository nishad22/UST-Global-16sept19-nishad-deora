import { Component, OnInit, DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  movies: any[] = [];
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  showMovies(movie) {
    console.log(movie);
    this.http.get<any>(`http://www.omdbapi.com/?apikey=d4119f84&s=${movie}`).subscribe(data => {
      this.movies = data.Search;
      console.log(this.movies);
    });
  }
}
