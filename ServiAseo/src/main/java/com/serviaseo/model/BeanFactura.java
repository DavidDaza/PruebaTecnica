package com.serviaseo.model;

public class BeanFactura {

	private int idFactura;
	private String Descripcion;
	private int Accion_idAccion;
	
	

	public BeanFactura(int idFactura, String descripcion, String accion_idAccion) {
		super();
		this.idFactura = idFactura;
		Descripcion = descripcion;
	
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getAccion_idAccion() {
		return Accion_idAccion;
	}

	public void setAccion_idAccion(int accion_idAccion) {
		Accion_idAccion = accion_idAccion;
	}

	
}
