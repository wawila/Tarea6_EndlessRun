package lab.dvchm.endlessrun;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Explosion extends PersonajeAnimado {
	
	Explosion ()
	{
		super(loadImages());

	}
	
	static ArrayList<Image> loadImages()
	{
		ArrayList<Image> images;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("perder01.png")));
		images.add(new Image(new Texture("perder02.png")));
		images.add(new Image(new Texture("perder03.png")));
		images.add(new Image(new Texture("perder04.png")));
		images.add(new Image(new Texture("perder05.png")));
		return images;
		
	}
	
}
