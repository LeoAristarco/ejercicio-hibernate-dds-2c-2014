package ui;

import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.*;

@SuppressWarnings("serial")
public class EmpleadoView extends SimpleWindow<EmpleadoViewModel> {

	public EmpleadoView(WindowOwner parent) {
		super(parent, new EmpleadoViewModel());
	}

	@Override
	protected void addActions(Panel actionsPanel) {
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		new TablaEmpleados(mainPanel).bindItemsToProperty("empleados");
	}

}
