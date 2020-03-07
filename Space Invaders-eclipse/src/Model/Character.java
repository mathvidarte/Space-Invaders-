package Model;

import processing.core.PApplet;

public abstract class Character {
	int posX;
	int posY;
	int tam;
	int life;
	int vel;
	PApplet app;
	
	public Character (int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 50;
		this.vel = 2;
		this.app = app;
	}
	
	//public abstract void moveRight ();
	
	//public abstract void moveLeft ();
	
	public abstract void draw ();
	
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
