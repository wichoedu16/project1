import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Empleado } from 'src/app/empleado';
import { EmpleadoService } from 'src/app/SERVICE/empleado.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit{
    idSeleccionado:string = "";
    empleadoSeleccionado: Empleado = new Empleado();

  constructor(
    private empleadoService:EmpleadoService,
    private activatedRoute:ActivatedRoute,
    private router:Router
  ){ }
  ngOnInit(): void {
      this.idSeleccionado = this.activatedRoute.snapshot.params.id;
      this.empleadoService.getEmpleadoById(this.idSeleccionado).subscribe(
        res=>{
          this.empleadoSeleccionado = res;
        },
        err=>console.log(err)
      );
  }

  modificar(){
    this.empleadoService.editEmpleado(this.idSeleccionado, this.empleadoSeleccionado).subscribe(
      res=>{
        this.router.navigate(['/inicio']);
      },
      err=>console.log(err)
    );
  }

  regresar(){
      this.router.navigate(['/inicio']);
  }
}
