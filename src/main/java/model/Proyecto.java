package model;

import javax.persistence.*;

@Entity
@Table(name="Proyectos")
public class Proyecto {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
