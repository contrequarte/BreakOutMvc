package de.openhpi.capstone1.team39.breakout.model;


import java.awt.Color;
import java.util.UUID;

public abstract class AbstractGameComponent {
	int xPos;
	int yPos;
	int width;
	int height;
	Color objectColor;
	boolean isVisible;
	GameComponentType componentType;
	String identifier;
	
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
        identifier = UUID.randomUUID().toString();
        
	}
	
	public RenderData getRepaintData()
	{
		return new RenderData(xPos, yPos, width, height, objectColor, componentType);
	}
}
