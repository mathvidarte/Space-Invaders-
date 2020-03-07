package Model;

import static processing.core.PConstants.UP;
import static processing.core.PConstants.RIGHT;
import static processing.core.PConstants.LEFT;

import java.util.ArrayList;

import processing.core.PApplet;

public class Hero extends Character {
	public Hero (int posX, int posY, PApplet app) {
		super (posX, posY, app);
	}
	
	ArrayList <Projectile> projectiles = new ArrayList <>();
	
	
		
	
	
	public void moveRight () {
		if (this.posX > 0 || this.posY < 450) {
			this.posX += this.vel;
		}
		
	}
	
	public void moveLeft () {
		if (this.posX > 0 || this.posY < 450) {
			this.posX -= this.vel;
		}
	
	}
	
	public void keyPressed() {
		if (app.keyCode == UP) {
			shoot();
		}
		if (app.keyCode == RIGHT) {
			moveRight();
		}
		if (app.keyCode == LEFT) {
			moveLeft();
		}
	}
	
	public void draw () {
		app.noStroke();
		app.fill(0);
		app.rect (this.posX, this.posY, this.tam, this.tam-40);
		for (int i = 0; i < projectiles.size(); i++) {
			projectiles.get(i).draw();
		}
	}
	
	public void shoot () {
		Projectile p = new Projectile (this.posX, this.posY,app);
		projectiles.add(p);
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

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public ArrayList<Projectile> getProjectiles() {
		return projectiles;
	}

	public void setProjectiles(ArrayList<Projectile> projectiles) {
		this.projectiles = projectiles;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	

}
