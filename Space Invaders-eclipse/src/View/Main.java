package View;

import processing.core.PApplet;

public class Main extends PApplet {
	
	Screen2View show;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings () {
		size (500, 500);
	}
	
	public void setup () {
		show = new Screen2View(this);
	}
	
	public void draw () {
		background (122);
		show.runView();
		
		
	}
	
	public void keyPressed () {
		show.moveView();
	}
	
	public void mousePressed () {
		
	}

}
