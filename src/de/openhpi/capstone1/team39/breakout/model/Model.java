package de.openhpi.capstone1.team39.breakout.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Model implements IModelMouseMoveObservable {
	
	protected List<AbstractGameComponent> components;
	
	private int fieldWidth;
	private int fieldHeight;
	public static final int wallStrength = 20;
	private List<IModelMouseMoveObserver> modelMousMoveObservers;
	
	public Model(int widthOfField, int heightOfField)
	{
		components = new ArrayList<AbstractGameComponent>();
		modelMousMoveObservers = new ArrayList<IModelMouseMoveObserver>();
		fieldWidth = widthOfField;
		fieldHeight = heightOfField;
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
    	
    	//add the paddle
    	int paddleWidth = 80;
    	int paddleHeight = 10;
    	components.add(new Paddle(wallStrength + (int)(remainingFieldWith-paddleWidth)/2
	               , (int)(fieldHeight - wallStrength)
	               , paddleWidth, paddleHeight, Color.MAGENTA
	               , wallStrength, fieldWidth-wallStrength));
    	
    	// add five blocks    	
    	int blockSpace = (int)remainingFieldWith / 5;
    	int blockWidth = 160;
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
    	components.add(new Ball(50,50,50,Color.GREEN));
	}
	
	public void updateUserMouseMove(int mouseX, int mouseY)
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
	
	public int getFieldWidth()
	{
		return fieldWidth;
	}
	
	public int getFieldHeight()
	{
		return fieldHeight;
	}

	@Override
	public void addMouseObserver(IModelMouseMoveObserver modelMouseMoveObserver) {
		if (!modelMousMoveObservers.contains(modelMouseMoveObserver))
			modelMousMoveObservers.add(modelMouseMoveObserver);
	}

	
	@Override
	public void removeMouseObserver(IModelMouseMoveObserver modelMouseMoveObserver) {
		if (modelMousMoveObservers.contains(modelMouseMoveObserver))
			modelMousMoveObservers.remove(modelMouseMoveObserver);
		
	}

	@Override
	public void notifyAllModelMouseMoveObservers(int newXPos, int newYPos) {
		
		modelMousMoveObservers.forEach(mmmo->mmmo.newMouseMoveDetected(newXPos, newYPos));
		
	}	
}
