import { LibrosService } from './../../../Servicios/Libros/libros.service';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-libro-registro',
  templateUrl: './libro-registro.component.html',
  styleUrls: ['./libro-registro.component.css']
})
export class LibroRegistroComponent {

  libro:FormGroup

  constructor(
    private fb:FormBuilder,
    private cookieService: CookieService,
    private liborosService:LibrosService,
    private router:Router
    ){
    let miInfo = JSON.parse(this.cookieService.get('autor'))
    this.libro = this.fb.group({
      nombre: [''],
      desc: [''],
      idAutor: [miInfo.id]
    })
  }

  registrar(){
    console.log(this.libro.value)
    this.liborosService.registro(this.libro.value).subscribe(
      (response)=>{
        console.log(response)
        console.log('registrado')
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  

  regresar(){
    this.router.navigate(['/mislibros'])
  }
}
