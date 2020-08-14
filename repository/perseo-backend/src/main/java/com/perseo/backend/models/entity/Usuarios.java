package com.perseo.backend.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Usuarios implements Serializable{

	@Id
	@Column (unique = true, nullable = false)
	private Long dni;
	
	private Long cuil;
	
	@Temporal(TemporalType.TIME)
	@Column (name="fecha_creacion")
	private Data fechaCreacion;
	
	@Column (nullable=false)
	@NotEmpty(message="No puede estar vacía")
	private String nombre;
	
	@Column(nullable = false)
	@NotEmpty(message = "no puede estar vacía")
	private String apellido;
	
	@Column(nullable=false)
	@NotEmpty(message="No puede estar vacía")
	private String sexo;
	
	@Column(name="telefono_fijo")
	private Long telefonoFijo;
	
	@Column (name=telefono_cel, nullable = false)
	@NotEmpty (message ="No puede estar vacía")
	private Long telefonoCel;
	
	@Column (nullable = false)
	@NotEmpty (message ="No puede estar vacía")
	@Email(message = "No es un formato de Email válido")
	private String email;
	
	@NotNull(message="no puede estar vacía")
	@Column(name="fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNaciemiento;
	
	@Column(name)
	
	
	private static final long serialVersionUID = 1L;
	private Long dni;
	private Long cuil;
	private Date fechaCreacion;
	private String nombre;
	private String apellido;
	private String sexo;
	private Long telefonoFijo;
	private Long telefonoCel;
	private String email;
	private Date fechaNacimiento;
	private String calleDomiciolio;
	private Long altura;
	private String localidad;
	private String provincia;
	private List<Roles> roles;

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public Long getCuil() {
		return cuil;
	}

	public void setCuil(Long cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCalleDomiciolio() {
		return calleDomiciolio;
	}

	public void setCalleDomiciolio(String calleDomiciolio) {
		this.calleDomiciolio = calleDomiciolio;
	}

	public Long getAltura() {
		return altura;
	}

	public void setAltura(Long altura) {
		this.altura = altura;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	public Long getTelefonoCel() {
		return telefonoCel;
	}

	public void setTelefonoCel(Long telefonoCel) {
		this.telefonoCel = telefonoCel;
	}

	public Long getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(Long telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
