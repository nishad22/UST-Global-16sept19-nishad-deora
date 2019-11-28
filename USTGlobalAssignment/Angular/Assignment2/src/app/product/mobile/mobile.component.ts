import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
  selectedMob;
  Mobile = [
    {
      name : 'Iphone',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg'
    },
    {
      name : 'Samsung',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg'
    },
    {
      name : 'Moto',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/17/21/46/navigation-1048294__340.jpg'
    },
    {
      name : 'Xiaomi',
      desc : '',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendMob(mob) {
    // console.log(car.imgUrl);
    this.selectedMob = mob;
  }
}
