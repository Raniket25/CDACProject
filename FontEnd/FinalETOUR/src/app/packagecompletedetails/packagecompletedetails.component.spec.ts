import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PackagecompletedetailsComponent } from './packagecompletedetails.component';

describe('PackagecompletedetailsComponent', () => {
  let component: PackagecompletedetailsComponent;
  let fixture: ComponentFixture<PackagecompletedetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PackagecompletedetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PackagecompletedetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
