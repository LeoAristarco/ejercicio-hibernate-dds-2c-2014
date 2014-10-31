package db;

import java.sql.Date;

import model.Domicilio;
import model.Empleado;
import model.Licencia;
import model.Provincia;
import model.Proyecto;
import model.Puesto;
import model.Razon;

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
		empleado.setTelefono("44444444");
		empleado.setSalario(500);
		
		EntityManagerHelper.persist(empleado);
	}
	
	@Test
	public void persistoUnEmpladoConPuesto() {
		Puesto puesto = new Puesto();
		puesto.setNombre("Mi puesto");
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Santiago");
		empleado.setApellido("Perez Torre");
		empleado.setPuesto(puesto);
		empleado.setTelefono("44444444");
		empleado.setSalario(500);
		
		EntityManagerHelper.persist(puesto);
		EntityManagerHelper.persist(empleado);
	}
	
	@Test
	public void persistoUnEmpleadoConDomicilioSinProvincia() {
		Puesto puesto = new Puesto();
		puesto.setNombre("Mi puesto");
		
		Domicilio domicilio = new Domicilio();
		domicilio.setDireccion("Mi direccion");
		domicilio.setCiudad("Mi ciudad");
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Santiago");
		empleado.setApellido("Perez Torre");
		empleado.setPuesto(puesto);
		empleado.setTelefono("44444444");
		empleado.setDomicilio(domicilio);		
		empleado.setSalario(500);
		
		EntityManagerHelper.persist(puesto);
		EntityManagerHelper.persist(empleado);
	}
	
	@Test
	public void persistoUnEmpleadoConDomicilioConProvincia() {
		Puesto puesto = new Puesto();
		puesto.setNombre("Mi puesto");
		
		Provincia provincia = new Provincia();
		provincia.setNombre("Mi provincia");
		
		Domicilio domicilio = new Domicilio();
		domicilio.setDireccion("Mi direccion");
		domicilio.setCiudad("Mi ciudad");
		domicilio.setProvincia(provincia);
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Santiago");
		empleado.setApellido("Perez Torre");
		empleado.setPuesto(puesto);
		empleado.setTelefono("44444444");
		empleado.setDomicilio(domicilio);		
		empleado.setSalario(500);
		
		EntityManagerHelper.persist(puesto);
		EntityManagerHelper.persist(provincia);
		EntityManagerHelper.persist(empleado);
	}

	@Test
	public void persistoUnEmpladosAProyecto() {
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Pepe");
		
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Juan");
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Micho");
		
		Proyecto proyecto = new Proyecto();
		proyecto.setNombre("Mi Proyecto con empleados");
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
		Date fecha_inicio = new Date(0);
		fecha_inicio = Date.valueOf("2010-10-10");
		
		Date fecha_vencimiento = new Date(0);
		fecha_vencimiento = Date.valueOf("2011-10-10");
		
		Licencia licencia = new Licencia();
		licencia.setFecha_inicio(fecha_inicio);
		licencia.setFecha_vencimiento(fecha_vencimiento);
		
		EntityManagerHelper.persist(licencia);
	}
	
	@Test
	public void persistoEmpleadoConLicencia() {
		Date fecha_inicio = new Date(0);
		fecha_inicio = Date.valueOf("2010-10-10");
		
		Date fecha_vencimiento = new Date(0);
		fecha_vencimiento = Date.valueOf("2011-10-10");
		
		Licencia licencia = new Licencia();
		licencia.setFecha_inicio(fecha_inicio);
		licencia.setFecha_vencimiento(fecha_vencimiento);
		
		Empleado empleado = new Empleado();
		empleado.setNombre("Pepe");
		empleado.addLicencia(licencia);
		
		EntityManagerHelper.persist(empleado);
		EntityManagerHelper.persist(licencia);
	}
	
	@Test
	public void persistoRazon() {
		Razon razon = new Razon();
		
		EntityManagerHelper.persist(razon);
	}
	
	@Test
	public void persistoLicenciaConRazon() {
		Razon razon = new Razon();
		razon.setDescripcion("Mi descripcion");
		
		Licencia licencia = new Licencia();
		licencia.setRazon(razon);
		
		EntityManagerHelper.persist(razon);
		EntityManagerHelper.persist(licencia);
	}
}
