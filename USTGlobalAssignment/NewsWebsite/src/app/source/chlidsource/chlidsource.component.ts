import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-chlidsource',
  templateUrl: './chlidsource.component.html',
  styleUrls: ['./chlidsource.component.css']
})
export class ChlidsourceComponent implements OnInit {
  @Input() sourcenews;
  constructor() { }

  ngOnInit() {
  }

}
