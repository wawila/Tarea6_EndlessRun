package lab.dvchm.endlessrun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ClasePrincipal extends ApplicationAdapter implements InputProcessor{
	Stage stage;
	Stage menu;
	int frame = 0;
	Personaje jugador;
	Menu m;
	
	
	@Override
	public void create () {		
		stage=new Stage();
		menu = new Stage();
		m = new Menu();
		Gdx.input.setInputProcessor(this);
		
		jugador = new Personaje();
		stage.addActor(jugador);
		stage.addActor(new Enemigo(jugador));
		stage.addActor(new Plataforma1());
		stage.addActor(new Plataforma2());
		menu.addActor(new Menu());
	//	stage.addActor(new Explosion());	
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0f, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		menu.draw();
		menu.act();
		
		if(m.iniciarJuego()){
			stage.draw();
			stage.act();
		}

		if(!m.iniciarJuego()){
			menu.draw();
			menu.act();
		}
		
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		jugador.saltar();
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}


