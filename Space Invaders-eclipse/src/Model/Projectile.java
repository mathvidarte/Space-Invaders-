package Model;

import processing.core.PApplet;

public class Projectile {
	int posX;
	int posY;
	int tam;
	int vel;
	PApplet app;

	
	public Projectile (int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tam = 20;
		this.vel = 2;
		this.app = app;
	}
	
	public void shoot () {
		app.noStroke ();
		app.fill(150);
		app.ellipse(this.posX, this.posY, this.tam, this.tam);
		this.posY -= this.vel;
	}
	
	public void draw () {
		shoot();
		
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
