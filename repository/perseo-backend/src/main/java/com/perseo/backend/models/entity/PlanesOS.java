package com.perseo.backend.models.entity;

public class PlanesOS {

	private Long id;
	private String nombre;
	private ObrasSociales obraSocial;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ObrasSociales getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObrasSociales obraSocial) {
		this.obraSocial = obraSocial;
	}

}
