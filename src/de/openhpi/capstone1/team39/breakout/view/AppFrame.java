package de.openhpi.capstone1.team39.breakout.view;

import java.awt.Frame;

import de.openhpi.capstone1.team39.breakout.model.Model;

public class AppFrame extends Frame {
	private static final long serialVersionUID = 1L; //to keep eclipse's warnings away
	private DrawingPanel drawingPanel;
	public AppFrame(Model theModel /*,DrawingPanel dPan, int width, int height*/) {
		this.setTitle("Mini BreakOut game");
		this.addWindowListener(new WindowListener());  //needed to terminate the app, when app window is closed
		this.setSize(theModel.getFieldWidth(), theModel.getFieldHeight());
		drawingPanel = new DrawingPanel(theModel);
		this.add(drawingPanel);
		this.setVisible(true);
	}

	public void updateFrame() {
		drawingPanel.repaint();
	}  
}
