import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedBikes;

  Bikes = [
    {
      name : 'Royal EnField',
      desc : 'asdfghjkl;',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg'
    },
    {
      name : 'Ducati',
      desc : 'qwertyuiop',
      imgUrl : 'https://cdn.pixabay.com/photo/2019/09/23/08/01/traffic-4497805__340.jpg'
    },
    {
      name : 'Scooter',
      desc : 'zxcvbnm,',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/07/11/18/moped-1031006__340.jpg'
    },
    {
      name : 'Honda',
      desc : 'asdfghjkl',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/06/13/08/56/motorcycle-1453863__340.jpg'
    },
    {
      name : 'Harley Davidson',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/07/27/03/01/motorbike-861966_1280.jpg'
    }
]
  constructor() { }

  ngOnInit() {
  }
  sendBike(bikes) {
    console.log(bikes.imgUrl);
    this.selectedBikes = bikes;
  }

}
