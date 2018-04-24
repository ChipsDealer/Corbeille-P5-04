package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{

	private int speed;
	
	
	
	private Direction direction;
	
	private Dimension dimension;
	
	private Point position;
	
	
	private Image img;
	
	private IDogfightModel dogfightModel;
	
	Color color;
	
	
	//Constructeur
	public Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed, final String Image) {
	}


	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction=direction;
	}
	
	public Point getPosition() {
		return position;
	}
	

	
	public int getSpeed() {
		return SPEED;
	}
	
	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public Boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
		
	}
	
	private void moveRight() {
		
	}
	
	private void moveDown() {
		
	}
	
	private void moveLeft() {
		
	}
	
	
	
	public Color getColor() {
		return color;
	}
	

	
	
	public Boolean hit() {
		return true;
	}
	
	public Boolean isWeapon() {
		return true;
	}
	
	public Image getImage() {
		return img;
	}


	@Override
	public jpu2016.dogfight.model.Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}


	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}


	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}


	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}








	

	
	
	
	/**********Méthode de l'interface************/
	
	



































	
	
	
	

}
