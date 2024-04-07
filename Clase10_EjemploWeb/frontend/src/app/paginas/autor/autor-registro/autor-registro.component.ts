import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AutorService } from 'src/app/Servicios/Autor/autor.service';

@Component({
  selector: 'app-autor-registro',
  templateUrl: './autor-registro.component.html',
  styleUrls: ['./autor-registro.component.css']
})
export class AutorRegistroComponent {

  autor:FormGroup

  constructor(
    private fb:FormBuilder,
    private usuarioServicio:AutorService,
    private router:Router
    ){
    this.autor = this.fb.group({
      nombre: [''],
      correo: [''],
      password: [''],
      id:[0]
    })
  }

  registrar(){
    console.log(this.autor)
    this.usuarioServicio.registro(this.autor.value).subscribe(
      (response)=>{
        console.log(response)
        if(response.estado=='Ok'){
          console.log('registrado')
          this.router.navigate(['/login'])
        }
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  regresar(){
    this.router.navigate(['/login'])
  }
}
