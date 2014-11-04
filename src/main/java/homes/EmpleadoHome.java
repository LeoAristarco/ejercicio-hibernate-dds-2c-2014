package homes;

import model.Empleado;

import org.apache.commons.collections15.Predicate;
import org.uqbar.commons.model.CollectionBasedHome;

public class EmpleadoHome extends CollectionBasedHome<Empleado>{

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

}
