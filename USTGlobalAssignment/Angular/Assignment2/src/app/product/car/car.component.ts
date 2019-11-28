import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  selectedCar;
  Car = [
    {
      name : 'Aston Martin',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png'
    },
    {
      name : 'Bugati',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg'
    },
    {
      name : 'Vokswegan',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/13/11/36/volkswagen-158463__340.png'
    },
    {
      name : 'Ambasedar',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/02/09/29/auto-3368094__340.jpg'
    }
]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    // console.log(car.imgUrl);
    this.selectedCar = car;
  }

}

