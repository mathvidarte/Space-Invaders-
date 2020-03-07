package Model;

import processing.core.PApplet;

public class Invasor {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;
	
	public Invasor (int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.vel = 3;
		this.tam = 30;
		this.app = app;
		
	}
	
	public void move () {
		this.posX += this.vel;
		
		if (this.posX > 470) {
			this.posY += 30;
			this.vel *= -1;
		}
		
		if (this.posX < 0) {
			this.posY += 30;
			this.vel *= -1;
		}
	}
	
	public void drawInvasor () {
		app.noStroke();
		app.fill(0);
		app.rect(this.posX, this.posY, this.tam, this.tam);
	}

}
