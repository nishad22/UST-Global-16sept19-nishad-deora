import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-procar',
  templateUrl: './procar.component.html',
  styleUrls: ['./procar.component.css']
})
export class ProcarComponent implements OnInit {
  @Input() car: {imgUrl: string , name: string , desc: string};
  constructor() { }

  ngOnInit() {
  }

}
