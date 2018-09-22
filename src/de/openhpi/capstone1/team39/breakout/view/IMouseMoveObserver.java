package de.openhpi.capstone1.team39.breakout.view;

import java.awt.event.MouseEvent;

public interface IMouseMoveObserver {
	
	void mouseHasMoved(MouseEvent mmE, int toPosX, int toPosY);

}
