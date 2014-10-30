package db;

import model.Empleado;
import model.Licencia;
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
	public void persistoUnProyecto() {
		Proyecto proyecto = new Proyecto();
		proyecto.setNombre("Mi Proyecto");
		EntityManagerHelper.persist(proyecto);
	}
	
	@Test
	public void persistoUnEmplado() {
		Empleado empleado = new Empleado();
		empleado.setNombre("Santiago");
		empleado.setApellido("Perez Torre");
		empleado.setPuesto("Programador");
		empleado.setTelefono("44444444");
		empleado.setDireccion("Avenida siempre viva");
		empleado.setSalario(500);
		EntityManagerHelper.persist(empleado);
	}

	@Test
	public void persistoUnEmpladosAProyecto() {
		Proyecto proyecto = new Proyecto();
		proyecto.setNombre("Mi Proyecto con empleados");
		
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Pepe");
		
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Juan");
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Micho");

		proyecto.addEmpleado(empleado1);
		proyecto.addEmpleado(empleado2);
		proyecto.addEmpleado(empleado3);
		
		EntityManagerHelper.persist(empleado1);
		EntityManagerHelper.persist(empleado2);
		EntityManagerHelper.persist(empleado3);
		EntityManagerHelper.persist(proyecto);
	}
	
	@Test
	public void persistoLicencia() {
		Licencia licencia = new Licencia();
		EntityManagerHelper.persist(licencia);
	}
	
	@Test
	public void persistoEmpleadoConLicencia() {
		Empleado empleado = new Empleado();
		empleado.setNombre("Pepe");
		
		Licencia licencia = new Licencia();
		
		empleado.addLicencia(licencia);
		
		EntityManagerHelper.persist(empleado);
		EntityManagerHelper.persist(licencia);
	}
}
