import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorMiperfilComponent } from './autor-miperfil.component';

describe('AutorMiperfilComponent', () => {
  let component: AutorMiperfilComponent;
  let fixture: ComponentFixture<AutorMiperfilComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutorMiperfilComponent]
    });
    fixture = TestBed.createComponent(AutorMiperfilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
