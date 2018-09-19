package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;

public class Wall extends AbstractGameComponent {
	public Wall(int x, int y, int width, int height, Color color)	{
		super(x, y, width, height, color, true, GameComponentType.WALL);
	}

}
