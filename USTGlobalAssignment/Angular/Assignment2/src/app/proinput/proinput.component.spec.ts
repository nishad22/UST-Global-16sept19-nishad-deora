import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProinputComponent } from './proinput.component';

describe('ProinputComponent', () => {
  let component: ProinputComponent;
  let fixture: ComponentFixture<ProinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
