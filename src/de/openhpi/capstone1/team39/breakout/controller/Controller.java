package de.openhpi.capstone1.team39.breakout.controller;

import de.openhpi.capstone1.team39.breakout.view.*;
import java.awt.event.MouseEvent;

public class Controller implements IMouseMoveObserver {

	public Controller(View view)
	{
		view.addMouseObserver(this);
	}
	@Override
	public void mouseHasMoved(MouseEvent mmE, int toPosX, int toPosY) {
		// TODO Auto-generated method stub
		System.out.println("Controller: x: " + toPosX + " y: " + toPosY);
		
		
	}
	/*
	  void saySomething(String eventDescription, MouseEvent e) {
		    textArea.append(eventDescription + " (" + e.getX() + "," + e.getY()
		        + ")" + " detected on " + e.getComponent().getClass().getName()
		        + newline);
		    textArea.setCaretPosition(textArea.getDocument().getLength());
    */
}
