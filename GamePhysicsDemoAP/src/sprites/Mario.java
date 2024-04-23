package sprites;


import java.util.List;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	private double xVel, yVel;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
		xVel = 0;
		yVel = 0;
	}

	// METHODS
	public void walk(int dir) {
		
	}

	public void jump() {
		
	}

	public void act(List<Sprite> obstacles) {
		
		x += xVel;
		y += yVel;
		
	}


}
