package com.negsotel.nomina.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negsotel.nomina.Dao.EmpleadoDao;
import com.negsotel.nomina.Model.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado save(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	public Empleado findById(Long id) {
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		empleadoDao.deleteById(id);
	}

	@Override
	public Empleado asignarValores(Empleado empleado) {
		Empleado empleadoActualizado = empleado;
		empleadoActualizado.setApellidoPaterno(empleado.getApellidoPaterno());
		
		return empleadoActualizado;
	}



}