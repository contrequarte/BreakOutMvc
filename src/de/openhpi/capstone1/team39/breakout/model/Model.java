package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Model {
	
	protected List<AbstractGameComponent> components;
	
	public static final  int fieldWidth = 1200;
	public static final  int fieldHeight = 800;
	public static final int wallStrength = 20;
	
	public Model()
	{
		components = new ArrayList<AbstractGameComponent>();
		
		LoadModelData();
	}
	
    private void LoadModelData()
    {
    	//could be reading from file or whatever, currently it is instantiated directly
   	
    	//add the walls
    	// wall at top
    	components.add(new Wall(0, 0, fieldWidth, wallStrength, Color.ORANGE));
    	// wall left
    	components.add(new Wall(0, wallStrength + 1
    					, wallStrength, fieldHeight-wallStrength - 1, Color.ORANGE)); 
    	// wall right
    	components.add(new Wall(fieldWidth-wallStrength, wallStrength + 1
    					, wallStrength, fieldHeight-wallStrength - 1, Color.ORANGE));
    	int remainingFieldWith = fieldWidth - 2 * wallStrength;
    	int remainingFieldHeight = fieldHeight - wallStrength;  // maybe to be corrected by paddle level too 	
    	
    	//add the ball
    	int ballSize = 25;
    	components.add(new Ball(wallStrength + (int)(remainingFieldWith-ballSize)/2
    			               , wallStrength + (int)(remainingFieldHeight-ballSize)/2
    			               , ballSize, Color.BLUE));

    	// add five blocks    	
    	int blockSpace = (int)remainingFieldWith / 5;
    	int blockWidth = 80;
    	int blockHeight = 35;
    	int blockOffset = (int)(blockSpace - blockWidth)/2;
    	int blockY = wallStrength + (int)(fieldHeight - wallStrength) / 3;
    	for(int i=0; i < 5; i++)
    	{
    		int blockX = wallStrength + i * blockSpace + blockOffset;
    				
    		components.add(new Block(blockX, blockY, blockWidth , blockHeight, Color.RED));
    	}
    }
	public void updateTimerMove(Object o)
	{
		
	}
	
	public void updateUserMove(Object o)
	{
		
	}
	
	//Providing data to be consumed by the view to paint the game
	public List<RenderData> getRenderData()
	{
		List<RenderData> resultList = new ArrayList<RenderData>();
		for(AbstractGameComponent agc : components)
		{
			resultList.add(agc.getRepaintData());
		}

		return resultList;
	}
}
