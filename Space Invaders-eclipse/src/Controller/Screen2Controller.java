package Controller;

import Model.Game;
import processing.core.PApplet;

public class Screen2Controller {
	
	PApplet app;
	Game myHero;
	
	public Screen2Controller (PApplet app) {
		this.app = app;
		this.myHero = new Game (app);
		
		
		
	}
	
	
	public void runController () {
		myHero.run();
	}
}
