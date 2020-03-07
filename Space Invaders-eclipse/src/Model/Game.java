package Model;

import processing.core.PApplet;

public class Game {
	public PApplet app;
	
	Hero h;
	Invasor invasors [];

public Game (PApplet app) {
	this.app = app;
	
	h = new Hero(250, 450, app);
	
	invasors = new Invasor [10];
	for (int i = 0; i < 10; i++) {
		invasors[i] = new Invasor (80 * i, 50, app);
	}
	
}

public void run() {
	h.draw();
	
	for (int i = 0; i < 10; i++) {
		invasors[i].draw();
		invasors[i].move();
		//invasors[i].moveRight();
	}
}

}
