import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { AutorService } from 'src/app/Servicios/Autor/autor.service';

@Component({
  selector: 'app-autor-login',
  templateUrl: './autor-login.component.html',
  styleUrls: ['./autor-login.component.css']
})
export class AutorLoginComponent {

  autor:FormGroup

  constructor(
    private fb:FormBuilder,
    private usuarioServicio:AutorService,
    private router:Router,
    private cookieService: CookieService
    ){
    this.autor = this.fb.group({
      nombre: [''],
      correo: [''],
      password: [''],
      id:[0]
    })
  }

  login(){
    console.log(this.autor)
    this.usuarioServicio.login(this.autor.value).subscribe(
      (response)=>{
        console.log(response)
        console.log('registrado', response)
        if(response.estado=='Ok'){
          this.cookieService.set('autor', JSON.stringify(response.data))  
          console.log('Esto esta almacenado ', JSON.parse(this.cookieService.get('autor')))
          this.router.navigate(['/perfil'])
        }
        
      },
      (error)=>{
        console.log(error)
      }
    )
  }

  registrar(){
    this.router.navigate(['/registroautor'])
  }
}
