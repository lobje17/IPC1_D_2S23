import { Component } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { AutorService } from 'src/app/Servicios/Autor/autor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-autor-miperfil',
  templateUrl: './autor-miperfil.component.html',
  styleUrls: ['./autor-miperfil.component.css']
})
export class AutorMiperfilComponent {
  miInfo:any
  constructor(
    private usuarioServicio:AutorService,
    private cookieService: CookieService,
    private router:Router
    ){
      this.miInfo = JSON.parse(this.cookieService.get('autor'))
    }

    crearLibro(){
      this.router.navigate(['/registrolibros'])
    }

    salir(){
      this.router.navigate(['/login'])
    }
}
