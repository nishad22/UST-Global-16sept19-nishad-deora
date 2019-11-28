import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PromoviesComponent } from './promovies.component';

describe('PromoviesComponent', () => {
  let component: PromoviesComponent;
  let fixture: ComponentFixture<PromoviesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PromoviesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PromoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
