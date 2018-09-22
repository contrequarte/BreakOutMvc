package de.openhpi.capstone1.team39.breakout.view;

import java.awt.event.MouseEvent;

public interface IMouseMoveObservable {
	void addMouseObserver(IMouseMoveObserver mouseMoveObserver);
	void removeMouseObserver(IMouseMoveObserver mouseMoveObserver);
	void notifyAllObservers(MouseEvent mouseMoveEvent);
}