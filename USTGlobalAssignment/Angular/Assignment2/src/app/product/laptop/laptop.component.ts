import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop',
  templateUrl: './laptop.component.html',
  styleUrls: ['./laptop.component.css']
})
export class LaptopComponent implements OnInit {
  selectedLap;
  Laptop = [
    {
      name : 'Asus',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
    },
    {
      name : 'lenovo',
      desc : '',
      imgUrl : 'https://image.shutterstock.com/image-photo/laptop-blank-screen-isolated-on-260nw-232124719.jpg',
    },
    {
      name : 'Dell',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/00/45/computer-1956711__340.png',
    },
    {
      name : 'Macbook',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
    }
]
  constructor() { }

  ngOnInit() {
  }
  sendLap(lap) {
    // console.log(car.imgUrl);
    this.selectedLap = lap;
  }

}
