package de.openhpi.capstone1.team39.breakout.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.team39.breakout.model.*;

public class View implements IMouseMoveObservable, IMouseMoveObserver {
	
	private Model theModel;
	//private DrawingPanel drawingPanel;
	@SuppressWarnings("unused")
	private AppFrame appFrame;
	
	private List<IMouseMoveObserver> mouseMoveObservers;
	public View(Model model)
	{
		theModel = model;
		mouseMoveObservers = new ArrayList<IMouseMoveObserver>();
		
		//drawingPanel = new DrawingPanel(theModel);		
		//appFrame = new AppFrame(drawingPanel, theModel.getFieldWidth(), theModel.getFieldHeight());
		appFrame = new AppFrame(theModel);
		appFrame.addMouseObserver(this);
		//appFrame.addMouseMotionListener(this);
		//appFrame.setVisible(true);
		updateScreen();

	}
	
	public void updateScreen()
	{
		//drawingPanel.repaint();
		//appFrame.repaint();
		appFrame.updateFrame();
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

	@Override
	public void mouseHasMoved(MouseEvent mmE, int toPosX, int toPosY) {
		// TODO Auto-generated method stub
		notifyAllObservers(mmE);
	}

}
