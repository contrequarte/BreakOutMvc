package de.openhpi.capstone1.team39.breakout.view;

import de.openhpi.capstone1.team39.breakout.model.*;

public class View {
	
	private Model theModel;
	private DrawingPanel drawingPanel;
	@SuppressWarnings("unused")
	private AppFrame appFrame;
	
	public View(Model model)
	{
		theModel = model;
		drawingPanel = new DrawingPanel(theModel);		
		appFrame = new AppFrame(drawingPanel, theModel.getFieldWidth(), theModel.getFieldHeight());

	}
	
	public void UpdateScreen()
	{
		drawingPanel.repaint();
	}

}
