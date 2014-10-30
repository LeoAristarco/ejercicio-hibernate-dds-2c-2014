package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Proyectos")
public class Proyecto extends EntidadPersistente{

	private String nombre;
	
	@ManyToMany
	@JoinTable(name="Proyectos_x_Empleados",
	  joinColumns={@JoinColumn(name="empleado_id", referencedColumnName="id")},
	  inverseJoinColumns={@JoinColumn(name="proyecto_id", referencedColumnName="id")})
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
