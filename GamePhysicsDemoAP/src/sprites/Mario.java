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
	
	/** 
	 * Makes mario walk left or right across the window
	 * @param dir -1 for left, 1 for right
	 * 
	 * Lead coder: 
	*/
	public void walk(int dir) {
		
	}

	/** 
	 * Makes mario jump up
	 * 
	 * Lead coder: 
	 */
	public void jump() {
		
	}

	/** 
	 * Makes mario do everything that he should do without any keys being pressed
	 * (such as fall to the ground)
	 * @param obstacles Other sprites that mario could collide with
	 * 
	 * Lead coder:
	 */
	public void act(List<Sprite> obstacles) {
		
		x += xVel;
		y += yVel;
		
	}


}
