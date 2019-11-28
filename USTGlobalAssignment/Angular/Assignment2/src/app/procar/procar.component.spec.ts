import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProcarComponent } from './procar.component';

describe('ProcarComponent', () => {
  let component: ProcarComponent;
  let fixture: ComponentFixture<ProcarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProcarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProcarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
