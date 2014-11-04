package ui;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

public class StartApplication extends Application {

	public static void main(String[] args) {
		new StartApplication().start();
	}

	@Override
	protected Window<?> createMainWindow() {
		return new EmpleadoView(this);
	}

}
