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
		invasors[i] = new Invasor (70 * i, 50, app);
	}
	
}

public void run() {
	h.draw();
	
	for (int i = 0; i < 10; i++) {
		invasors[i].draw();
		invasors[i].move();
		
		
	}
	
	for (int i = 0; i < h.getProjectiles().size(); i++) {
		for (int j = 0; j < invasors.length; j++) {
			if (PApplet.dist(h.getProjectiles().get(i).getPosX(), h.getProjectiles().get(i).getPosY(), invasors[j].getPosX(),invasors[j].getPosY())< 5) {
				
				//PApplet.splice(invasors,1, j);
				h.getProjectiles().get(i).setPosX(5000);
			}
		}
	}
				
			
		
	}


public void moveHero () {
	h.keyPressed();
}

public void killInvasors () {
	/*for (int i = 0; i < h.getProjectiles().size(); i++) {
		for (int j = 0; j < invasors.length; j++) {
			if (PApplet.dist(h.getProjectiles().get(i).getPosX(), h.getProjectiles().get(i).getPosY(), invasors[j].getPosX(),invasors[j].getPosY())< 25) {
				
				PApplet.splice(invasors,1, j);
				
			}
		}
	}*/
}

}
