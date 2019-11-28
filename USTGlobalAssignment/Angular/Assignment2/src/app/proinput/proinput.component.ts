import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-proinput',
  templateUrl: './proinput.component.html',
  styleUrls: ['./proinput.component.css']
})
export class ProinputComponent implements OnInit {
  @Input() bikes: {imgUrl: string , name: string , desc: string};
  constructor() { }

  ngOnInit() {
  }

}
