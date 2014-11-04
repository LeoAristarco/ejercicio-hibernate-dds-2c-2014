package model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="Razones")
public class Razon extends EntidadPersistente {

	private String descripcion;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
