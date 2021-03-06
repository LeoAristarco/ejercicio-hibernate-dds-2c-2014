package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.uqbar.commons.utils.Observable;

@SuppressWarnings("serial")
@Entity
@Observable
@Table(name="Empleados")
public class Empleado extends EntidadPersistente{

	@Column(nullable=false)
	private String nombre;
	
	private String apellido;
	
	@OneToOne
	@JoinColumn(name="puesto_id")
	private Puesto puesto;
	
	private String telefono;
	
	@Embedded
	private Domicilio domicilio;
	
	private int salario;
	
	@OneToMany
	@OrderColumn(name="fecha_inicio")
	@JoinColumn(name="empleado_id")
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

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
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
