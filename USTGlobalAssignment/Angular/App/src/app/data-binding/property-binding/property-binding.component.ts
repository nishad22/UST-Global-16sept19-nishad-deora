import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name : string = 'Nature';
  imageUrl = 'https://cdn.pixabay.com/photo/2019/04/07/13/58/pond-4109750__340.jpg';lk
  address = 'Ashok Ward,Tirora 441911';
  colorName : string = 'red'
  isActive = false;
  colSpanVlaue = 2;
  constructor() { }

  printAlert() {
    alert('Hey bro...')
  }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = !this.isActive;
  }, 4000)
}
}

