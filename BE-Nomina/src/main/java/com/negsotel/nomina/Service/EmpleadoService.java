package com.negsotel.nomina.Service;

import java.util.List;

import com.negsotel.nomina.Model.Empleado;

public interface EmpleadoService {

	public List<Empleado> findAll();
	public Empleado save (Empleado empleado);
	public Empleado findById (Long id);
	public void delete(Long id);
	public Empleado asignarValores(Empleado empleado);

}
