package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Empleados")
public class Empleado extends EntidadPersistente{

	@Column(nullable=false)
	private String nombre;
	
	private String apellido;
	
	private String puesto;
	
	private String telefono;
	
	private String direccion;
	
	private int salario;
	
	@OneToMany
	@JoinColumn(name="empleado_id", referencedColumnName="id")
	private List<Licencia> licencias = new ArrayList<Licencia>();

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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void addLicencia(Licencia licencia) {
		this.licencias.add(licencia);
	}
}
