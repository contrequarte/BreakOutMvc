package de.openhpi.capstone1.team39.breakout.view;

import java.awt.Frame;

public class AppFrame extends Frame {
	private static final long serialVersionUID = 1L; //to keep eclipse's warnings away
	
	public AppFrame(DrawingPanel dPan, int width, int height) {
		this.setTitle("Mini BreakOut game");
		this.addWindowListener(new WindowListener());  //needed to terminate the app, when app window is closed
		this.setSize(width, height);
		this.setVisible(true);
		this.add(dPan);
	}

}
