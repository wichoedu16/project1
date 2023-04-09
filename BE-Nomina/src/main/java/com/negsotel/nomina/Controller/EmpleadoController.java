package com.negsotel.nomina.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negsotel.nomina.Model.Empleado;
import com.negsotel.nomina.Service.EmpleadoService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<Empleado> getAllEmployees() {
		return empleadoService.findAll();
	}

	@GetMapping("/empleados/{id}")
	public ResponseEntity<Empleado> getEmpleadoById(@PathVariable Long id) {
		Empleado empleado = empleadoService.findById(id);
		return ResponseEntity.ok(empleado);
	}
	
	@PostMapping("/empleados")
	public Empleado saveEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}

	@PutMapping("/empleados/{id}")
	public Empleado edit(@RequestBody Empleado empleado, @PathVariable Long id) {
		Empleado empleadoSeleccionado = empleadoService.findById(id);
		empleadoSeleccionado = empleadoService.asignarValores(empleado);
		return empleadoService.save(empleadoSeleccionado);
	}

	@DeleteMapping("/empleados/{id}")
	public void delete(@PathVariable Long id) {
		empleadoService.delete(id);
	}
}