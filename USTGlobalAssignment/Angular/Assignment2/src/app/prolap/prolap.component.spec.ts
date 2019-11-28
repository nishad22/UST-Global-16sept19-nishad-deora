import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProlapComponent } from './prolap.component';

describe('ProlapComponent', () => {
  let component: ProlapComponent;
  let fixture: ComponentFixture<ProlapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProlapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProlapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
