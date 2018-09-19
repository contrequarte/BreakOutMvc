package de.openhpi.capstone1.team39.breakout.model;


import java.awt.Color;
import java.awt.Rectangle;

public abstract class AbstractGameComponent {
	int xPos;
	int yPos;
	int width;
	int height;
	Color objectColor;
	boolean isVisible;
	GameComponentType componentType;
	
	protected AbstractGameComponent(int x, int y, int objectWidth, int objectHeight
			                      , Color color, boolean visible, GameComponentType compType )
	{
		xPos = x;
		yPos = y;
		width = objectWidth;
		height = objectHeight;
        objectColor = color;
        isVisible = visible;
        componentType = compType;
	}
	
	public Rectangle getRectangel()
	{
		return new Rectangle(xPos, yPos, width, height);
	}
	
}
