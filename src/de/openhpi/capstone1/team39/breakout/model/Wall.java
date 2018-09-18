package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Wall extends AbstractGameComponent {
	public Wall(int x, int y, int size, Color color)	{
		super(x, y, size, size, color, true, GameComponentType.WALL);
	}

}
