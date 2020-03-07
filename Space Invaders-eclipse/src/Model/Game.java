package Model;

import processing.core.PApplet;

public class Game {
	public PApplet app;
	
	Hero h;

public Game (PApplet app) {
	this.app = app;
	
	h = new Hero(250, 450, app);
}

public void run() {
	h.draw();
}

}
