package com.perseo.backend.models.entity;

import java.util.Date;

public class Pacientes {

	private HistoriasClinicas historiaClinica;
	private Long idOS1;
	private PlanesOS planOS1;
	private Long idOS2;
	private PlanesOS planOS2;
	private Date fechaInternacion;
	private String estado;
	private String nombreContacto;
	private String apellidoContacto;
	private String paretezcoContacto;
	private Long telefonoContacto;

	public HistoriasClinicas getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriasClinicas historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public Long getIdOS1() {
		return idOS1;
	}

	public void setIdOS1(Long idOS1) {
		this.idOS1 = idOS1;
	}

	public PlanesOS getPlanOS1() {
		return planOS1;
	}

	public void setPlanOS1(PlanesOS planOS1) {
		this.planOS1 = planOS1;
	}

	public Long getIdOS2() {
		return idOS2;
	}

	public void setIdOS2(Long idOS2) {
		this.idOS2 = idOS2;
	}

	public PlanesOS getPlanOS2() {
		return planOS2;
	}

	public void setPlanOS2(PlanesOS planOS2) {
		this.planOS2 = planOS2;
	}

	public Date getFechaInternacion() {
		return fechaInternacion;
	}

	public void setFechaInternacion(Date fechaInternacion) {
		this.fechaInternacion = fechaInternacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getApellidoContacto() {
		return apellidoContacto;
	}

	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getParetezcoContacto() {
		return paretezcoContacto;
	}

	public void setParetezcoContacto(String paretezcoContacto) {
		this.paretezcoContacto = paretezcoContacto;
	}

	public Long getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(Long telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

};
