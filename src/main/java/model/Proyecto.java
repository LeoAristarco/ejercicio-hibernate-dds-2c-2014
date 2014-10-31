package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="Proyectos")
public class Proyecto extends EntidadPersistente{

	private String nombre;
	
	@ManyToMany
	@IndexColumn(name="indice")
	@JoinTable(name="Proyectos_x_Empleados",
	  joinColumns={@JoinColumn(name="empleado_id")},
	  inverseJoinColumns={@JoinColumn(name="proyecto_id")})
	private List<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
}
