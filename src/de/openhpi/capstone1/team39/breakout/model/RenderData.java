package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;
import java.awt.Rectangle;

public class RenderData {
	int xPos;
	int yPos;
	int width;
	int height;
	Color objectColor;
	GameComponentType componentType;
	
	protected RenderData(int x, int y, int w, int h, Color c, GameComponentType cT)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		objectColor = c;
		componentType = cT;
	}

	public Rectangle getRectangle() {
		return new Rectangle(xPos, yPos, width, height);
	}
	
	public Color getColor() {
		return objectColor;
	}
	
	public GameComponentType getGameComponentType() {
		return componentType;
	}
}
