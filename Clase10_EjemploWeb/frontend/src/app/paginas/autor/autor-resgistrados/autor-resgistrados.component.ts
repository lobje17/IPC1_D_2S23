import { Component } from '@angular/core';
import { AutorService } from 'src/app/Servicios/Autor/autor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-autor-resgistrados',
  templateUrl: './autor-resgistrados.component.html',
  styleUrls: ['./autor-resgistrados.component.css']
})
export class AutorResgistradosComponent {
  autores = [{
    nombre: "Autor",
    correo: "Autor"
  }]

  constructor(
    private usuarioServicio:AutorService,
    private router:Router
  ){}

  ngOnInit(): void {
    this.obtener()  
  }

  obtener(){
    this.usuarioServicio.obtener().subscribe(
      (response)=>{
        console.log(response)
        console.log('registrado')
        this.autores = response.data
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  regresar(){
    this.router.navigate(['/registroautor'])
  }
}
