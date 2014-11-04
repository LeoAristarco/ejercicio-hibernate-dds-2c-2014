package homes;

import java.util.List;

import model.Empleado;

import org.apache.commons.collections15.Predicate;
import org.uqbar.commons.model.CollectionBasedHome;

import db.EntityManagerHelper;

public class EmpleadoHome extends CollectionBasedHome<Empleado>{

	private static EmpleadoHome instancia = null;
	
	@Override
	public Class<Empleado> getEntityType() {
		return Empleado.class;
	}

	@Override
	public Empleado createExample() {
		return new Empleado();
	}

	@Override
	protected Predicate<?> getCriterio(Empleado example) {
		// TODO Auto-generated method stub
		return null;
	}

	public static synchronized EmpleadoHome getInstance() {
		if (instancia == null) {
			instancia = new EmpleadoHome();
		}
		return instancia;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> allInstances() {
		return EntityManagerHelper.createQuery("from Empleado").getResultList();
	}
}
