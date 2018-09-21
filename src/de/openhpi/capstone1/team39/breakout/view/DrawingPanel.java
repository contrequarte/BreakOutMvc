package de.openhpi.capstone1.team39.breakout.view;

import java.awt.Graphics;
import java.awt.Panel;

import de.openhpi.capstone1.team39.breakout.model.*;

public class DrawingPanel extends Panel  {
	private static final long serialVersionUID = 1L; //to keep eclipse's warnings away
	private Model myModel;	
	
	public DrawingPanel(Model model) {
		myModel = model;
	}

    public void paint(Graphics g)
    {
    	myModel.getRenderData().forEach(item->renderComponent(item, g));
    }
    
    private void renderComponent(RenderData rd, Graphics g)
    {
    	int x = rd.getRectangle().x;
    	int y = rd.getRectangle().y;   
    	int width = rd.getRectangle().width;
    	int height = rd.getRectangle().height;      
    	
		g.setColor(rd.getColor());

    	switch (rd.getGameComponentType()) {
    	case BALL:
			g.fillOval(x, y, width, height);
    		break;
    	case WALL: case BLOCK: case PADDLE:
			g.fillRect(x, y, width, height);    		
    		break;	
    	}
    }
}
