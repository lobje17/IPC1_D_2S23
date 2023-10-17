import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
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
    private usuarioServicio:AutorService
    ){
    this.autor = this.fb.group({
      nombre: [''],
      correo: ['']
    })
  }

  registrar(){
    console.log(this.autor)
    this.usuarioServicio.registro(this.autor.value).subscribe(
      (response)=>{
        console.log(response)
        console.log('registrado')
      },
      (error)=>{
        console.log(error)
      }
    )
  }
}
