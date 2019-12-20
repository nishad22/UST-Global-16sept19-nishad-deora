import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginlibrerianComponent } from './loginlibrerian.component';

describe('LoginlibrerianComponent', () => {
  let component: LoginlibrerianComponent;
  let fixture: ComponentFixture<LoginlibrerianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginlibrerianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginlibrerianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
