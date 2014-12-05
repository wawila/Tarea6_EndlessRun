package lab.dvchm.endlessrun;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Enemigo extends PersonajeAnimado{

	
	Personaje jugador;
	Enemigo(Personaje jugador)
	{
		super(loadImages());
		setX(800);
		vel_x =-250;
		this.jugador=jugador;
	}
	
	static ArrayList<Image> loadImages()
	{
		ArrayList<Image> images;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("bomba01.png")));
		images.add(new Image(new Texture("bomba02.png")));
		images.add(new Image(new Texture("bomba03.png")));
		return images;
		
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		
		if(colision(jugador) == true)
		{
			System.out.println("Colision!");
			this.setX(800);
		}

			
		if(this.getX()<-40)
			this.setX(800);
	}
	
}
