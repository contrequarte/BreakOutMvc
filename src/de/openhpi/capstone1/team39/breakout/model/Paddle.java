package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Paddle extends AbstractGameComponent implements IMoveable {
	
	int leftBound;
	int rightBound;
	public Paddle(int x, int y, int width, int height, Color color, int leftBoundary, int rightBoundary)	{
		super(x, y, width, height, color, true, GameComponentType.PADDLE);
		leftBound = leftBoundary;
		rightBound = rightBoundary;
	}

	@Override
	public void move(Object o) {
		//do whatever a Paddle move needs 
		
	}

	@Override
	public void moveNewXY(int newX, int newY) {
		// TODO Auto-generated method stub
		// newY isn't of any relevance for the paddle, it stays always at the same position
		//x position represents the middle of the paddle or at least nearly the middle, if paddle width is even
		
		if ((newX > ((int)(width/2) + leftBound)) && (newX > ((int)(width/2)+ rightBound)))
        {
        	xPos = newX - (int)(width/2);
	    }
	}
}
