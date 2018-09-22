package de.openhpi.capstone1.team39.breakout.model;

public interface IMoveable {
	/*
	 * int directionX;
	 * int directionY;
	 */

	void move(Object o);
	void moveNewXY(int newX, int newY);
}
