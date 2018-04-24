package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Cloud extends Mobile{
	


	private static int SPEED = 1;
	private static int WIDTH = 300;
	private static int HEIGHT = 150;
	
	
	private static String IMAGE ="cloud";

	/*
	public Cloud(Direction direction, Dimension dimension) {
	super(direction, null, dimension, HEIGHT, IMAGE);
	
	}
	*/
	
	public Cloud(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		super(direction, position, dimension, speed, Image);
	}
	
	
	

	public int getSPEED() {
		return SPEED;
	}

	public void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public String getIMAGE() {
		return IMAGE;
	}

	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}
	
	
	

}
