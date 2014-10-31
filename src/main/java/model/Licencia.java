package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Licencias")
public class Licencia extends EntidadPersistente {
	
	private Date fecha_inicio;
	
	private Date fecha_vencimiento;

	@OneToOne
	@JoinColumn(name="razon_id")
	private Razon razon;

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public Razon getRazon() {
		return razon;
	}

	public void setRazon(Razon razon) {
		this.razon = razon;
	}
}
