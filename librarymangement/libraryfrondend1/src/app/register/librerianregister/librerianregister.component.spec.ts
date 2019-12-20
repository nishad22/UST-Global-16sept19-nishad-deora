import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LibrerianregisterComponent } from './librerianregister.component';

describe('LibrerianregisterComponent', () => {
  let component: LibrerianregisterComponent;
  let fixture: ComponentFixture<LibrerianregisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LibrerianregisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LibrerianregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
