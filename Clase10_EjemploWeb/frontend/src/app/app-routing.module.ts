import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutorRegistroComponent } from './paginas/autor/autor-registro/autor-registro.component';

const routes: Routes = [
  {path:"registroautor", component: AutorRegistroComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
