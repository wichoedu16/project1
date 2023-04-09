import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmpleadoService } from 'src/app/SERVICE/empleado.service';
import { Empleado } from 'src/app/empleado';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css'],
})
export class AgregarComponent implements OnInit {
  nuevoEmpleado: Empleado = new Empleado();

  constructor(
    private empleadoService: EmpleadoService, 
    private router:Router
    ) { }

  ngOnInit(): void {}

  agregarEmpleado(){
    this.empleadoService.saveEmpleado(this.nuevoEmpleado).subscribe(
      res=>{
        console.log(res);
        this.irInicio();
      },
      error=>{console.log(error)}
    );
  }

  irInicio(){
    this.router.navigate(['/inicio']);
  }
}
