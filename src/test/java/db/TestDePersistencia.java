package db;

import model.Empleado;
import model.Proyecto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestDePersistencia {

	@Test
	public void contextUp() {
		EntityManagerHelper.getEntityManager();
	}

	@Test
	public void contextUpWithTransaction() throws Exception {
		EntityManagerHelper.withTransaction(() -> {
		});
	}

	@Before
	public void begin() throws Exception {
		EntityManagerHelper.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		EntityManagerHelper.commit();
	}

	@Test
	public void agregoUnProyecto() {
		Proyecto proyecto = new Proyecto();
		proyecto.setNombre("Mi Proyecto");
		EntityManagerHelper.persist(proyecto);
	}
	
	@Test
	public void agregoUnEmplado() {
		Empleado empleado = new Empleado();
		empleado.setNombre("Santiago");
		empleado.setApellido("Perez Torre");
		empleado.setPuesto("Programador");
		empleado.setTelefono("44444444");
		empleado.setDireccion("Avenida siempre viva");
		empleado.setSalario(500);
		EntityManagerHelper.persist(empleado);
	}
}
