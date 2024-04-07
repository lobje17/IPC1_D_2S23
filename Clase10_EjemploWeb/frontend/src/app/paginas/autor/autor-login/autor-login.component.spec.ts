import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorLoginComponent } from './autor-login.component';

describe('AutorLoginComponent', () => {
  let component: AutorLoginComponent;
  let fixture: ComponentFixture<AutorLoginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutorLoginComponent]
    });
    fixture = TestBed.createComponent(AutorLoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
