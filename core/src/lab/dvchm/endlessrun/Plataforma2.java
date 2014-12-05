package lab.dvchm.endlessrun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Plataforma2 extends Image
{
	
	Plataforma1 plat = new Plataforma1();
	
	int velocidad = 250;
	public Plataforma2()
	{
		super(new Texture("tierra.png"));
		this.setX(800);
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