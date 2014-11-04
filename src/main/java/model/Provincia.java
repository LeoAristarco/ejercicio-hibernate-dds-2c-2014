package model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
public class Provincia extends EntidadPersistente {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
