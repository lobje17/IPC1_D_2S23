import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { AutorRegistroComponent } from './paginas/autor/autor-registro/autor-registro.component';
import { AutorResgistradosComponent } from './paginas/autor/autor-resgistrados/autor-resgistrados.component';
import { LibroRegistroComponent } from './paginas/libro/libro-registro/libro-registro.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AutorPerfilComponent } from './Paginas/Autor/autor-perfil/autor-perfil.component';
import { LibroListaComponent } from './paginas/libro/libro-lista/libro-lista.component';

@NgModule({
  declarations: [
    AppComponent,
    AutorRegistroComponent,
    AutorResgistradosComponent,
    LibroRegistroComponent,
    AutorPerfilComponent,
    LibroListaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,       /* SE DEBE IMPORTAR PARA HACER PETICIONES */
    FormsModule,            /* HERRAMIENTAS Y DIRECTIVAS PARA TRABAJAR CON FORMULARIOS */
    BrowserAnimationsModule,/* proporciona componentes y herramientas
                                para crear interfaces de usuario atractivas
                                y funcionales en aplicaciones web */
    ReactiveFormsModule     /* ESTA PENDIENTE DE LOS CAMBIOS QUE SE PUEDAN DAR
                                EN LOS FORMULARIOS Y REACCIONA DE ACUERDO A LAS
                                NUEVAS CONDICIONES */
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
