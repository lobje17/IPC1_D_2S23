import { AutorResgistradosComponent } from './paginas/autor/autor-resgistrados/autor-resgistrados.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutorRegistroComponent } from './paginas/autor/autor-registro/autor-registro.component';
import { AutorLoginComponent } from './paginas/autor/autor-login/autor-login.component';
import { AutorMiperfilComponent } from './paginas/autor/autor-miperfil/autor-miperfil.component';
import { LibroRegistroComponent } from './paginas/libro/libro-registro/libro-registro.component';
import { LibroListaComponent } from './paginas/libro/libro-lista/libro-lista.component';

const routes: Routes = [
  {path:"registroautor", component: AutorRegistroComponent},
  {path:"autores", component: AutorResgistradosComponent},
  {path:"login", component: AutorLoginComponent },
  {path:"perfil", component: AutorMiperfilComponent},
  {path:"registrolibros", component: LibroRegistroComponent},
  {path:"mislibros", component: LibroListaComponent},
  {path:"**", component: AutorLoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
