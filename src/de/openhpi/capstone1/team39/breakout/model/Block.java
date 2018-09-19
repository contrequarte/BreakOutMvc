package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Block extends AbstractGameComponent {
	
	public Block(int x, int y, int width, int height, Color color)	{
		super(x, y, width, width, color, true, GameComponentType.BLOCK);
	}
}