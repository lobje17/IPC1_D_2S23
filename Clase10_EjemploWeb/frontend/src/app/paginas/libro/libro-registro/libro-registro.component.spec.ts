import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LibroRegistroComponent } from './libro-registro.component';

describe('LibroRegistroComponent', () => {
  let component: LibroRegistroComponent;
  let fixture: ComponentFixture<LibroRegistroComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LibroRegistroComponent]
    });
    fixture = TestBed.createComponent(LibroRegistroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
