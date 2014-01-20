package dog.general;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GeneralMain extends StateBasedGame implements BasicInterface {

	public GeneralMain(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer game) throws SlickException {
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			//Initialisieren
			AppGameContainer app;
			app = new AppGameContainer(new GeneralMain("DoG"));
			
			//Configure
			app.setDisplayMode(1280, 720, false);
			//tetris.setTargetFrameRate(60);
			
			//Starten
			app.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
