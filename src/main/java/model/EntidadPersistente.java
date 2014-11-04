package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.uqbar.commons.model.Entity;

@SuppressWarnings("serial")
@MappedSuperclass
public class EntidadPersistente extends Entity{

	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}
