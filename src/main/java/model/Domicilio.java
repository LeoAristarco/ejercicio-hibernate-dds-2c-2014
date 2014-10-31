package model;

import javax.persistence.*;

@Embeddable
public class Domicilio {

	private String direccion;
	
	private String ciudad;
	
	@OneToOne
	@JoinColumn(name="provincia_id")
	private Provincia provincia;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
}
