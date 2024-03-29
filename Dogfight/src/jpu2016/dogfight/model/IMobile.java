package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {
	
	//private final DogfightModel dogfightModel;
	
	public Direction getDirection();
	
	public void setDirection(Direction direction);
	
	public Point getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public Boolean isPlayer(int player);
	
	
	/*********/
	public void setDogfightModel(IDogfightModel dogfightModel);
	/*********/

	
	
	public Boolean hit();
	public Boolean isWeapon();
	
	
	

}
