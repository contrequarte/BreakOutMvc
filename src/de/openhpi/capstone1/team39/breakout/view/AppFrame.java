package de.openhpi.capstone1.team39.breakout.view;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.team39.breakout.model.Model;

public class AppFrame extends Frame implements MouseMotionListener, IMouseMoveObservable {
	private static final long serialVersionUID = 1L; //to keep eclipse's warnings away
	private DrawingPanel drawingPanel;
	
	private List<IMouseMoveObserver> mouseMoveObservers;
	
	public AppFrame(Model theModel /*,DrawingPanel dPan, int width, int height*/) {

		mouseMoveObservers = new ArrayList<IMouseMoveObserver>();
		
		this.setTitle("Mini BreakOut game");
		this.addWindowListener(new WindowListener());  //needed to terminate the app, when app window is closed

		drawingPanel = new DrawingPanel(theModel);
		drawingPanel.setPreferredSize(new Dimension(theModel.getFieldWidth(), theModel.getFieldHeight()));
		drawingPanel.addMouseMotionListener(this);

		this.add(drawingPanel);
		this.pack();
		this.setVisible(true);
	}

	public void updateFrame() {
		drawingPanel.repaint();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent mmE) {
		// TODO Auto-generated method stub
		//System.out.println("App Frame: x: " + mmE.getX() + " y: " + mmE.getY());
		notifyAllObservers(mmE);
	}

	@Override
	public void addMouseObserver(IMouseMoveObserver mouseMoveObserver) {
		if (!mouseMoveObservers.contains(mouseMoveObserver))
			mouseMoveObservers.add(mouseMoveObserver);
	}

	@Override
	public void removeMouseObserver(IMouseMoveObserver mouseMoveObserver) {
		if (mouseMoveObservers.contains(mouseMoveObserver))
			mouseMoveObservers.remove(mouseMoveObserver);
	}

	@Override
	public void notifyAllObservers(MouseEvent mmE) {
		// TODO Auto-generated method stub
		int newX = mmE.getX();
		int newY = mmE.getY();
		
		mouseMoveObservers.forEach(mmo->mmo.mouseHasMoved(mmE, newX, newY));
	}
 
}
