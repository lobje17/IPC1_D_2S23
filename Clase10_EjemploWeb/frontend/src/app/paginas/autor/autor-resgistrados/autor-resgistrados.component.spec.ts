import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorResgistradosComponent } from './autor-resgistrados.component';

describe('AutorResgistradosComponent', () => {
  let component: AutorResgistradosComponent;
  let fixture: ComponentFixture<AutorResgistradosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutorResgistradosComponent]
    });
    fixture = TestBed.createComponent(AutorResgistradosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
