import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PassengerdetailComponent } from './passengerdetail.component';

describe('PassengerdetailComponent', () => {
  let component: PassengerdetailComponent;
  let fixture: ComponentFixture<PassengerdetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PassengerdetailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PassengerdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
