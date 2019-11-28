import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PromobComponent } from './promob.component';

describe('PromobComponent', () => {
  let component: PromobComponent;
  let fixture: ComponentFixture<PromobComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PromobComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PromobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
