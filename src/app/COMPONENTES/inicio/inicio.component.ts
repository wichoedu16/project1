import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Empleado } from 'src/app/empleado';
import { EmpleadoService } from 'src/app/SERVICE/empleado.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css'],
})
export class InicioComponent implements OnInit {
  empleados: Empleado[];

  constructor(private empleadoService: EmpleadoService, private router:Router) {}
  ngOnInit(): void {
    this.obtenerEmpleados();
  }

  private obtenerEmpleados() {
    this.empleadoService.getEmpleados().subscribe(
      (dato) => {
        this.empleados = dato;
      },
      (err) => console.log(err)
    );
  }

  ver(id: string) {
    this.router.navigate(['detalle',id]);
  }

  actualizar(id: string) {
    this.router.navigate(['editar',id]);
  }

  eliminar(id: string) {
    this.empleadoService.deleteEmpleado(id).subscribe(
      (res) => {
        this.obtenerEmpleados();
      },
      (err) => console.log(err)
    );
  }
}
