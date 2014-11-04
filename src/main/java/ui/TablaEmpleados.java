package ui;

import model.Empleado;

import org.uqbar.arena.widgets.Container;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;

@SuppressWarnings("serial")
public class TablaEmpleados extends Table<Empleado> {

	public TablaEmpleados(Container container) {
		super(container);

		this.setHeigth(200);
		this.setWidth(400);

		new Column<Empleado>(this).setTitle("Nombre").setFixedSize(100)
				.bindContentsToProperty("nombre");

		new Column<Empleado>(this).setTitle("Apellido").setFixedSize(100)
				.bindContentsToProperty("apellido");

		new Column<Empleado>(this).setTitle("Telefono").setFixedSize(100)
				.bindContentsToProperty("telefono");

		new Column<Empleado>(this).setTitle("Salario").setFixedSize(100)
				.bindContentsToProperty("salario");
	}

}
