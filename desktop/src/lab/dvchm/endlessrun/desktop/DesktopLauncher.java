package lab.dvchm.endlessrun.desktop;

import lab.dvchm.endlessrun.ClasePrincipal;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new ClasePrincipal(), config);
	}
}