package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Paddle extends AbstractGameComponent implements IMoveable {
	public Paddle(int x, int y, int width, int height, Color color)	{
		super(x, y, width, height, color, true, GameComponentType.PADDLE);
	}

	@Override
	public void move(Object o) {
		//do whatever a Paddle move needs 
		
	}

}
