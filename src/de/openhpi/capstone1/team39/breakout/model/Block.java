package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Block extends AbstractGameComponent {
	
	public Block(int x, int y, int size, Color color)	{
		super(x, y, size, size, color, true, GameComponentType.BLOCK);
	}
}