import { LibrosService } from './../../../Servicios/Libros/libros.service';
import { CookieService } from 'ngx-cookie-service';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-libro-lista',
  templateUrl: './libro-lista.component.html',
  styleUrls: ['./libro-lista.component.css']
})
export class LibroListaComponent {

  libros:any
  autor:any

  constructor(
    private libroServicio:LibrosService,
    private cookieService: CookieService,
    private router:Router
  ){
    let user  = JSON.parse(this.cookieService.get('autor'))
    console.log(user)
    this.autor = {
      idAutor: user.id
    }
    
  }

  ngOnInit(): void {
    this.obtener()  
  }

  obtener(){
    this.libroServicio.misLibros(this.autor).subscribe(
      (response)=>{
        console.log(response)
        console.log('registrado')
        if(response.estado=='Ok'){
          this.libros = response.data
        }
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  regresar(){
    this.router.navigate(['/registrolibros'])
  }
}
