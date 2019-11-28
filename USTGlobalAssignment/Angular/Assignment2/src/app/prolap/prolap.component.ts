import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-prolap',
  templateUrl: './prolap.component.html',
  styleUrls: ['./prolap.component.css']
})
export class ProlapComponent implements OnInit {
  @Input() lap: {imgUrl: string , name: string , desc: string};
  constructor() { }
  

  ngOnInit() {
  }

}
