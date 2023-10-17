import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorRegistroComponent } from './autor-registro.component';

describe('AutorRegistroComponent', () => {
  let component: AutorRegistroComponent;
  let fixture: ComponentFixture<AutorRegistroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutorRegistroComponent]
    });
    fixture = TestBed.createComponent(AutorRegistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
