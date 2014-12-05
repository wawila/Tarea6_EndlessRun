package lab.dvchm.endlessrun;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Menu extends PersonajeAnimado{

	int dib = 0;
	Stage stage;
	Personaje jugador;
	
	public Menu() {
		super(loadImages());
		loadImages();
		
	}

	static ArrayList<Image> loadImages(){
		ArrayList<Image> images;
		
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("menu.png")));
		images.add(new Image(new Texture("inst.png")));
		images.add(new Image(new Texture("pausa.png")));
		return images;
	}
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		this.setX(0);
		this.setY(-100);
		
		dib_act = dib;
		
		if(Gdx.input.isKeyPressed(Keys.NUM_1))
		{
			System.out.println("Juego");
			this.setVisible(false);
		}
		// Opcion 1
		else
		if(Gdx.input.isKeyPressed(Keys.NUM_2))
		{
			System.out.println("Instrucciones");
			dib = 1;
			this.setVisible(true);
		}
		// Opcion 2
		else
		if(Gdx.input.isKeyPressed(Keys.NUM_3))
		{
			System.out.println("Salir");
			System.exit(0);
			}
		else
			if(Gdx.input.isKeyPressed(Keys.ESCAPE))
			{
				System.out.println("Menu");
				dib = 0;
				this.setVisible(true);
				}
			
		if(Gdx.input.isKeyPressed(Keys.P)){
			dib = 2;
			System.out.println("Pausa");
			this.setVisible(true);
			}
			
	}
	
	int cont = 0;
	public boolean iniciarJuego()
	{
		
		
		if(Gdx.input.isKeyPressed(Keys.NUM_1))
			cont++;
		
		if(Gdx.input.isKeyPressed(Keys.P)){
			dib = 2;
			cont = 0;
		}
		
			if(cont != 0){
				this.setVisible(false);
				System.out.println("Cont" +  cont);
				return true;
			}
			else 
				this.setVisible(true);
				System.out.println("Cont" +  cont);
				return false;
			
	}
}
