package de.openhpi.capstone1.team39.breakout.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListener extends WindowAdapter {

	public WindowListener() {
		// TODO Auto-generated constructor stub
	}
    public void windowClosing(WindowEvent e)
    {
      e.getWindow().dispose();                  
      System.exit(0);                            
    }  
}