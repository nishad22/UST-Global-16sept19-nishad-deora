import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-promob',
  templateUrl: './promob.component.html',
  styleUrls: ['./promob.component.css']
})
export class PromobComponent implements OnInit {
  @Input() mob: {imgUrl: string , name: string , desc: string};
  constructor() { }

  ngOnInit() {
  }

}
