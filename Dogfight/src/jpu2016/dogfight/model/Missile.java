package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Missile extends Mobile{
	


	private static int SPEED=4;
	private static int WIDTH=30;
	private static int HEIGHT =10;
	private static int MAX_DISTANCE_TRAVEL = 1400;
	private String IMAGE ="missile";
	
	private int distanceTraveled = 0;
	
	
	public Missile(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		super(direction, position, dimension, speed, Image);
	}
	

	
	
	public static int getWidthWithADirection(Direction direction) {
		return 5;
	}
	
	public static int getHeightWithADirection(Direction direction) {
		return 5;
	}
	
	public void move() {
		
	}
	
	public Boolean isWeapon() {
		return true;
	}
	

	public static int getSPEED() {
		return SPEED;
	}

	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public static int getMAX_DISTANCE_TRAVEL() {
		return MAX_DISTANCE_TRAVEL;
	}

	public static void setMAX_DISTANCE_TRAVEL(int mAX_DISTANCE_TRAVEL) {
		MAX_DISTANCE_TRAVEL = mAX_DISTANCE_TRAVEL;
	}


	

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}




	public String getIMAGE() {
		return IMAGE;
	}




	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}
	
	

}
