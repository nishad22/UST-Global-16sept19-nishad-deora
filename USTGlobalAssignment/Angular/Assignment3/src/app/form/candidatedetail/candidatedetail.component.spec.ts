import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CandidatedetailComponent } from './candidatedetail.component';

describe('CandidatedetailComponent', () => {
  let component: CandidatedetailComponent;
  let fixture: ComponentFixture<CandidatedetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CandidatedetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CandidatedetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
