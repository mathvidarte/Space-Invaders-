package View;

import Controller.Screen2Controller;
import processing.core.PApplet;

public class Screen2View {
	PApplet app;
	
	Screen2Controller theHero;
	
	public Screen2View (PApplet app) {
		this.app = app;
		this.theHero = new Screen2Controller (app);
	}
	
	
	public void runView () {
		theHero.runController();
	}
	
	public void moveView () {
		theHero.moveController();
	}

}
