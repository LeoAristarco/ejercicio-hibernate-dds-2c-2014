package db;

import model.Proyecto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ContextTest {

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
}
