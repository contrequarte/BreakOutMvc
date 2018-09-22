package de.openhpi.capstone1.team39.breakout.model;

import java.awt.event.MouseEvent;

public interface IModelMouseMoveObservable {
	
	void addMouseObserver(IModelMouseMoveObserver modelMouseMoveObserver);
	void removeMouseObserver(IModelMouseMoveObserver modelMouseMoveObserver);
	void notifyAllModelMouseMoveObservers(int newXPos, int newYPos);
}
