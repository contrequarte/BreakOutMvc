package de.openhpi.capstone1.team39.breakout.model;

import java.util.ArrayList;
import java.util.List;

public class GameArea {
	 public static final int WIDTH = 1200;
	 public static final int HEIGHT = 800;
     
	 List<Ball> balls = new ArrayList<Ball>();
	 List<Block> blocks = new ArrayList<Block>();
	 List<Wall> walls = new ArrayList<Wall>();	 
}
