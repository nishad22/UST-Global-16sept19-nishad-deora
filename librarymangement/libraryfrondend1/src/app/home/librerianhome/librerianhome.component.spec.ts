import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibrerianhomeComponent } from './librerianhome.component';

describe('LibrerianhomeComponent', () => {
  let component: LibrerianhomeComponent;
  let fixture: ComponentFixture<LibrerianhomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibrerianhomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibrerianhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
