package model;

import javax.persistence.*;

@Entity
@Table(name="Razones")
public class Razon extends EntidadPersistente {

	private String descripcion;
	
	@OneToOne(mappedBy="razon")
	private Licencia licencia;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
