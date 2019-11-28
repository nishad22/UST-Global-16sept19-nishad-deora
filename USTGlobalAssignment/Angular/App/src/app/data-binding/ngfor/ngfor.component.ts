import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  products = [{
    name : 'bike',
    image : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
    price : 50000
  },{
    name : 'Macbook',
    image : 'https://cdn.pixabay.com/photo/2018/03/01/09/33/laptop-3190194__340.jpg',
    price : 60000
  },{
    name : 'Samsung Galaxy',
    image : 'https://cdn.pixabay.com/photo/2016/03/27/19/36/samsung-galaxt-note-edge-1283897__340.jpg',
    price : 70000
  }]
  constructor() { }

  ngOnInit() {
  }

}
