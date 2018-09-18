package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Ball extends AbstractGameComponent implements IMoveable {
	public Ball(int x, int y, int size, Color color)	{
		super(x, y, size, size, color, true, GameComponentType.BALL);
	}

	@Override
	public void move(Object o) {
		//do whatever a move needs 
		
	}
		
}
