package model;

import javax.persistence.*;

@Entity
@Table(name="Licencias")
public class Licencia extends EntidadPersistente {

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
