package jpu2016.dogfight.model;

import java.awt.Dimension;

public class Cloud {
	
	private int SPEED = 1;
	private int WIDTH = 300;
	private int HEIGHT = 150;
	
	
	private String IMAGE ="cloud";

	public Cloud(final Direction direction, final Dimension dimension) {
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
