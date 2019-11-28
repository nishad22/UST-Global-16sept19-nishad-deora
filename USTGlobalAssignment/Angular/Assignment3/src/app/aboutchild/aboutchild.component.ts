import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-aboutchild',
  templateUrl: './aboutchild.component.html',
  styleUrls: ['./aboutchild.component.css']
})
export class AboutchildComponent implements OnInit {
  @Input() aboutData;
  @Input() aboutClick;
  @Output() childEvent = new EventEmitter();
  constructor() { }
  childFunc() {
    this.childEvent.emit('HEy Nishad!!!');
  }
  ngOnInit() {
  }

}

