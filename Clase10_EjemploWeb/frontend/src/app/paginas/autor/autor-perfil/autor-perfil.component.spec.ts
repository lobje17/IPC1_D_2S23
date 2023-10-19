import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutorPerfilComponent } from './autor-perfil.component';

describe('AutorPerfilComponent', () => {
  let component: AutorPerfilComponent;
  let fixture: ComponentFixture<AutorPerfilComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutorPerfilComponent]
    });
    fixture = TestBed.createComponent(AutorPerfilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
