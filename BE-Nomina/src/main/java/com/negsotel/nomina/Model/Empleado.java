package com.negsotel.nomina.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cedula", nullable = false, unique = true)
	String cedula;
	
	@Column(name = "usuario", nullable = false)
	private String usuario;

	@Column(name = "estado", length = 15, nullable = false)
	private String estado;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellido_paterno", length = 60, nullable = false)
	private String apellidoPaterno;

	@Column(name = "apellido_materno", length = 60, nullable = false)
	private String apellidoMaterno;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "sexo", length = 15, nullable = false)
	private String sexo;

	@Column(name = "nacionalidad", length = 15, nullable = false)
	private String nacionalidad;

	@Column(name = "estado_civil", length = 15, nullable = false)
	private String estadoCivil;

	@Column(name = "fecha_ingreso")
	private Date fechaIngreso;

	@Column(name = "fecha_salida")
	private Date fechaSalida;

	@Column(name = "fecha_reingreso")
	private Date fechaReingreso;

	@Column(name = "id_cargo", nullable = false)
	private Long idCargo;

	@Column(name = "grado_academico")
	private String gradoAcademico;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "id_salario")
	private Long idSalario;

	@Column(name = "jefe")
	private String jefe;

	@Column(name = "id_jefe")
	private Long idJefe;

	@Column(name = "provincia", nullable = false)
	private String provincia;

	@Column(name = "canton", nullable = false)
	private String canton;

	@Column(name = "ciudad", nullable = false)
	private String ciudad;

	@Column(name = "sector", nullable = false)
	private String sector;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "celular")
	private String celular;

	@Column(name = "calle_principal", nullable = false)
	private String callePrincipal;

	@Column(name = "calle_secundaria")
	private String calleSecundaria;

	@Column(name = "correo_personal")
	private String correoPersonal;

	@Column(name = "correo_institucional", nullable = false)
	private String correoInstitucional;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaReingreso() {
		return fechaReingreso;
	}

	public void setFechaReingreso(Date fechaReingreso) {
		this.fechaReingreso = fechaReingreso;
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getIdSalario() {
		return idSalario;
	}

	public void setIdSalario(Long idSalario) {
		this.idSalario = idSalario;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	public Long getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(Long idJefe) {
		this.idJefe = idJefe;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}
	
	
}