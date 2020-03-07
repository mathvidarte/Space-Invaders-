package Model;

import processing.core.PApplet;

public class Invasor extends Character {
	public Invasor (int posX, int posY, PApplet app) {
		super (posX, posY, app);
	}
	
	
	
	public void move () {
		this.posX += this.vel;
		
		if (this.posX > 470) {
			this.posY += 30;
			this.vel *= -1;
		} else if (this.posX < 0) {
			this.posY += 30;
			this.vel *= -1;
		}
	}
	
	public void draw () {
		app.noStroke();
		app.fill(0);
		app.rect(this.posX, this.posY,20,20);
	}
	
	
	//Getters and Setters

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	

}
