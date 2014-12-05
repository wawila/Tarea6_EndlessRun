package lab.dvchm.endlessrun;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Personaje extends PersonajeAnimado {

	float grav;
	
	public Personaje() {
		super(loadImages());
		grav = 200f;
	}

	static ArrayList<Image> loadImages(){
		ArrayList<Image> images;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("run01.png")));
		images.add(new Image(new Texture("run02.png")));
		images.add(new Image(new Texture("run03.png")));
		images.add(new Image(new Texture("run04.png")));
		images.add(new Image(new Texture("jump.png")));
		return images;
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		ace_y -= grav * delta;
		if(getY() <= piso){
			vel_y = 0;
			ace_y = 0;
			setY(piso);	
		}
		
		if(getY() != piso)
			dib_act = 4;
	}
	
	void saltar(){
		if(getY() == piso)
			ace_y = 60f;
	}
}
