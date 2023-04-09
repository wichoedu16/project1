import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './COMPONENTES/agregar/agregar.component';
import { DetalleComponent } from './COMPONENTES/detalle/detalle.component';
import { EditarComponent } from './COMPONENTES/editar/editar.component';
import { InicioComponent } from './COMPONENTES/inicio/inicio.component';

const routes: Routes = [
  {path:'', redirectTo:'inicio', pathMatch:'full'},

  {path:'inicio', component: InicioComponent},
  {path:'editar/:id', component: EditarComponent},
  {path:'detalle/:id', component: DetalleComponent},
  {path:'agregar', component: AgregarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
