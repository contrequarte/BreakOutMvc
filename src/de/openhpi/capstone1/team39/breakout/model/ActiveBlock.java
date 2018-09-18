package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class ActiveBlock extends AbstractGameComponent implements IMoveable {
	public ActiveBlock(int x, int y, int size, Color color)	{
		super(x, y, size, size, color, true, GameComponentType.BLOCK);
	}

	@Override
	public void move(Object o) {
		//do whatever a Block move needs 
		
	}
}
