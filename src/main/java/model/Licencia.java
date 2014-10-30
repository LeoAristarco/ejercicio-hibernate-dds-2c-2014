package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Licencias")
public class Licencia extends EntidadPersistente {

//	private Date fechaInicio;
//	private Date fechaVencimiento;
	
	@ManyToOne
	@JoinColumn(name="empleado_id")
	private Empleado empleado;
	
	@OneToOne
	@JoinColumn(name="razon_id")
	private Razon razon;

	public Razon getRazon() {
		return razon;
	}

	public void setRazon(Razon razon) {
		this.razon = razon;
	}
}
