import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Empleado } from '../empleado';

@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {
  url='http://localhost:8080/api/empleados';
  constructor(private http: HttpClient) { }

  getEmpleados():Observable<Empleado[]>{
    return this.http.get<Empleado[]>(`${this.url}`);
  }
  
  getEmpleadoById(id: string):Observable<any>{
    return this.http.get<Empleado>(`${this.url}/${id}`);
  }

  saveEmpleado(empleado: Empleado):Observable<Object>{
    return this.http.post(`${this.url}`, empleado);
  }

  editEmpleado(id: string, empleado: Empleado):Observable<Object>{
    return this.http.put(this.url+'/'+ id, empleado);
  }

  deleteEmpleado(id: string):Observable<Object>{
    return this.http.delete(`${this.url}/${id}`);
  }
}