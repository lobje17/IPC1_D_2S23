import { Component } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { AutorService } from 'src/app/Servicios/Autor/autor.service';

@Component({
  selector: 'app-autor-perfil',
  templateUrl: './autor-perfil.component.html',
  styleUrls: ['./autor-perfil.component.css']
})
export class AutorPerfilComponent {
  miInfo:any
  constructor(
    private usuarioServicio:AutorService,
    private cookieService: CookieService
    ){
      this.miInfo = JSON.parse(this.cookieService.get('autor'))
    }


}
