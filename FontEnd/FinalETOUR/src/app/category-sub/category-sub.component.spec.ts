import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorySubComponent } from './category-sub.component';

describe('CategorySubComponent', () => {
  let component: CategorySubComponent;
  let fixture: ComponentFixture<CategorySubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CategorySubComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CategorySubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
