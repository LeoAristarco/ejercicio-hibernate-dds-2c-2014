package ui;

import homes.EmpleadoHome;

import java.util.List;

import model.Empleado;

import org.uqbar.commons.utils.Observable;

@Observable
public class EmpleadoViewModel {
	
	public List<Empleado> getEmpleados() {
		return EmpleadoHome.getInstance().allInstances();
	}
}
