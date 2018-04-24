package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

public class Mobile implements IMobile{

	private int speed;
	
	
	//Création d'une collection de 4 objets
	private ArrayList<Image> images;


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
		return 5;
	}
	
	public int getWidth() {
		return 5;
	}

	public int getHeight() {
		return 5;
	}
	
	
	//Permet de calculer la distance parcourue
	public void move() {
		
		
		//Si ils ont parcourue la distance max ils sont détruit
		/*
		if() {
			
		} */
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
		
		
		//Retourne false tout le temps
		return false;
		
		
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
	}


}
	
	
	