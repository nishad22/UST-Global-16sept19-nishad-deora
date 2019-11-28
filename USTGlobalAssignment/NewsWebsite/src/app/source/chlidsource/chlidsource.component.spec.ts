import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChlidsourceComponent } from './chlidsource.component';

describe('ChlidsourceComponent', () => {
  let component: ChlidsourceComponent;
  let fixture: ComponentFixture<ChlidsourceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChlidsourceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChlidsourceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
