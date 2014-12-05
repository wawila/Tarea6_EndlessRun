package lab.dvchm.endlessrun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Plataforma1 extends Image
{
	int velocidad = 250;
	public Plataforma1()
	{
		super(new Texture("tierra.png"));
		this.setX(0);
		this.setY(-200);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		super.act(delta);
		this.setX(this.getX()-delta*velocidad);
		this.setWidth(750);
		
		if(this.getX()<-750)
			this.setX(850);
	}
}