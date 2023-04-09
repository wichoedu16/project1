import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Empleado } from 'src/app/empleado';
import { EmpleadoService } from 'src/app/SERVICE/empleado.service';

@Component({
  selector: 'app-detalle',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.css'],
})
export class DetalleComponent implements OnInit {
  id: string;
  empleado: Empleado;

  constructor(private empleadoService: EmpleadoService, private route: ActivatedRoute, private router:Router) {}

  ngOnInit(): void {
      this.id = this.route.snapshot.params['id'];
      this.empleado = new Empleado();
      this.empleadoService.getEmpleadoById(this.id).subscribe(dato=>
        {
          this.empleado = dato;
        }
      );
  }

  regresar(){
    this.router.navigate(['inicio']);
  }
}
